create database biblioteca;
use biblioteca;

create table bibliotecario(
id bigint auto_increment primary key,
nome varchar(100) not null,
email varchar(100) not null
);

create table livro(
id bigint auto_increment primary key,
id_bibliotecario bigint not null,
titulo varchar(200) not null,
autor varchar(100) not null,
genero varchar(100) not null,
status varchar(100) not null default 'disponivel',
dataCadastro date not null,
CONSTRAINT fk_bibliotecario FOREIGN KEY (id_bibliotecario) REFERENCES bibliotecario(id)
);



insert into livro(titulo,autor,genero,status,dataCadastro) values
("rio","elis regina","terror","disponivel","03-03-12");


insert into bibliotecario (nome, email) values
("lavinia Gomes","la@gmail.com");

select* from bibliotecario;
select* from livro;