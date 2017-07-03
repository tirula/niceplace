<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
	<jsp:include page="import.jsp" />
<body>
<br>
<br>
	<div class="container">
		<form id="formPlace">
			<div class="form-group row">
				<div class="col-6">
					<input class="form-control" type="text" id="searchPlace"><button id="btSearchPlace" type="submit" class="btn btn-primary">Buscar Estabelecimento</button>
				</div>
			</div>
		</form>
		<sec:authorize access="hasRole('ROLE_USER')">
			<!-- For login user -->
			<c:url value="/j_spring_security_logout" var="logoutUrl" />
			<form action="${logoutUrl}" method="post" id="logoutForm">
				<input type="hidden" name="${_csrf.parameterName}"
					value="${_csrf.token}" />
			</form>
			<script>
				function formSubmit() {
					document.getElementById("logoutForm").submit();
				}
			</script>
	
			<c:if test="${pageContext.request.userPrincipal.name != null}">
				<h2>
					User : ${pageContext.request.userPrincipal.name} | <a
						href="javascript:formSubmit()"> Logout</a>
				</h2>
			</c:if>
		</sec:authorize>
	</div>
</body>
</html>