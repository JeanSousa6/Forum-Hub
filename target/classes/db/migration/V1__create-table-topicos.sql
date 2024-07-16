create table topicos(
    id BIGINT NOT NULL auto_increment,
    titulo VARCHAR(100) NOT NULL,
    mensagem TEXT,
    data_de_criacao DATETIME NOT NULL,
    estado_topico TINYINT(1) DEFAULT 1,
    autor VARCHAR(20) NOT NULL,
    curso VARCHAR(20) NOT NULL,

    PRIMARY KEY(id)
);