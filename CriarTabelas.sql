create database gubeedb;

create table Mercado(
Id int auto_increment, 
Nome varchar(30), 
primary key (Id)
);

create table Tecnologia(
Id int auto_increment,
 Nome varchar(30),
 primary key (Id)
 );
 
create table Produto(
Id int auto_increment, 
Nome varchar(255),
Descricao varchar(255),
Mercado_id int,
Tecnologia_id int,
primary key(Id),
foreign key (Tecnologia_id) references Tecnologia(Id),
foreign key (Mercado_id) references Mercado(Id)
);