<%-- 
    Document   : porPaciente
    Created on : 30/09/2022, 7:10:40 p. m.
    Author     : Dirley Puentes
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <center>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="color.css" rel="stylesheet" type="text/css"/>
        
        <title>Consulta por Doctor</title>
    </head>
    <body>
        <h1>Consula por Doctor</h1>

        <%@page   import="logica.Pacientes"%>
        <%@page   import="logica.Doctores"%>
        <%@page   import="logica.Servicios"%>
        <%@page   import="logica.Logica"%>
        <%    
           Logica lo=new Logica();
           out.println(lo.doctor(request.getParameter("select1"))); 
        %>

    </body>
    </center>
</html>