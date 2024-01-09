<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"pageEncoding="ISO-8859-1"%>
 --%>
<%@ page  import = "calculosMatematicos.Calculos"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Calulos Matematicos</title>
</head>

<body>
La Suma de 5 y 7 es :<%= Calculos.metodoSuma(5, 7) %>
<br>
La Resta de 15 y 7 es :<%= Calculos.metodoResta(15, 7) %>
<br>
La Multiplicación de 5 y 7 es :<%= Calculos.metodoMultiplica(5, 7) %>
</body>


</html>