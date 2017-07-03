<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
	<jsp:include page="../import.jsp" />
<body>
	<div class="container">
		<form id="formPlace">
			<div class="form-group">
				<div class="col-4">
					<input class="form-control" type="text" id="searchPlace" name="name">
				</div>
			</div>
			<div class="btn-group">				
				<button id="btSearchPlace" type="button" class="btn btn-primary">Buscar Estabelecimento</button>
				<button id="btNewPlace" type="button" class="btn btn-success">+ Novo Estabelecimento</button>
			</div>
		</form>
		<br>
		<jsp:include page="list.jsp" />
	</div>
</body>
</html>