<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ejemplo de scriptle</title>
</head>
<body>

<h1 style="text-align:center; color:red"> Ejemplo de scriptle</h1>

<% 

for(int i=0; i<=10; i++){
	
	out.print("Este es el mensaje en salida por el navegador numero  con CICLO FOR()" + i);
	
	out.print("<br>");
	
	};
	
	
	out.print("<br>");
	out.print("<br>");
	out.print("<br>");
	
	
int i=0;
while( i<=10 ) {
	
	out.print("Este es el mensaje en salida por el navegador numero CON CICLO WHILE() "+ i );
	
	out.print("<br>");	
	
	i++;
};

%>

</body>
</html>