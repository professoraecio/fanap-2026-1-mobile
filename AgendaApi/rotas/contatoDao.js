const express = require('express'); // requisições
const router = express.Router(); // gerenciador de rotas
const url = require('url'); // ter acesso a url
const queryString = require('querystring'); // fazer query (filtro) na url
const mysql = require('./mysql').pool;

router.post('/create',(req,res,next) => {
    const {nome,fone,email} = req.body
    const contato = {nome,fone,email} 
    mysql.getConnection((error,conn)=>{
        if(error){
            return res.status(500).send({
                error : error,
                response : null
            });
        }
        conn.query(
            'INSERT INTO contato (nome,fone,email) VALUES (?,?,?)',
            [contato.nome,contato.fone,contato.email],
            (error,resultado,field) => {
                conn.release();
                if(error){
                    return res.status(500).send({
                        error : error,
                        response : null
                    });
                }
                res.status(201).send({
                    response : 'Contato cadastrado com sucesso',
                    id_contato: resultado.insertId
                });
            }
        )
    });
});