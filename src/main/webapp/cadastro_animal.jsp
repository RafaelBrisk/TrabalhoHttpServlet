<%@taglib uri="https://journaldev.com/jsp/tlds/gravarBotaoTag" prefix="ct" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de Animal</title>
</head>
	<body>
	
		<form action="animal" method="POST">
		
			<div style="display: flex; flex-direction: column; margin-bottom: 10px;">
				<label>Nome</label>
				<input autocomplete="off" type="text" name="nome" style="width: 200px" />
			</div>
			
			<div style="display: flex; flex-direction: column; margin-bottom: 10px;">
				<label>Raça</label>
				<input autocomplete="off" type="text" name="raca" style="width: 200px" />
			</div>
			
			<div style="display: flex; flex-direction: column; margin-bottom: 10px;">
				<label>Tipo</label>
				<input autocomplete="off" type="text" name="tipo" style="width: 200px" />
			</div>
			
			<ct:gravarBotaoTag texto="TEste"></ct:gravarBotaoTag>
		</form>
	
	</body>
</html>