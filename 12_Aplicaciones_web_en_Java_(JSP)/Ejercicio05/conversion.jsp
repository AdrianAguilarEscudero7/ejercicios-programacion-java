<%-- 
    Document   : conversion
    Created on : 27-feb-2017, 18:22:35
    Author     : adri
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.text.DecimalFormat;"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Conversión</title>
  </head>
  <body>
    <%
      DecimalFormat df = new DecimalFormat("###.###");
      
      if (request.getParameter("tipo").equals("euro-peseta")) {
        out.println("<input type=\"text\" value=\""
                +(df.format(Double.parseDouble(request.getParameter("cantidad"))*166.386))
                +"\" readonly> Pesetas");
      } else if (request.getParameter("tipo").equals("peseta-euro")) {
        out.println("<input type=\"text\" value=\""
                +(df.format(Double.parseDouble(request.getParameter("cantidad"))/166.386))
                +"\" readonly>€");
      }
    %>
  </body>
</html>
