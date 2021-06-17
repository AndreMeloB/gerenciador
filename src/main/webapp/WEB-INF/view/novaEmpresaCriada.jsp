<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
	<body>
		<c:import url="logout-parcial.jsp" />
		<c:if test="${not empty empresa }">
			A empresa ${empresa} foi criada com sucesso!
		</c:if>
		<c:if test="${empty empresa }">
			A empresa não foi criada!
		</c:if>
	</body>
</html>