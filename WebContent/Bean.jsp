<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">



<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Page Bean jsp</title>
</head>
<body>
<% 

String nom = request.getParameter("Nom");
String pr�nom = request.getParameter("Pr�nom");
String Date_de_Naissance = request.getParameter("Date de Naissance");
String Sexe = request.getParameter("Sex");
%>

<table>

<tr><td> <% out.println("Nom :"); %> </td><td> <% out.println(nom); %> </td></tr>
<tr><td> <% out.println("Pr�nom :"); %> </td><td> <% out.println(pr�nom); %> </td></tr>
<tr><td> <% out.println("Date de Naissance :  "); %> </td><td> <% out.println(Date_de_Naissance); %> </td></tr>
<tr><td> <% out.println("Sexe :"); %> </td><td> <% out.println(Sexe); %> </td></tr>

</table>
	
</body>
</html>