<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="javax.servlet.RequestDispatcher" %>
<%@ page import="javax.servlet.http.HttpServletRequest" %>
<%@ page import="javax.servlet.http.HttpServletResponse" %>
<%@ page import="javax.servlet.ServletException" %>
<%@ page import="javax.servlet.http.HttpServlet" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="retoSofka.driver.RondasPreguntas" %>
<%@ page import="retoSofka.driver.SeleccionRandom" %>
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
<%
System.out.println("\nresultado\n");

%>


<body>
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
        <div class="columna_tabla">
            Columna 1
        </div>
        <div class="columna_tabla">
            Columna 2
        </div>
        <div class="columna_tabla">
            <p>Lorem ipsum dolor sit, amet consectetur adipisicing elit. Rerum quasi quas voluptas veritatis dolor eaque ipsam impedit libero consequuntur assumenda aliquam exercitationem, repudiandae laborum autem eum deserunt sit quis adipisci.</p>
        </div>
        <div class="columna_tabla">
            Columna 1
        </div>
        <div class="columna_tabla">
            Columna 2
        </div>
        <div class="columna_tabla">
            Columna 3
        </div>
        <div class="columna_tabla">
            Columna 1
        </div>
        <div class="columna_tabla">
            Columna 2
        </div>
        <div class="columna_tabla">
            Columna 3
        </div>
        <div class="boton">
            <input type="submit" value="INICIO">
        </div>
        
    </div>
</body>
</html>