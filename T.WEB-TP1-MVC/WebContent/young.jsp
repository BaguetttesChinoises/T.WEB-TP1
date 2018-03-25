<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="person" scope="request" type="lab.mvc.model.Person"/>
<p><%=person%> ; </p>

<jsp:getProperty property="Nom" name="person"/>
<%-- <jsp:getProperty property="Prénom" name="person"/> --%>
<%-- <jsp:getProperty property="Date_de_Naissance" name="person"/> --%>
<%-- <jsp:getProperty property="Sex" name="person"/> --%>

</body>
</html>