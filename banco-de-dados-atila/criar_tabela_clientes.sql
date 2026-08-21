-- Criação da tabela clientes - SQL - DDL
create table if not exists clientes (
	id_cliente int auto_increment primary key,
    nome varchar(100) not null,
    cpf varchar(11) not null unique,
    data_cadastro timestamp default current_timestamp
);