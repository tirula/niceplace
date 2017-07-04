<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:set var="context" value="${pageContext.request.contextPath}" />

<div id="header">
  <nav class="navbar navbar-toggleable-md navbar-light bg-faded">s
  <div class="collapse navbar-collapse" id="navbarNav">
    <ul class="navbar-nav">
      <li class="nav-item">
        <a class="nav-link" href="${context}/places">Estabelecimentos</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="${context}/ratings">Avaliacoes</a>
      </li>
      <sec:authorize access="hasRole('ROLE_USER')">
	      <c:url value="/logout" var="logoutUrl" />
		  <form action="${logoutUrl}" method="post" id="logoutForm"><input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" /></form>
	      <c:if test="${pageContext.request.userPrincipal.name != null}">
		      <li class="nav-item">
		        <a>${pageContext.request.userPrincipal.name} | <a href=href="${context}/logout"> Logout</a></a>
		      </li>
	      </c:if>
	   </sec:authorize>
    </ul>
  </div>
</nav>
</div>




