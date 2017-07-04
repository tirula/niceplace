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
		<div class="container">
			<form  id="formPlaceNew"> 	
				<div class="form-group row">
					<label>Nome do estabelecimento</label>
					<div class="col-10">
						<input class="form-control" type="text" Name="name" id="namePlaceNew" maxlength="50" required>
					</div>
				</div>
				<div class="form-group row">
					<label>Telefone</label>
					<div class="col-10">
						<input class="form-control" type="text" name="phone" id="phonePlaceNew" maxlength="15" required>
					</div>
				</div>
				<div class="form-group row">
					<label>Endereco</label>
					<div class="col-10">
						<input class="form-control" type="text" name="address" id="addressPlaceNew" maxlength="50" required>
					</div>
				</div>
				<div class="form-group row">
					<label>Cidade</label>
					<div class="col-10">
						<input class="form-control" type="text" name="city" id="cityPlaceNew" maxlength="20" required>
					</div>
				</div>
				<div class="form-group row">
					<label>Pais</label>
					<div class="col-10">
						<input class="form-control" type="text" name="country" id="countryPlace" maxlength="20" required>
					</div>
				</div>
				<div class="form-group row">
		        <label class="col-4">Tipo de Estabelecimento</label>
		        <div class="col-6 selectContainer">
		            <select class="form-control" name="placeType">
		            	<option value="LIBRARY">LIBRARY</option>
		            	<option value="BAR">RESTAURANT</option>
		            	<option value="COWORKING">COWORKING</option>
		            	<option value="COFFEE">COFFEE</option>
		            	<option value="OTHER">OTHER</option>
		            </select>
		        </div>
		    </div>
				<div class="form-group row">
					<button id="btSavePlace" type="button" class="btn btn-success">Salvar</button>
				</div>
			</form>
		</div>
	</body>
</html>