<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	 
<div id="tabelaPlace">
	<c:if test="${not empty userPlaces}">
		<table class="table table-striped">
			<thead>
			    <tr>
			    	<th>Mostrar</th>
					<th>Estabelecimento</th>
					<th>Usuario</th>					
					<th>Avaliacao no geral</th>
			    </tr>
		  </thead>
		<tbody>
			<c:forEach var="userPlace" items="${userPlaces}">	  		
			<tr>
				<td> 
					<button class="btn btn-primary" type="button" data-toggle="collapse" data-target="#collapseExample${userPlace.place.id}${userPlace.user.username}" aria-expanded="false" aria-controls="collapseExample">+/_</button>
				</td>
				<td>${userPlace.place.name}</td>
				<td>${userPlace.user.username}</td>
				<td><input id="totalRatingView" name="waiter" value="${userPlace.total}" type="text" class="rating" data-min=0 data-max=5 data-step=0.5 data-size="xs" disabled></td>
			</tr>
			<tr>
				<td colspan="3">
					<div class="collapse" id="collapseExample${userPlace.place.id}${userPlace.user.username}">
						<table>
							<tr>
								<td>Atendimento: </td>
								<td><input id="waiterRatingView" name="waiter" value="${userPlace.waiter}" type="text" class="rating" data-min=0 data-max=5 data-step=0.5 data-size="xs" disabled></td>
								<td></td>
								<td>Preco: </td>
								<td><input id="billRatingView" name="bill" value="${userPlace.bill}" type="text" class="rating" data-min=0 data-max=5 data-step=0.5 data-size="xs" disabled></td>
							</tr>
							<tr>
								<td>Conforto: </td>
								<td><input id="confortableRatingView" name="confortable" value="${userPlace.confortable}" type="text" class="rating" data-min=0 data-max=5 data-step=0.5 data-size="xs" disabled></td>
								<td></td>
								<td>Barulho: </td>
								<td><input id="noisyRatingView" name="noisy" value="${userPlace.noisy}" type="text" class="rating" data-min=0 data-max=5 data-step=0.5 data-size="xs" disabled></td>
							</tr>
						</table>
				    </div>
				</td>
			</tr>
			</c:forEach>
		 </tbody>
		</table>
	</c:if>
</div>