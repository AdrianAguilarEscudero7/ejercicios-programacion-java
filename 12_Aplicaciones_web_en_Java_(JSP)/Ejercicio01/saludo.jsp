<%-- 
    Document   : saludo
    Created on : 23-feb-2017, 23:57:39
    Author     : adri
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio01</title>
    </head>
    <body>
        <% request.setCharacterEncoding("UTF-8"); %>
        Hola <%= request.getParameter("nombre") %>
    </body>
</html>
