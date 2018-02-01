<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN""http://www.w3.org/TR/html4/loose.dtd">
<html>
 <head>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <title>Comenzando con Spring MVC</title>
 </head>
 <body>
 	<p>Ficha del grupo <b>${g}</b>:</p>
 	
 	<form:form method="POST" action="/showgr/update">
	    <p>
	    	<label>Introduzca datos del grupo:</label>
	     	<textarea name="datagroup" rows="4" cols="50">
			</textarea>
	    </p>
    	<input id="submit" type="submit" tabindex="5" value="Enviar">
 	</form:form>
 	
 </body>
</html>