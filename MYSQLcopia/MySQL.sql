-- create database itau;
 use itau;

create table itau.clientes(
codigo_cliente integer not null,
nome_cliente varchar(50) not null,
idade_cliente integer(3) not null,
email_cliente varchar(80) not null,
primary key (codigo_cliente)
);
-- describe itau.clientes; para visualizar as colunas

insert into itau.clientes
(codigo_cliente,nome_cliente,idade_cliente,email_cliente)
values
(1,"Marcello Fernandes",25,"marcello.f@itau.com.br"),
(2,"William Moraes",20,"william.m@itau.com.br"),
(3,"Tiago Lopes Souza",18,"tiago.l@itau.com.br"),
(4,"Renato Campos",22,"rentato.c@itau.com.br");


select * from itau.clientes;
select nome_cliente,idade_cliente from itau.clientes order by nome_cliente;

use itau;
INSERT INTO `clientes` (`codigo_cliente`,`nome_cliente`,`idade_cliente`,`email_cliente`) VALUES (5,"Hayfa T. Bates",93,"egestas@urnanecluctus.ca"),(6,"Dora Pittman",60,"Donec.egestas.Aliquam@facilisismagnatellus.ca"),(7,"Dieter Z. Wilcox",99,"tristique.pharetra@interdumenimnon.net"),(8,"Jaquelyn X. Valenzuela",56,"sodales.at@temporlorem.edu"),(9,"Shellie Owen",93,"velit.in@FuscefeugiatLorem.com"),(10,"Colton X. Floyd",47,"consectetuer.adipiscing.elit@Donecconsectetuer.com"),(11,"Harrison Sharp",76,"congue.elit@est.edu"),(12,"Clio Holman",42,"Vivamus@nibhPhasellusnulla.com"),(13,"Olivia C. Ewing",40,"consectetuer.cursus@nonluctussit.co.uk"),(14,"Portia Donovan",92,"mauris.sagittis.placerat@Aliquamnec.ca");
INSERT INTO `clientes` (`codigo_cliente`,`nome_cliente`,`idade_cliente`,`email_cliente`) VALUES (15,"Lamar Mendoza",57,"id.ante@uterat.ca"),(16,"Georgia Flores",79,"tincidunt.vehicula@ut.com"),(17,"Jane K. Clemons",90,"pharetra.felis@erosturpisnon.org"),(18,"Illiana Carver",75,"egestas.a@convallisincursus.org"),(19,"Eaton Keller",47,"malesuada.id@sagittissemper.net"),(20,"Jane Myers",60,"sit.amet@luctusutpellentesque.net"),(21,"Patricia K. Irwin",27,"arcu.Aliquam.ultrices@incursuset.net"),(22,"Peter Hood",69,"ac@penatibus.co.uk"),(23,"Noble T. Neal",91,"magna.Praesent.interdum@urnasuscipit.net"),(24,"Karyn U. Lancaster",34,"Sed.nunc@penatibuset.edu");
INSERT INTO `clientes` (`codigo_cliente`,`nome_cliente`,`idade_cliente`,`email_cliente`) VALUES (25,"Denton Britt",24,"Maecenas.iaculis.aliquet@pretiumaliquetmetus.edu"),(26,"Rhea Lindsey",71,"Nunc.laoreet.lectus@velpede.co.uk"),(27,"Carlos O. Henson",98,"Suspendisse.tristique@vitae.com"),(28,"Maite Stephenson",62,"dui@netuset.co.uk"),(29,"Natalie Q. Armstrong",57,"sodales.purus@tinciduntnunc.com"),(30,"Buckminster X. Hamilton",81,"dolor@ornare.org"),(31,"Vladimir Moss",58,"ac.ipsum@Suspendisse.edu"),(32,"Nissim Miller",65,"ipsum.porta@Proinnislsem.ca"),(33,"Elvis Dorsey",44,"leo.elementum@vitaepurusgravida.com"),(34,"Jeremy Mccarthy",43,"vehicula@sodales.ca");
INSERT INTO `clientes` (`codigo_cliente`,`nome_cliente`,`idade_cliente`,`email_cliente`) VALUES (35,"Sylvester Hall",27,"varius@odioAliquamvulputate.net"),(36,"Pearl Tyler",25,"egestas.nunc.sed@imperdiet.org"),(37,"Tucker Bradford",23,"amet@ami.org"),(38,"Ryder J. Rivas",42,"ornare.lectus@laoreet.com"),(39,"Elmo Malone",87,"dui.Fusce@tristiquesenectus.co.uk"),(40,"Hashim Gillespie",19,"odio@dictum.edu"),(41,"Herman Campos",28,"Quisque.fringilla.euismod@nislelementum.edu"),(42,"Sawyer J. Kaufman",50,"posuere.cubilia@nisiCum.co.uk"),(43,"Ferris House",97,"mauris.ipsum@dapibusrutrumjusto.co.uk"),(44,"Irma T. Noble",91,"ipsum.non@scelerisquedui.com");
INSERT INTO `clientes` (`codigo_cliente`,`nome_cliente`,`idade_cliente`,`email_cliente`) VALUES (45,"Abigail Hobbs",52,"netus.et.malesuada@non.co.uk"),(46,"Ross U. Humphrey",27,"eleifend.egestas@nisisemsemper.org"),(47,"Rashad Rodriquez",26,"diam.Proin.dolor@augue.com"),(48,"Jenna Y. Hickman",41,"mauris@sedlibero.co.uk"),(49,"Galena Carver",51,"orci.consectetuer@aptent.ca"),(50,"Graiden Guerra",21,"et.libero.Proin@egetlacus.org"),(51,"Pearl Greer",38,"sociis@malesuadaInteger.edu"),(52,"Haley Q. Davis",47,"eu.erat.semper@facilisisnonbibendum.edu"),(53,"Helen Vance",66,"in.tempus@nibhenim.edu"),(54,"Nissim F. Hester",41,"Quisque@egestasurnajusto.com");
INSERT INTO `clientes` (`codigo_cliente`,`nome_cliente`,`idade_cliente`,`email_cliente`) VALUES (55,"Dean F. Valencia",100,"at.auctor.ullamcorper@velit.ca"),(56,"Ferdinand Hunt",56,"nisi.magna@sagittisaugue.org"),(57,"John Leach",67,"sodales.purus@urnaNullamlobortis.ca"),(58,"Candace I. Bishop",45,"nec.mauris.blandit@massa.co.uk"),(59,"Phyllis Elliott",36,"a.tortor@ultriciesdignissimlacus.org"),(60,"Fletcher T. Talley",31,"Vestibulum.ut@massalobortisultrices.org"),(61,"Fuller Lancaster",51,"ut.eros@egestas.co.uk"),(62,"Reagan A. Barnes",37,"vitae.dolor@cursuspurusNullam.ca"),(63,"Oleg Gillespie",54,"at.egestas@duinecurna.net"),(64,"Carol Wilcox",22,"risus.quis.diam@lectuspede.org");
INSERT INTO `clientes` (`codigo_cliente`,`nome_cliente`,`idade_cliente`,`email_cliente`) VALUES (65,"Blythe Potter",52,"ligula.Aenean.gravida@nulla.com"),(66,"Cedric S. Fleming",44,"Nunc.pulvinar@tellusjustosit.com"),(67,"Kamal P. Spence",68,"augue.ac@urnaetarcu.com"),(68,"Edan E. Mccormick",50,"ac.metus@dolor.net"),(69,"Alea A. Walters",79,"nec.luctus@Phasellusfermentumconvallis.ca"),(70,"Germane E. Olsen",56,"dolor.sit@velit.org"),(71,"Levi Hickman",54,"accumsan.interdum.libero@maurisMorbinon.co.uk"),(72,"Jolene W. Brooks",66,"facilisis.facilisis@turpisegestasFusce.org"),(73,"Octavia K. Noble",22,"at.nisi.Cum@imperdietnec.co.uk"),(74,"Gretchen U. Fry",34,"nec.tempus.mauris@tinciduntorci.org");
INSERT INTO `clientes` (`codigo_cliente`,`nome_cliente`,`idade_cliente`,`email_cliente`) VALUES (75,"Donna J. Ochoa",23,"tellus.non.magna@feugiatnec.edu"),(76,"Kelsey Puckett",59,"metus.facilisis@non.org"),(77,"Alexa N. Ellis",82,"et.magna.Praesent@elementum.com"),(78,"Alan W. Rios",45,"Proin.sed.turpis@purusac.org"),(79,"Hedy U. Williams",66,"cursus.Integer.mollis@ultriciesdignissim.org"),(80,"Jenna Dennis",72,"auctor@sodalesMaurisblandit.org"),(81,"Candice T. Beasley",75,"dictum.placerat@Nulla.edu"),(82,"Zia Finch",35,"Nam.ac@nequeInornare.ca"),(83,"Jerry G. Morton",41,"vitae.mauris.sit@at.org"),(84,"Marvin C. Miller",80,"eget.varius@lobortisrisusIn.co.uk");
INSERT INTO `clientes` (`codigo_cliente`,`nome_cliente`,`idade_cliente`,`email_cliente`) VALUES (85,"George V. Tanner",94,"pede@elementumduiquis.co.uk"),(86,"Charde Howe",63,"neque@non.ca"),(87,"Igor W. Keith",68,"congue.a.aliquet@facilisisfacilisismagna.co.uk"),(88,"Marsden Vaughan",66,"Phasellus.dolor.elit@vitaeodio.net"),(89,"Cameran Mayo",95,"Donec@Quisqueimperdiet.co.uk"),(90,"Haviva Y. Whitaker",20,"Duis.mi@maurissapiencursus.edu"),(91,"Medge Rhodes",40,"urna.Vivamus@odiosagittissemper.net"),(92,"Eleanor Wall",51,"in.tempus@cursus.org"),(93,"Jerry Johnston",58,"aliquet.Phasellus.fermentum@utaliquamiaculis.ca"),(94,"Forrest C. Reid",26,"libero.Donec@elementumduiquis.co.uk");
INSERT INTO `clientes` (`codigo_cliente`,`nome_cliente`,`idade_cliente`,`email_cliente`) VALUES (95,"Fuller Mcgee",78,"vehicula@sociisnatoquepenatibus.edu"),(96,"Wyoming Little",30,"Morbi@auctorquis.co.uk"),(97,"Chase Acosta",97,"parturient.montes@infelis.net"),(98,"Pascale Benson",61,"risus.Donec.nibh@et.edu"),(99,"David A. Spears",25,"Mauris.non.dui@sapien.ca"),(100,"Carl Cherry",35,"Integer.sem.elit@Craseget.ca"),(101,"Jamal Hancock",43,"Donec@dapibusquamquis.com"),(102,"Vanna M. Chambers",84,"nisl.Maecenas.malesuada@nasceturridiculusmus.edu"),(103,"Aaron Thomas",81,"semper@atvelit.edu"),(104,"Nissim R. Head",36,"eu.lacus.Quisque@liberoet.co.uk");



