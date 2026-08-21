-- Criação tabela pedidos - SQL DDL

create table if not exists pedidos (
	id_pedido int auto_increment primary key,
    id_cliente int not null,
    data_pedido timestamp default current_timestamp,
    status enum('entregue', 'cancelado', 'pendente') default 'entregue',
    total_pedido decimal(10,2) not null default 0.00,
    foreign key (id_cliente) references clientes (id_cliente) on delete restrict
);