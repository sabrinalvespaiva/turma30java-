create database db_cidade_das_frutas;
use db_cidade_das_frutas;
create table categoria (
id int auto_increment,
tipo varchar (50),
disponibilidade boolean,
primary key (id)
);
insert into categoria (tipo, disponibilidade) values ("Fruta", true);
insert into categoria (tipo, disponibilidade) values ("Verdura", true);
insert into categoria (tipo, disponibilidade) values ("Legume", true);
insert into categoria (tipo, disponibilidade) values ("Laticínios", true);
insert into categoria (tipo, disponibilidade) values ("Ovos", true);

use db_cidade_das_frutas;
create table mercadoria (
id int auto_increment,
produto varchar (50),
estoque int,
preco decimal (4,2),
mercadoria_id int,
primary key(id),
foreign key (mercadoria_id) references categoria (id)
);

insert into mercadoria (produto, estoque, preco, mercadoria_id) values ("Morango", 20, 4.99, 1);
insert into mercadoria (produto, estoque, preco, mercadoria_id) values ("Banana", 30, 8.99, 1);
insert into mercadoria (produto, estoque, preco, mercadoria_id) values ("Alface", 40, 3.99, 2);
insert into mercadoria (produto, estoque, preco, mercadoria_id) values ("Repolho", 8, 4.99, 2);
insert into mercadoria (produto, estoque, preco, mercadoria_id) values ("Berinjela", 36, 2.99, 3);
insert into mercadoria (produto, estoque, preco, mercadoria_id) values ("Quiabo", 20, 5.99, 3);
insert into mercadoria (produto, estoque, preco, mercadoria_id) values ("Queijo Fresco", 16, 9.99, 4);
insert into mercadoria (produto, estoque, preco, mercadoria_id) values ("Ovo de codorna", 10, 6.99, 5);
insert into mercadoria (produto, estoque, preco, mercadoria_id) values ("Ovo Caipira", 50, 11.99, 5);

select * from mercadoria where preco >= 8.99;

select * from mercadoria where preco between 3.00 and 60.00;

select * from mercadoria where produto like "%m%";

select * from mercadoria inner join categoria on categoria.id = mercadoria.mercadoria_id;

select * from mercadoria inner join categoria on categoria.id = mercadoria.mercadoria_id where categoria.tipo = "Ovos";


