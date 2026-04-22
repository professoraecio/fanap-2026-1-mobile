const express = require('express'); // requisições
const router = express.Router(); // gerenciador de rotas
const url = require('url'); // ter acesso a url
const queryString = require('querystring'); // fazer query (filtro) na url
const mysql = require('./mysql').pool;