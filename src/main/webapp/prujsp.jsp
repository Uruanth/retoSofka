<%@page import="retoSofka.driver.ManejoPuntaje"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="javax.servlet.RequestDispatcher" %>
<%@ page import="javax.servlet.http.HttpServletRequest" %>
<%@ page import="javax.servlet.http.HttpServletResponse" %>
<%@ page import="javax.servlet.ServletException" %>
<%@ page import="javax.servlet.http.HttpServlet" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="retoSofka.driver.ManejoPuntaje" %>
<%@ page import="retoSofka.driver.PreguntasRespuestasPruebas" %>
<%@ page import="retoSofka.model.HistorialDTO" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="Normalize.css">
<link rel="stylesheet" href="estiloResultados.css">
<title>Insert title here</title>
</head>
<body>
 <%
 PreguntasRespuestasPruebas inBD=new PreguntasRespuestasPruebas();
 inBD.iniciarBD();
 %>

<h1>YA SE CARGO LA BASE DE DATOS</h1>
    
</body>
</html>
<%

System.out.print("ya cargo");
%>