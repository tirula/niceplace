<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div id="tabelaPlace">
	<table class="table table-striped">
		<thead>
		    <tr>
				<th>Nome</th>
				<th>Media</th>
		    </tr>
	  </thead>
	  <c:if test="${not empty places}">
	 <tbody>
	 	<c:forEach var="place" items="${places}">	  		
		<tr>
			<td>${place.name}</td>
			<td></td>
		</tr>
		</c:forEach>
	   </tbody>
	   </c:if>
	</table>
</div>