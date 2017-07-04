<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
	<jsp:include page="../import.jsp" />
<body>
	<div class="container">
		<form id="formRatingNew">
			<div class="form-group row">
		        <label class="col-4">Estabelecimento</label>
		        <div class="col-6 selectContainer">
		            <select class="form-control" name="placeID">
		            	<c:forEach var="place" items="${places}">	  		
							<option value="${place.id}">${place.name}</option>
		            	</c:forEach>
		            </select>
		        </div>
		    </div>
		    <div class="form-group row">
		    	<label>Internet</label>
		    	<input type="text" id="comidaRating" name="internet">
		    </div>
		    <div class="form-group row">
		    	<label>Comida</label>
		    	<input type="text" id="foodsRating" name="foods" >
		    </div>
		    <div class="form-group row">
		    	<label>Bebidas</label>
		    	<input type="text" id="drinksRating" name="drinks" >
		    </div>
		    <div class="form-group row">
				<label>Atendimento</label><input id="atendimentoRating" name="waiter" value="0" type="text" class="rating" data-min=0 data-max=5 data-step=0.5 data-size="xs" title="">
		    </div>
		    <div class="form-group row">
				<label>Preco</label><input id="precoRating" name="bill" value="0" type="text" class="rating" data-min=0 data-max=5 data-step=0.5 data-size="xs" title="">
		    </div>
		    <div class="form-group row">
				<label>Conforto</label><input id="confortoRating" name="confortable" value="0" type="text" class="rating" data-min=0 data-max=5 data-step=0.5 data-size="xs" title="">
		    </div>
		    <div class="form-group row">
				<label>Barulho</label><input id="barulhoRating" name="noisy" value="0" type="text" class="rating" data-min=0 data-max=5 data-step=0.5 data-size="xs" title="">
		    </div>
		    <div class="form-group row">
				<label>Avaliacao Geral</label><input id="avaliacaoGeralRating" name="total" value="0" type="text" class="rating" data-min=0 data-max=5 data-step=0.5 data-size="xs" title="">
		    </div>
		    <div class="form-group row">
				<button id="btRate" type="button" class="btn btn-success">Avaliar</button>
			</div>
	    </form>
	</div>
</body>
</html>