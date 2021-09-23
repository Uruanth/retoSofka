<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

Tabla con el historial maximo 20 puntuaciones. <br>
inpunt prueba servlets <input type="submit" name="pru" form="pru">

<form action="TestServlet" id="pru" method="post"> 
<input type="text" name="nombre" placeholder="nombre">
<input type="text" name="id" placeholder="id">
<input type="text" name="email" placeholder="email">
<input type="text" name="username" placeholder="username">
</form>

</body>
</html>