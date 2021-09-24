
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

<link rel="stylesheet" href="estilosJuego.css">
<title>Insert title here</title>
</head>
<body>


<%


String nombre="sfddf";
RondasPreguntas juego=new RondasPreguntas();
ArrayList<RondasPreguntas> rpj = (ArrayList<RondasPreguntas>) request.getAttribute("Preguntas");
juego=SeleccionRandom.prjuego(rpj);

System.out.println(juego);

String r1=juego.getRespuesta1().getRespuesta();
String r2=juego.getRespuesta2().getRespuesta();
String r3=juego.getRespuesta3().getRespuesta();
String r4=juego.getRespuesta4().getRespuesta();


%>


    <div class="div_general">
        <div class="div_titulo">
            <h1>Nombre Jugador </h1>
        </div>
    
        <div class="div_contenido">
            <div class="pregunta">
                <p><%=juego.getPreguntas().getPregunta()%></p>
            </div>
            <div class="respuestas">
                <p 
                class="p1" name="s"><%= r1%></p> 
                <p 
                class="p2" name="d"><%=r2%></p> 
                <p 
                class="p3" name="f"><%=r3%></p> 
                <p 
                class="p4" name="a"><%=r4%></p> 
    
            </div>
        </div>
    
        <div class="div_botones">
            <form action="">
                <input type="submit" value="FINALIZAR">
            </form>
        </div>
    </div>
	<script src="juego.js"></script>
</body>
</html>

