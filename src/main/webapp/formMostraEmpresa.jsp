<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/alteraEmpresa" var="linkNovaEmpresa" />
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<html>
<body>
	<form action="${linkNovaEmpresa}" method="post">
		Nome: <input type="text" name="nome" value="${empresa.nome }"/>
		Data abertura: <input type="text" name="data" value="<fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy"/>" />
		<input type="hidden" name="id" value="${empresa.id }" />
		<input type="submit" />
	</form>
</body>
</html>