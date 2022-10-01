<%-- 
    Document   : porPaciente
    Created on : 30/09/2022, 7:10:40 p. m
    Author     : Dirley Puentes
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <center>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="color.css" rel="stylesheet" type="text/css"/>
        <title>Consulta por Centro de Servicio</title>
    </head>
    <body>
        <h1>Consula por Centro de Servicio(Hospital,Clinica o Centro de Salud)</h1>

        <%@page   import="logica.Pacientes"%>
        <%@page   import="logica.Doctores"%>
        <%@page   import="logica.Servicios"%>
        <%@page   import="logica.Logica"%>
        <%    
           Logica lo=new Logica();
           out.println(lo.servicio(request.getParameter("select2"))); 
        %>

    </body>
    </center>
</html>
