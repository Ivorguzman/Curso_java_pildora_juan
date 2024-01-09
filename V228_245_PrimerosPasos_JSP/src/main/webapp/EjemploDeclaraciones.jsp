<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ejemplo Decalaraciones</title>
</head>
<body>
<h1 style="text-align:center; color:blue"> Ejemplo de Declaraciones</h1>

<%!

 private int resultado;

 public int metodoSuma(int  num1, int num2){
	 
	 resultado=num1 + num2;
	 
	 return  resultado;
 };
 
 
 public int metodoResta(int  num1, int num2){
	 
	 resultado=num1 - num2;
	 
	 return  resultado;
 };
 
 
 public int metodoMultiplica(int  num1, int num2){
	 
	 resultado=num1 * num2;
	 
	 return  resultado;
 };
 
 
%>

El resultado de la multiplicar 2 X 3 es : <%= metodoMultiplica(2, 3) %>
<br>

El resultado de la restar 10 - 3  es : <%= metodoResta(10, 3)%>
<br>

El resultado de la sumar 2 + 3 es : <%= metodoSuma(2, 3)%>

</body>
</html>








