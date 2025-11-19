CREATE TABLE IF NOT EXISTS usuario (
    id SERIAL PRIMARY KEY,
    usuario VARCHAR(50) NOT NULL UNIQUE,
    senha VARCHAR(100) NOT NULL
);

CREATE TABLE IF NOT EXISTS produto (
    codigo SERIAL PRIMARY KEY,
    descricao VARCHAR(100),
    validade DATE,
    ean VARCHAR(30),
    ativo BOOLEAN,
    preco NUMERIC(10,2)
);