select * from itau.clientes where idade_cliente>=18 and idade_cliente<=30 order by idade_cliente;

select count(*) as Total_Clientes from itau.clientes where idade_cliente>=18 and idade_cliente<=30;

select * from itau.clientes where idade_cliente in (20,30,40);

select * from itau.clientes where nome_cliente like "Renato%";

-- procedimento para criar campo na tabela
alter table itau.clientes add endereco varchar(60) not null;
-- procedimento para excluir campo da tabela (perde o dado)
alter table itau.clientes drop endereco;
-- procedimento para renomear o campo da tabela
alter table itau.clientes rename column endereco to endereco_cliente;

-- procedimento para alterar a estrutura do tipo de dado  do campo na tabela. exemplo mudar para 80 tamanho.
alter table itau.clientes change endereco_cliente endereco_cliente varchar(80) not null;
describe itau.clientes;

update itau.clientes set endereco_cliente = "Rua Tito" where codigo_cliente =1;
update itau.clientes set endereco_cliente = "Atualizar o campo endereço" where codigo_cliente >=2;
update itau.clientes set endereco_cliente = "Atualizar o campo" where endereco_cliente <> "Rua Tito";

alter table itau.clientes add estado_cliente char(2) not null;
update itau.clientes set estado_cliente="SP" where idade_cliente >=18 and idade_cliente <=30;
update itau.clientes set estado_cliente="XX" where estado_cliente = '';

