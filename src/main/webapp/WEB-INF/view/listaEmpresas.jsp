<%@page import="br.com.alura.gerenciador.modelo.Empresa"%>
<%@page import="java.util.List"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<html>
	<body>
		<c:import url="logout-parcial.jsp" />
		Usu?rio autenticado: ${usuarioLogado.login } <br/>
		<c:if test="${not empty empresa }">
			A empresa ${empresa} foi criada com sucesso! <br/>
		</c:if>
		Lista de empresas: <br/>
		<ul>
		<c:forEach items="${empresas}" var="empresa">
			<li>
				${empresa.nome} - <fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy"/>
				<a href="entrada?acao=MostraEmpresa&id=${empresa.id }">edita</a> 
				<a href="entrada?acao=RemoveEmpresa&id=${empresa.id }">remove</a> 
			</li>
		</c:forEach>
		</ul>
	</body>
</html>