<%-- 
    Document   : add Client Form
    Created on : Mar 15, 2012
    Author     : diego@diegosousa.com, www.diegosousa.com
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add CLient Form</title>
</head>
<body>

  <font size="5">Add Client Form</font><br />
  <br />  
	<form action="addclientform" method="post">
		Cliente: <input type="text" name="cliente" /><br /> 
		Banco: <input type="text" name="banco" /><br /> 
		FechaNacimiento: <input type="text" name="fecha" /><br /> 
		Numero: <input type="text" name="numero" /><br /> 
		Numero seguridad: <input type="text" name="numeroSeguridad" /><br />
		<br /> 		
	  <input type="submit" value="Add Client" />				
	</form>				
	<form name="return" action="menuclient.jsp" method='post'>
    <input type='submit' value='Return Menu Client'/>
  </form>
  <form name="return" action="home.jsp" method='post'>
    <input type='submit' value='Return Home'/>
  </form>
  
</body>
</html>