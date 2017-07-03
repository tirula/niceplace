<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
	<link rel="stylesheet" href="../css/niceplace.css">
	<link rel="stylesheet" href="../css/bootstrap.css">
		
	<script src="../js/jquery-3.2.1.js"></script>
	<script src="../js/bootstrap.js"></script>
	<script src="../js/niceplace.js"></script>
	
<style>
#header {
      height: 200px;
      position: relative;
      z-index: 0;
    }

#content {
  border: 1px solid #000;
  margin-top: -100px;
  position: relative;
  z-index: 1;
}

#footer {
  margin-top: -100px;
  height: 400px;
  position: relative;
  z-index: 0;
}
</style>
</head>
<jsp:include page="../logado.jsp" />

	<body>
		<div class="alert alert-danger">
		  <strong>Erro!</strong> Ocorreu um erro inesperado no sistema. Ja estamos verificando. =)
		</div>
		<div>
			<label>Voltar para home<a href="/hello"></a></label>
		</div>
	</body>
</html>