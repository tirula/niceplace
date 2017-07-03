<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	 
<div id="tabelaPlace">
	<c:if test="${not empty places}">
		<table class="table table-striped">
			<thead>
			    <tr>
					<th>Nome</th>
					<th>Telefone</th>					
					<th>Endereco</th>
					<th>Cidade</th>
					<th>Pais</th>
			    </tr>
		  </thead>
		<c:if test="${not empty places}">
		<tbody>
			<c:forEach var="place" items="${places}">	  		
			<tr>
				<td>${place.name}</td>
				<td>${place.phone}</td>
				<td>${place.address}</td>
				<td>${place.city}</td>
				<td>${place.country}</td>
			</tr>
			</c:forEach>
		 </tbody>
		 </c:if>
		</table>
	</c:if>
</div>