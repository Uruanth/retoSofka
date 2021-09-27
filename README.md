# JuegoSofka

## Configuraciones iniciales 

El juego funciona conectando una base de datos MySQL en lenguaje java en un proyecto web. Debido a lo anterior y que se uso una base de datos local es necesario crear las tablas con las columnas idénticas, en el presente documento se anexa el código de crear dichas tablas.
Por tanto los pasos iniciales a seguir son:
1. Configurar atrinutos en "retoSofka.drive.IngresoBaseData.java".
2. Crear la base de datos y las tablas en la base de datos MySQL (Anexo codigo para esto).
3. Ejecutar con un servidor el archivo **"prujsp.jsp"**, el cual esta asociado a la clase **"PreguntasRespuestasPruebas.java"**, esto agregara una serie de 26 preguntas con sus respuestas asociadas a la base de datos de esta.
4. Ejecutar el JSP index.jsp con ayuda de un servidor, para ingresar al juego el unico dato obligatorio es la identificación, los otros campos pueden estar vacios.

En cuanto a que base de datos usar, se puede usar a preferencia o crear una con el mismo nombre con la que se uso en las pruebas (sofkareto).

 En el package "retoSofka.driver" se encuentra la clase llamada "IngresoBaseData.java", en esta clase se encuentran los atributos: 

~~~java
	private static String rutaBaseDatos = "jdbc:mysql://localhost:";
	private static String puerto = "3306";
	private static String nombreBaseDatos = "sofkareto";
	private static String usuarioBaseDatos = "root";
	private static String passwordBaseDatos = "admin";
	
~~~

donde "*rutaBaseDatos*" hace referencia hacia donde esta alojada la base de datos.

*"puerto"* es el puerto de salida configurado en la base de datos.

 *"nombreBaseDatos"* es el nombre de la base de datos a utilizar (donde se crearon las tablas).

*"usuarioBaseDatos"* es el usuario para el ingreso a la base de datos.

*"passwordBaseDatos"* es la contraseña para ingresar en la base de datos.



Para general las preguntas y respuestas de prueba, se tiene un archivo llamado **"prujsp.jsp"**, el cual esta asociado a la clase **"PreguntasRespuestasPruebas.java"**, el cual hace basta con ejecutar el archivo jsp en un servidor para que se generen 26 preguntas con sus respectivas respuestas asociadas. Es la única vez que se debería de ejecutar dichos archivos.

Cuando se tenga configurado el ingreso a la base de datos y se hayan agregado las preguntas y respuestas, el juego se inicia ejecutando el archivo **"index.jsp"** en un servidor.

El proyecto fue ejecutado y probado con ayuda del IDE eclipse 2021-09 y servidor (contenedor web) apache tomcat 9.0.4, con el fin de poder copilar los archivos JSP.

## Anexos

* **Codigo generar tablas**

~~~sql
create database sofkaReto;
use sofkaReto;

create table usuarios (
id int primary key not null,
nombre varchar(255),
username varchar(255),
email varchar(255),
activ int

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

Las dos primeras líneas son opcionales, se pueden remplazar usando otra base de datos, solo recordar también cambiar el nombre de la base de datos en el archivo **"IngresoBaseData.java"** 

## Aclaraciones

El repositorio original de GitHub que use con las primeras versiones se me vio afectado por un problema que un no logro corregir, por lo tanto opte por subir el proyecto y sus nuevas versiones en un nuevo repositorio, en este documento anexo el enlace del anterior repositorio como evidencia.

Repositorio anterior https://github.com/Uruanth/retoSofka.git

Repositorio actual https://github.com/Uruanth/JuegoSofka.git

## Agradecimientos

Agradezco a todo el equipo de Sofka por esta oportunidad, estoy realmente agradecido ya que con cada reto siempre puedo aprender más y crecer como persona, y mas en temas como estos que me apasionan, espero poder seguir con uds. Muchas gracias por todo !!.
