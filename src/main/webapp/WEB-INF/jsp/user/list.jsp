<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div id="tableUserID">
	<table class="table table-striped">
		<thead>
		    <tr>
				<th>Name</th>
				<th>Email</th>
				<th>Acoes</th>
		    </tr>
	  </thead>
	  <c:if test="${not empty users}">
	 <tbody>
	 	<c:forEach var="user" items="${users}">	  		
		<tr>
			<td>${user.name}</td>
			<td>${user.email}</td>
			<td><!-- a href="user/remove/${user.id}">X</a-->X</td>
		</tr>
		</c:forEach>
	   </tbody>
	   </c:if>
	</table>
</div>