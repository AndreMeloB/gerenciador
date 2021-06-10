
<%
String nomeEmpresa = (String) request.getAttribute("empresa");
%>

<html>
<body>
	A empresa
	<%=nomeEmpresa%>
	foi criada com sucesso
</body>
</html>