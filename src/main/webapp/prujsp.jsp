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
int id=156;
ManejoPuntaje mp=new ManejoPuntaje();
mp.setId(id);
ArrayList<HistorialDTO> lista=mp.historialPuntaje();
System.out.println("lista en jsp "+lista.size());


%>
<div class="div_tabla">
        <div class="titulo_tabla">
            <h1>Titulo tabla</h1>
        </div>

        <div class="columna_tabla encabezados">
            <p>INTENTO NUMERO</p>
        </div>
        <div class="columna_tabla encabezados">
          <p>PUNTAJE</p>
        </div>
        <div class="columna_tabla encabezados">
            <p>PREMIO</p>
        </div>
        
     <%for(int i=lista.size()-1; i>lista.size()-10; i--){
	%>        

        <div class="columna_tabla">
           <%=lista.get(i).getNumeroIntento() %>
        </div>
        <div class="columna_tabla">
           <%=lista.get(i).getPuntaje() %>
        </div>
        <div class="columna_tabla">
            <%=lista.get(i).getPuntaje() %>
        </div>
<%} %>     
        
        
        <div class="boton">
            <input type="submit" value="INICIO">
        </div>
        
    </div>
    
       


    <form action="TestServlet" method="get">
    <input type="submit">
    </form>
</body>
</html>
<%

System.out.print("ya cargo");
%>