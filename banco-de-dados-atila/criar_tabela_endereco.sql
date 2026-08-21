--  inserir tabela endereço - SQL DML
 create table if not exists enderecos (
	id_endereco int auto_increment primary key,
    id_cliente int not null,
	logradouro varchar (120) not null,
	bairro varchar(50) not null,
    cidade varchar(50) not null,
    UF enum('SP', 'RJ', 'MG'),
    tipo enum('residencial', 'comercial'),
    foreign key (id_cliente) references clientes (id_cliente) on delete restrict
 );