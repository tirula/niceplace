<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
	<jsp:include page="../import.jsp" />
<body>
	<div class="container">
		<jsp:include page="list.jsp" />
		<div class="form-group row">
			<button id="btNewRating" type="button" class="btn btn-success">Fazer uma avaliacao</button>
		</div>
	</div>
</body>
</html>