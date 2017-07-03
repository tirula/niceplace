<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div id="tableUserID">
	<table class="table table-striped">
		<thead>
		    <tr>
				<th>username</th>
				<th>Acoes</th>
		    </tr>
	  </thead>
	  <c:if test="${not empty users}">
	 <tbody>
	 	<c:forEach var="user" items="${users}">	  		
		<tr>
			<td>${user.username}</td>
			<td>X</td>
		</tr>
		</c:forEach>
	   </tbody>
	   </c:if>
	</table>
</div>