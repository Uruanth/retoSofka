<%@page import="retoSofka.model.UsuarioDAO"%>
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
<%@ page import="retoSofka.model.UsuarioDAO" %>

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
	ManejoPuntaje mp=new ManejoPuntaje();
	ArrayList<HistorialDTO> lista=mp.lista();

%>

<div class="div_tabla">
        <div class="titulo_tabla">
            <h1></h1>
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
        
     <%
     int taLista=lista.size();
     int cont=0;
     while(taLista > 0 && cont<10){
    	 
	%>        

        <div class="columna_tabla">
           <%=lista.get(taLista-1).getNumeroIntento() %>
        </div>
        <div class="columna_tabla">
           <%=lista.get(taLista-1).getPuntaje()-2%>
        </div>
        <div class="columna_tabla">
            <%=lista.get(taLista-1).getPuntaje() %>
        </div>
    
  <%
  taLista--;
  cont++;
     }
  %>      
        
        <div class="boton">
            <input type="submit" value="enviar" onclick = "location='./index.jsp'"/>
        </div>
        
    </div>
    
</body>
</html>
