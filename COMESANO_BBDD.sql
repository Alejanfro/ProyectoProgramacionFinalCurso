
create database COMESANO;

USE COMESANO;

create table Alimento (
nombre character(20) primary key,
nivel character(20),
grupo character(20),
energia int,
grasas int,
proteinas int,
carbohidratos int,
sal float,
azucar float,
grasaSaturadas int,
fibra int
);


select * from Alimento;
delete from Alimento where nombre='galletas avena';


insert into Alimento values("castaña", "alto", 3, 213, 2, 2, 46, 0, 11, 0,8);
insert into Alimento values("anacardos", "alto", 3, 553, 44, 18, 33, 0, 6, 0, 3);
insert into Alimento values("piastachos", "alto", 3, 557, 44, 21, 28, 0, 8, 0, 10);
insert into Alimento values("cacahuetes", "alto", 3, 567, 49, 26, 16, 0, 4, 0, 8);
insert into Alimento values("almendras", "alto", 3, 575, 49, 21, 22, 0, 4, 0, 12);
insert into Alimento values("avellanas", "alto", 3, 628, 61, 15, 17, 0, 4, 0, 15);
insert into Alimento values("nueces", "alto", 3, 654, 65, 15, 14, 0, 3, 0, 15);
insert into Alimento values("nueces de Brasil", "alto", 3, 656, 66, 14, 12, 0, 8, 0, 14);
insert into Alimento values("piñones", "alto", 3, 673, 68, 14, 13, 0, 4, 0, 14);
insert into Alimento values("macadania", "alto", 3, 767, 80, 8, 4, 0, 2, 0, 3);
insert into Alimento values("yoghourt azucarado", "bajo", 1, 81, 2, 3, 13, 0, 12, 1, 0);
insert into Alimento values("leche de almendras", "bajo", 1, 24, 1, 0, 3, 0.13, 3, 0, 0);
insert into Alimento values("mantequilla", "alto", 7, 214, 20, 0, 8, 0.5, 3, 13, 0);
insert into Alimento values("leche desnatada", "bajo", 1, 34, 0, 3, 5, 0.10, 5, 0, 0);
insert into Alimento values("yoghourt griego", "bajo", 1, 123, 10, 4, 4, 0.10, 4, 6, 0);
insert into Alimento values("leche entera", "bajo", 1, 63, 4, 3, 5, 0.10, 4.6, 3, 0);
insert into Alimento values("leche semidesnatada", "bajo", 1, 46, 2, 3, 5, 0.12, 5, 1, 0);
insert into Alimento values("patata cruda", "bajo", 3, 60, 1, 2, 12, 0, 2, 0, 2);
insert into Alimento values("lentejas crudas", "alto", 3, 281, 2, 23, 23, 0, 3, 0, 0);
insert into Alimento values("mermelada", "alto", 5, 766, 0, 1, 44, 0, 43, 0, 1);
insert into Alimento values("melocoton almibar", "bajo", 5, 74, 0, 1, 18, 0, 16, 0, 0);
insert into Alimento values("espagueti integral", "alto", 6, 350, 3, 13, 66, 0.01, 3.5, 1, 7);
insert into Alimento values("macarrones integr", "alto", 6, 346, 2, 12, 66, 0.03, 3, 1, 8);
insert into Alimento values("couscous", "alto", 6, 342, 2, 14, 68, 0.08, 2, 0, 0);
insert into Alimento values("pasta al huevo", "alto", 6, 346, 3, 13, 67, 0.2, 3.5, 1, 3);
insert into Alimento values("pasta fresca", "alto", 6, 292, 8, 10, 43, 1.25, 5.7, 4, 1);
insert into Alimento values("aceite no/azucar", "alto", 7, 900, 100, 0, 0, 0, 0, 16, 0);
insert into Alimento values("palomitas", "alto", 6, 517, 27, 6, 63, 1.1, 3.5, 3, 1);
insert into Alimento values("patatas snack", "alto", 3, 532, 34, 7, 49, 1.8, 1.9, 16, 4);
insert into Alimento values("patatas light", "alto", 3, 453, 17, 5, 69, 2.25, 0.4, 2, 0);
insert into Alimento values("arroz", "alto", 6, 342, 1, 7, 74, 0.1, 0.3, 0, 4);
insert into Alimento values("atun lata/natu", "bajo", 2, 106, 2, 23, 0, 0.8, 0, 0, 0);
insert into Alimento values("sardina lata/oli", "alto", 2, 305, 25, 20, 0, 1, 0, 5, 0);
insert into Alimento values("atun lata/oli", "alto", 2, 198, 10, 27, 0, 1.3, 0, 2, 0);
insert into Alimento values("flan", "bajo", 1, 100, 1, 3, 20, 0.1, 17, 1, 0);
insert into Alimento values("mantequilla light", "alto", 7, 373, 40, 2, 0, 1.5, 0, 27, 1);
insert into Alimento values("margarina", "alto", 7, 538, 60, 0, 1, 0.2, 0.5, 45, 0);
insert into Alimento values("pan hamburguesa", "alto", 6, 279, 5, 9, 48, 1.3, 2.9, 3, 3);
insert into Alimento values("pan molde/int", "alto", 6, 248, 3, 10, 44, 1.4, 3, 2, 6);
insert into Alimento values("pan molde/blanco", "alto", 6, 255, 2, 10, 49, 1.3, 5.1, 1, 3);
insert into Alimento values("galletas int", "alto", 6, 439, 13, 10, 70, 1.25, 19, 10, 4);
insert into Alimento values("Nesquik", "alto", 5, 383, 4, 5, 80, 0.3, 76, 2, 7);
insert into Alimento values("colacao", "alto", 5, 376, 3, 7, 78, 0.1, 70, 2, 8);
insert into Alimento values("cafe", "alto", 5, 315, 13, 14, 7, 0, 0, 6, 58);
insert into Alimento values("cebolla", "bajo", 4, 23, 0, 2, 4, 0, 0, 0, 0);
insert into Alimento values("lechuga", "bajo", 4, 17, 0, 2, 2, 0, 0, 0, 0);
insert into Alimento values("pimiento", "bajo", 4, 23, 0, 1, 4, 0, 0, 0, 0);
insert into Alimento values("zanahoria", "bajo", 4, 40, 0, 1, 7, 0, 0, 0, 0);
insert into Alimento values("fresa", "bajo", 5, 40, 0, 1, 7, 0, 0, 0, 0);
insert into Alimento values("manzana", "bajo", 5, 53, 0, 0, 12, 0, 0, 0, 0);
insert into Alimento values("melon", "bajo", 5, 28, 0, 1, 6, 0, 0, 0, 0);
insert into Alimento values("naranja", "bajo", 5, 42, 0, 1, 9, 0, 0, 0, 0);
insert into Alimento values("pera", "bajo", 5, 49, 0, 1, 11, 0, 0, 0, 0);
insert into Alimento values("platanao", "bajo", 5, 94, 0, 1, 20, 0, 0, 0, 0);
insert into Alimento values("chocolate negro", "alto", 7, 593, 47, 6, 34, 0, 30, 30, 0);
insert into Alimento values("chocolate almendra", "alto", 7, 567, 39, 11, 41, 0.3, 40, 16, 0);
insert into Alimento values("chocolate leche", "alto", 7, 542, 31, 6, 59, 0.2, 58, 18, 2);
insert into Alimento values("pollo filete", "bajo", 2, 99, 1, 22, 1, 0.4, 1, 0,0);
insert into Alimento values("ternera hambur", "alto", 2, 182, 13, 15, 1, 1.2, 1, 6,0);
insert into Alimento values("pavo pechuga", "bajo", 2, 93, 1, 20, 1, 0.6, 1, 0, 0);
insert into Alimento values("pavo lonchas", "bajo", 2, 77, 1, 15, 3, 1, 1.5, 0, 0);
insert into Alimento values("pavo adobado", "bajo", 2, 100, 2, 14, 7, 2.5, 1.5, 1, 0);
insert into Alimento values("cerdo aguja", "alto", 2, 151, 14, 19, 1, 0.2, 1, 7, 0);
insert into Alimento values("cerdo solomillo", "alto", 2, 246, 20, 16, 0, 0, 0, 0, 0);
insert into Alimento values("cerdo ", "alto", 2, 151, 6, 24, 1, 0, 0.7, 4, 0);
insert into Alimento values("cerdo secreto", "alto", 2, 246, 20, 16, 0, 0, 0, 4, 0);
insert into Alimento values("cerdo escalpin", "bajo", 2, 129, 6, 19, 1, 2, 0.5, 5, 0);
insert into Alimento values("cerdo lomo", "bajo", 2, 149, 6, 24, 1, 0, 1, 4, 0);
insert into Alimento values("pollo alitas", "bajo", 2, 112, 4, 20, 1, 0.8, 1, 1, 0);
insert into Alimento values("ternera escalopines", "bajo", 2, 117, 3, 23, 1, 0.3, 1, 1, 0);
insert into Alimento values("pollo asado", "alto", 2, 197, 11, 24, 0, 1, 0, 3, 0);
insert into Alimento values("jamon cocido", "bajo", 2, 92, 3, 18, 2, 0.8, 1, 1, 0);
insert into Alimento values("salchichon", "alto", 2, 377, 27, 31, 2, 2.3, 2.1, 5, 0);
insert into Alimento values("fuet", "alto", 2, 480, 42, 24, 2, 0, 1.5, 15, 4);
insert into Alimento values("queso fresco/0", "bajo", 1, 66, 0, 12, 4, 0.9, 3.8, 0, 0);
insert into Alimento values("queso lonchas", "alto", 1, 390, 33, 22, 1, 1.5, 1, 22, 0);
insert into Alimento values("queso tierno", "alto", 1, 374, 31, 21, 2, 0.9, 1.6, 21, 0);
insert into Alimento values("salmon", "alto", 2, 194, 13, 20, 1, 2.8, 1, 3, 0);
insert into Alimento values("galletas avena", "alto", 6, 483, 22, 7, 22, 1, 22, 10, 7);
insert into Alimento values("natillas", "bajo", 1, 137, 4, 3, 23, 0.17, 18, 2, 0);



commit;

/*	Nombre | Nivel | Grupo | Energia | Grasa | Proteinas |carbohidratos | Sal | Azucar | grasaSaturadas | Fibra */



























