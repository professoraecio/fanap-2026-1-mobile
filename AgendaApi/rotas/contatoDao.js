const express = require('express'); // requisições
const router = express.Router(); // gerenciador de rotas
const url = require('url'); // ter acesso a url
const queryString = require('querystring'); // fazer query (filtro) na url
const mysql = require('./mysql').pool;

router.post('/create', (req, res, next) => {
    const { nome, fone, email } = req.body
    const contato = { nome, fone, email }
    mysql.getConnection((error, conn) => {
        if (error) {
            return res.status(500).send({
                error: error,
                response: null
            });
        }
        conn.query(
            'INSERT INTO contato (nome,fone,email) VALUES (?,?,?)',
            [contato.nome, contato.fone, contato.email],
            (error, resultado, field) => {
                conn.release();
                if (error) {
                    return res.status(500).send({
                        error: error,
                        response: null
                    });
                }
                res.status(201).send({
                    response: 'Contato cadastrado com sucesso',
                    id_contato: resultado.insertId
                });
            }
        )
    });
});

// http://localhost:3000/api.agenda/contato-dao/getId?id=1
router.get('/getId', (req, res, next) => {
    const reqUrl = url.parse(req.url);
    const queryParams = queryString.parse(reqUrl.query);
    const paramId = queryParams.id;
    mysql.getConnection((error, conn) => {
        if (error) {
            return res.status(500).send({
                error: error,
                response: null
            });
        }
        conn.query(
            'SELECT * FROM contato WHERE id = ?;',
            [paramId],
            (error, resultado, fields) => {
                if (error) {
                    return res.status(500).send({
                        error: error,
                        response: null
                    });
                }
                return res.status(200).send({
                    response : resultado
                });
            }
        )
    });
});

// http://localhost:3000/api.agenda/contato-dao/getAll
router.get('/getAll', (req, res, next) => {
    mysql.getConnection((error, conn) => {
        if (error) {
            return res.status(500).send({
                error: error,
                response: null
            });
        }
        conn.query(
            'SELECT * FROM contato;',
            (error, resultado, fields) => {
                if (error) {
                    return res.status(500).send({
                        error: error,
                        response: null
                    });
                }
                return res.status(200).send({
                    response : resultado
                });
            }
        )
    });
});

module.exports = router;