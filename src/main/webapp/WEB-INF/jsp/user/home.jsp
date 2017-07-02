<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
	<jsp:include page="../import.jsp" />
<body>
<div class="navbar">
  <a href="#home">Home</a>
  <a href="#news">News</a>
  <a href="#contact">Contact</a>
  <a href="#about">About</a>
</div>
	<div class="main">
		<div class="container">
			<br>
			<jsp:include page="form.jsp" />
			<br>
			<jsp:include page="list.jsp" />
		</div>
	</div>
</body>
</html>