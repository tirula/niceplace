<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	 
<div id="tabelaPlace">
	<c:if test="${not empty userPlaces}">
		<table class="table table-striped">
			<thead>
			    <tr>
					<th>Estabelecimento</th>
					<th>Usuario</th>					
					<th>Nota</th>
			    </tr>
		  </thead>
		<tbody>
			<c:forEach var="userPlace" items="${userPlaces}">	  		
			<tr>
				<td>${userPlace.place.name}</td>
				<td>${userPlace.user.username}</td>
				<td>${userPlace.pk.score}</td>
			</tr>
			</c:forEach>
		 </tbody>
		</table>
	</c:if>
</div>