-- procedimento para criar o backup
create table itau.bck_clientes select * from itau.clientes;
select * from itau.bck_clientes;
select * from itau.clientes;
describe itau.bck_clientes;

-- apagando os dados da tabela
delete from itau.clientes;

-- inserindo os dados da tabela bkp
insert into itau.clientes
(codigo_cliente,nome_cliente,idade_cliente,email_cliente,endereco_cliente,estado_cliente)
select codigo_cliente,nome_cliente,idade_cliente,email_cliente,endereco_cliente,estado_cliente from itau.bck_clientes;

delete from itau.clientes where idade_cliente>=50;
insert into itau.clientes
(codigo_cliente,nome_cliente,idade_cliente,email_cliente,endereco_cliente,estado_cliente)
select codigo_cliente,nome_cliente,idade_cliente,email_cliente,endereco_cliente,estado_cliente from itau.bck_clientes where idade_cliente>=50;


create database unibanco;
create table unibanco.clientes select * from itau.clientes;
select * from unibanco.clientes;

drop table itau.clientes;
drop table itau.bck_clientes;

create table itau.clientes (
codigo_cliente int not null,
nome_cliente varchar(50) not null,
cpf_cliente char(11) not null,
endereco_cliente varchar(80) not null,
idade_cliente int(3) not null,
bairro_cliente varchar(60) not null,
estado_cliente char(2) not null,
agencia_cliente char(4) not null,
conta_corrente_cliente varchar(8) not null,
digito_verificador_cliente int(1) not null,
telefone_contato_cliente char(11) not null,
email_cliente varchar(80) not null,
data_modificacao_registro_cliente datetime,
primary key (codigo_cliente,cpf_cliente)
);

