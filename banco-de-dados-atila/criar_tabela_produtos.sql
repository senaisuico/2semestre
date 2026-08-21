-- Criação da tabela de produtos - SQL - DDL
create table if not exists produtos (
	id_produto int auto_increment primary key,
    nome varchar(100) not null,
    descricao text,
    preco decimal(6,2) not null,
    estoque int not null default 0,
    data_cadastro timestamp default current_timestamp,
    id_cliente int,
    foreign key (id_cliente) references clientes (id_cliente)
);