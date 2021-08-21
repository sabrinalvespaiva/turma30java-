create database db_pizzaria_legal;
use db_pizzaria_legal;

create table tb_categoria (
id_categoria bigint(10) auto_increment,
doce varchar (10) not null,
salgada varchar (10) not null,
tamanho char (1) not null,
primary key (id_categoria)
);

create table tb_pizza (
id_pizza bigint(10) auto_increment,
sabor varchar (20) not null,
preco decimal (5) not null,
bordarecheada boolean,
categoria_pizza bigint (10) not null,
primary key(id_pizza),
foreign key (categoria_pizza) references tb_categoria(id_categoria)
)

insert into tb_categoria (doce, salgada, tamanho) values ("Pizza Doce", "Salgada", 'G');
insert into tb_categoria (doce, salgada, tamanho) values ("Pizza Doce", "Salgada", 'M');
insert into tb_categoria (doce, salgada, tamanho) values ("Pizza Doce", "Salgada", 'P');

insert into tb_pizza (sabor, preco, bordarecheada, categoria_pizza) values ("Prestigio", 50.00, true, 1);
insert into tb_pizza (sabor, preco, bordarecheada, categoria_pizza) values ("Romeu & Julieta", 45.00, false, 2);
insert into tb_pizza (sabor, preco, bordarecheada, categoria_pizza) values ("Mussarela", 28.00, true, 3);
insert into tb_pizza (sabor, preco, bordarecheada, categoria_pizza) values ("Calabresa", 28.00, true, 3);

select * from tb_pizza;
select * from tb_categoria;
/*insert into tb_pizza (sabor, preco, bordarecheada, categoria_pizza) values ("Marguerita", 38.00, true, 2);
insert into tb_pizza (sabor, preco, bordarecheada, categoria_pizza) values ("Pepperoni", 60.00, false, 1);
insert into tb_pizza (sabor, preco, bordarecheada, categoria_pizza) values ("Frango c/ catupiry", 46.00, true, );
insert into tb_pizza (sabor, preco, bordarecheada, categoria_pizza) values ("Vegetariana", 65.00, false, 8);*/

select * from tb_pizza where preco >= 45.00;

SELECT * FROM tb_pizza WHERE tb_pizza.sabor LIKE "%C%";

SELECT * FROM tb_pizza
	INNER JOIN tb_categoria ON tb_categoria.id_categoria = tb_pizza.categoria_pizza;
   
SELECT * FROM tb_pizza
	INNER JOIN tb_categoria ON tb_categoria.id_categoria = tb_pizza.categoria_pizza
    WHERE tb_pizza.sabor = "doce";

 