describe itau.clientes;


insert into itau.clientes
(codigo_cliente,nome_cliente,cpf_cliente,endereco_cliente,idade_cliente,bairro_cliente,estado_cliente,agencia_cliente,conta_corrente_cliente,
digito_verificador_cliente,telefone_contato_cliente,email_cliente,data_modificacao_registro_cliente)
select codigo_cliente,nome_cliente,"atualizar",endereco_cliente,idade_cliente,"atualizar",estado_cliente,"0000","000000",
0,"atualizar",email_cliente,now() from unibanco.clientes;

describe unibanco.clientes ;

select * from itau.clientes;

create table itau.controle_horas(
cod_controlador int auto_increment,
nome_funcionario varchar(50) not null,
quantidade_horas_trab int(2) not null,
valor_hora decimal(8,2) not null,
primary key (cod_controlador)
);

insert into itau.controle_horas
(nome_funcionario,quantidade_horas_trab,valor_hora)
values
("Pedro da Silva",12,10.50),
("Flamir Pereira",8,50.00),
("katia Ribeiro",12,38.50),
("Nicole Bontempo",8,8.50);


select * from itau.controle_horas;
select nome_funcionario, quantidade_horas_trab, valor_hora, (quantidade_horas_trab*valor_hora) as Valor_Salario_Dia from itau.controle_horas;

