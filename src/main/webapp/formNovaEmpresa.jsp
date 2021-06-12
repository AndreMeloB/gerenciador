<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/novaEmpresa" var="linkNovaEmpresa" />
<html>
<body>
	<form action="${linkNovaEmpresa}" method="post">
		Nome: <input type="text" name="nome" />
		Data abertura: <input type="text" name="data" />
		<input type="submit" />
	</form>
</body>
</html>