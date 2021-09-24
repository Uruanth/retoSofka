# BANCO PREGUNTAS



Nomenclatura versión:

a . b . c 

a = Actualización mayor.

b = Actualización menor.

c = Parche.



Nomenclatura preguntas:

CATEGORIA_SERIAL

C_5_0001

* Categoría, va de 1 a 5, donde 5 es la mas difícil.
* Número de pregunta asiganado en la Base de datos.



Nomenclatura respuestas

idPregunta_tipoRespuesta

ejemplo:

* C_5_0001_C

* C_5_0001_I

La C hace referencia a respuesta Correcta y la I a incorrecta



## Base de datos SQL

~~~sql
use sofkaReto;

create table usuarios (
id int primary key not null,
nombre varchar(255),
username varchar(255),
email varchar(255)
);

create table historial (
id_user int,
numeroIntento int,
puntaje int,
foreign key (id_user) references usuarios (id)
);


create table bancoPreguntas (
id_pregunta varchar(100) primary key not null,
pregunta varchar(255) not null,
categoriaPregunta int not null
);
use sofkareto;

create table pendientes (
id_user int,
id_categoria int,
foreign key (id_user) references usuarios (id)
);

create table bancorespuestas (
id_pregunta varchar(100),
respuesta varchar(255) not null,
tipo_respuesta varchar(1),
foreign key (id_pregunta) references bancopreguntas (id_pregunta)
);
~~~





## Correcciones 

~~~java
String r1=juego.getRespuesta1().getRespuesta();
String r2=juego.getRespuesta2().getRespuesta();
String r3=juego.getRespuesta3().getRespuesta();
String r4=juego.getRespuesta4().getRespuesta();
~~~

String r1="r1"
String r2="r2"
String r3="r3"
String r4="r4"
