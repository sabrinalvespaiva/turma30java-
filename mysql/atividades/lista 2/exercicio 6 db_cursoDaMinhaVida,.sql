create database db_cursoDaMinhaVida;
use db_cursoDaMinhaVida;
create table categoria (
id int auto_increment,
tipo varchar (50),
disponibilidade boolean,
primary key (id)
);
insert into categoria (tipo, disponibilidade) values ("Java", true);
insert into categoria (tipo, disponibilidade) values ("Banco de dados", true);
insert into categoria (tipo, disponibilidade) values ("PHP", true);
insert into categoria (tipo, disponibilidade) values ("Spring", true);
insert into categoria (tipo, disponibilidade) values ("CSS", true);

use db_cursoDaMinhaVida;
create table mercadoria (
id int auto_increment,
produto varchar (50),
estoque int,
preco decimal (4,2),
mercadoria_id int,
primary key(id),
foreign key (mercadoria_id) references categoria (id)
);

insert into mercadoria (produto, estoque, preco, mercadoria_id) values ("Curso Java I", 20, 49.99, 1);
insert into mercadoria (produto, estoque, preco, mercadoria_id) values ("Curso Java II", 30, 69.99, 1);
insert into mercadoria (produto, estoque, preco, mercadoria_id) values ("Curso MySQL", 40, 89.99, 2);
insert into mercadoria (produto, estoque, preco, mercadoria_id) values ("Curso Java III", 8, 79.99, 1);
insert into mercadoria (produto, estoque, preco, mercadoria_id) values ("Curso PHP I", 36, 59.99, 3);
insert into mercadoria (produto, estoque, preco, mercadoria_id) values ("Curso PHP II", 20, 99.99, 3);
insert into mercadoria (produto, estoque, preco, mercadoria_id) values ("Curso Spring", 16, 19.99, 4);
insert into mercadoria (produto, estoque, preco, mercadoria_id) values ("Curso CSS I", 10, 89.99, 5);
insert into mercadoria (produto, estoque, preco, mercadoria_id) values ("Curso CSS II", 50, 99.99, 5);

select * from mercadoria where preco >= 50.00;

select * from mercadoria where preco between 3.00 and 60.00;

select * from mercadoria where produto like "%j%";

select * from mercadoria inner join categoria on categoria.id = mercadoria.mercadoria_id;

select * from mercadoria inner join categoria on categoria.id = mercadoria.mercadoria_id where categoria.tipo = "Java";