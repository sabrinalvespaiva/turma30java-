create database db_farmacia_do_bem;
use db_farmacia_do_bem;
create table tb_categoria(
id bigint auto_increment,
tipo varchar (50),
ativo boolean,
primary key(id)
);
insert into tb_categoria (tipo, ativo) value ("Antibiotico", true);
insert into tb_categoria (tipo, ativo) value ("Anti-inflamatorio", true);
insert into tb_categoria (tipo, ativo) value ("Tarja preta", true);
insert into tb_categoria (tipo, ativo) value ("Analgesico", true);
insert into tb_categoria (tipo, ativo) value ("Cosméticos", true);

use db_farmacia_do_bem;
create table tb_produto(
id bigint auto_increment,
nome varchar (50),
laboratorio varchar (50),
preco decimal (10,2),
validade decimal (6,4),
categoria_id bigint,
primary key (id),
foreign key (categoria_id) references tb_categoria (id)
);

insert into tb_produto (nome, laboratorio, preco, validade, categoria_id) values ("Amoxicilina", "Nova Quimica", 28.00, 09.2022, 1);
insert into tb_produto (nome, laboratorio, preco, validade, categoria_id) values ("Dipirona", "EMS", 3.00, 11.2023, 4);
insert into tb_produto (nome, laboratorio, preco, validade, categoria_id) values ("Desodorante", "Unilever", 5.00, 12.2022, 5);
insert into tb_produto (nome, laboratorio, preco, validade, categoria_id) values ("Rivotril", "Roche", 70.00, 02.2022, 3);
insert into tb_produto (nome, laboratorio, preco, validade, categoria_id) values ("Descongex Plus", "Aché", 15.00, 09.2023, 2);
insert into tb_produto (nome, laboratorio, preco, validade, categoria_id) values ("Paracetamol", "EMS", 5.00, 09.2024, 4);
insert into tb_produto (nome, laboratorio, preco, validade, categoria_id) values ("Cefalexina", "Nova Quimica", 45.00, 12.2021, 1);
insert into tb_produto (nome, laboratorio, preco, validade, categoria_id) values ("Diazepam", "Roche", 80.00, 06.2023, 3);

 -- SELECIONA PRODUTOS COM PRECO MAIOR QUE $50
 select * from tb_produto where preco > 50.00;
 
 -- SELECIONA PRODUTOS COM PRECO ENTRE $3 E $60
 select * from tb_produto where preco >= 3.00 and preco <= 60.00;
 
 -- SELECIONA PRODUTOS COM A LETRA D
 select * from tb_produto where nome like "%d%";
 
-- RELACIONA AS DUAS TABELAS E MOSTRA APENAS ALGUMAS COLUNAS 
select tb_produto.nome, tb_produto.preco, tb_produto.validade, tb_categoria.tipo from tb_produto 
inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id;

-- RELACIONA AS DUAS TABELAS
select * from tb_produto 
inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id;

-- SELECIONA PRODUTOS DO MESMO TIPO
select * from tb_produto 
inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id where tb_categoria.tipo = "Antibiotico"


 
 



