<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ninja Gold Game</title>
</head>
<body>
	<h1>Your gold: ${gold}</h1>
	<form action="/process_money" method="post">
		Farm
		<input type="hidden" name="building" value="farm" />
		<input type="submit" value="Find Gold!"/>
	</form>
	<form action="/process_money" method="post">
		Cave
		<input type="hidden" name="building" value="cave" />
		<input type="submit" value="Find Gold!"/>
	</form>
	<form action="/process_money" method="post">
		House
		<input type="hidden" name="building" value="house" />
	<input type="submit" value="Find Gold!"/>
	</form>
	<form action="/process_money" method="post">
		Casino
		<input type="hidden" name="building" value="casino" />
		<input type="submit" value="Find Gold!"/>
	</form>
</body>
</html>