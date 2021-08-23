create database db_construindo_a_nossa_vida;
use db_construindo_a_nossa_vida;
create table categoria (
id int auto_increment,
tipo varchar (50),
disponibilidade boolean,
primary key (id)
);
insert into categoria (tipo, disponibilidade) values ("Tintas", true);
insert into categoria (tipo, disponibilidade) values ("Pisos", true);
insert into categoria (tipo, disponibilidade) values ("Portas", true);
insert into categoria (tipo, disponibilidade) values ("Janelas", true);
insert into categoria (tipo, disponibilidade) values ("Banheiro", true);

use db_construindo_a_nossa_vida;
create table mercadoria (
id int auto_increment,
produto varchar (50),
estoque int,
preco decimal (4,2),
mercadoria_id int,
primary key(id),
foreign key (mercadoria_id) references categoria (id)
);

insert into mercadoria (produto, estoque, preco, mercadoria_id) values ("Tinta Branca", 20, 49.99, 1);
insert into mercadoria (produto, estoque, preco, mercadoria_id) values ("Tinta Azul", 30, 45.99, 1);
insert into mercadoria (produto, estoque, preco, mercadoria_id) values ("Porcelanato Branco", 40, 89.99, 2);
insert into mercadoria (produto, estoque, preco, mercadoria_id) values ("Porcelanato Estampado", 8, 79.99, 2);
insert into mercadoria (produto, estoque, preco, mercadoria_id) values ("Porta de Madeira", 36, 99.99, 3);
insert into mercadoria (produto, estoque, preco, mercadoria_id) values ("Porta de Vidro", 20, 99.99, 3);
insert into mercadoria (produto, estoque, preco, mercadoria_id) values ("Janela de Correr", 16, 49.99, 4);
insert into mercadoria (produto, estoque, preco, mercadoria_id) values ("Pia de Banheiro", 10, 99.99, 5);
insert into mercadoria (produto, estoque, preco, mercadoria_id) values ("Espelho de Banheiro", 50, 89.99, 5);

select * from mercadoria where preco >= 8.99;

select * from mercadoria where preco between 3.00 and 60.00;

select * from mercadoria where produto like "%t%";

select * from mercadoria inner join categoria on categoria.id = mercadoria.mercadoria_id;

select * from mercadoria inner join categoria on categoria.id = mercadoria.mercadoria_id where categoria.tipo = "Portas";
