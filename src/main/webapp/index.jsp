<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="Normalize.css">
<link rel="stylesheet" href="estilos.css">
<title>Insert title here</title>
</head>
<body>



    <div class="div_general">
        <div class="div_encabezado">
            <h1>BIENVENIDO </h1>
        </div>

        <div class="div_contenido">
            <form action="ManejoPeticiones" method="post">
                <label for="">Nombre</label><input type="text" class="datos" name="nombre">
                <label for="">Identificación</label> <input type="number" class="datos" name="id" required>
                <label for="">Usuario</label><input type="text" class="datos" name="username">
                <label for="">Email</label><input type="email" class="datos" name="email">
                <input type="submit" name="Envial" value="Ingresar" class="enviar">    
            </form>
        </div>

        <div class="div_footer">
            <p>EL MEJOR JUEGO DE PREGUNTAS</p>
            <p>CONTACTO: PERILLA174@GMAIL.COM</p>
        </div>
    </div>
    <script src="colec.js"></script>
</body>
</html>