-- Criação tabela itens_pedido - SQL DDL
create table if not exists itens_pedido (
	id_item int auto_increment primary key,
    id_pedido int not null,
    id_produto int not null,
    qtde int not null,
    preco_unitario decimal(10,2) not null,
    foreign key (id_pedido) references pedidos(id_pedido) on delete cascade, 
    foreign key(id_produto) references produtos(id_produto) on delete cascade
);