create database Aula01
default character set utf8
default collate utf8_general_ci;
use aula01;
create table pais (
id int auto_increment,
nome varchar(100),
populacao bigint,
area numeric(15.2),
primary key (id)
) default charset = utf8;


insert into pais
(nome, populacao, area)
values
('Brasil', '210147125', '8515000'),
('Japão', '126440000', '377900'),
('Espanha', '46524943', '504000'),
('França', '67348000', '543000'),
('Portugal', '10560000', '92200');
describe pais;
select * from pais;