alter table itau.controle_horas add genero varchar(10);
update itau.controle_horas set genero = "Masculino" where cod_controlador in (1,2);
update itau.controle_horas set genero = "Feminino" where cod_controlador in (3,4);

select genero,sum(quantidade_horas_trab*valor_hora)as Tot_Sal_Dia from itau.controle_horas group by genero order by genero;
select idade_cliente,count(*) as Total_Cliente  from itau.clientes where idade_cliente in (20,30,40) group by idade_cliente;


use Itau;
CREATE TABLE `Produtos` (
	`Codigo_Produto` int NOT NULL AUTO_INCREMENT,
	`Nome_Produto` varchar(50) NOT NULL,
	`Valor_Produto` DECIMAL(8,2) NOT NULL,
	`Cod_Marca` int NOT NULL,
	PRIMARY KEY (`Codigo_Produto`)
);

CREATE TABLE `Marcas` (
	`Codigo_Marca` int NOT NULL AUTO_INCREMENT,
	`Nome_Marca` varchar(50) NOT NULL,
	PRIMARY KEY (`Codigo_Marca`)
);

ALTER TABLE `Produtos` ADD CONSTRAINT `Produtos_fk0` FOREIGN KEY (`Cod_Marca`) REFERENCES `Marcas`(`Codigo_Marca`);

insert into itau.marcas 
(nome_marca)
values
("Walita"),
("Brastemp"),
("Cadence");

select * from itau.marcas;
select * from itau.produtos;

insert into itau.produtos
(nome_produto,valor_produto,cod_marca)
values
("Liquidificador",89.99,1),
("Batedeira",250.00,1),
("Fogão",1350.00,2),
("Geladeira",1850.00,2),
("Microondas",450.00,2),
("Depurador Ar",380.00,1),
("Mixer",99.99,3);

select p.Nome_Produto, p.Valor_Produto,m.Nome_Marca
from itau.produtos as p,
itau.marcas as m
where p.Cod_Marca=m.Codigo_Marca;

create table itau.cargo(
cod_cargo char(2) not null,
nome_cargo varchar(50) not null,
valor_cargo decimal(8,2) not null,
primary key (cod_cargo)
);

insert into itau.cargo
(cod_cargo,nome_cargo,valor_cargo)
values
("C1","Analista de Sistemas",5250.00),
("C2","DBA Oracle",6850.00),
("C3","Gerente Administrativo",4850.00),
("C4","Estagiario",1250.00);

select * from itau.cargo;

create table itau.funcionario(
matricula int not null auto_increment,
nome_funcionario varchar(50) not null,
cod_cargo char(2) not null,
primary key (matricula),
foreign key (cod_cargo) references cargo (cod_cargo)
);

insert into itau.funcionario
(nome_funcionario,cod_cargo)
values
("Michelle M. Dias","C2"),
("Renato Campos","C1"),
("Tiago Lopes","C3"),
("Ricardo Silva","C2"),
("Ricardo Alexandre","C3")
;

select f.matricula,f.nome_funcionario,c.nome_cargo,c.valor_cargo
from itau.cargo as c
inner join itau.funcionario as f
on (f.cod_cargo=c.cod_cargo) ;

select f.matricula,f.nome_funcionario,c.nome_cargo,c.valor_cargo
from itau.cargo as c
left join itau.funcionario as f
on (f.cod_cargo=c.cod_cargo) ;

select c.nome_cargo,count(f.cod_cargo) as Total_Funcionario
from itau.cargo as c
left join itau.funcionario as f
on (f.cod_cargo=c.cod_cargo)  group by c.nome_cargo order by c.nome_cargo;


create database backup_tabelas;

use backup_tabelas;

select * from itau.marcas;
insert into itau.marcas
(nome_marca)
values
("HP"),
("LG");
