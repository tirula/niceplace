<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
<html>
<head>
<title>Login Page</title>
	<link rel="stylesheet" href="css/niceplace.css">
	<link rel="stylesheet" href="css/bootstrap.css">
    <link rel="stylesheet" href="css/star-rating.css" media="all" type="text/css"/>
	
	<script src="js/jquery-3.2.1.js"></script>
	<script src="js/bootstrap.js"></script>
	<script src="js/niceplace.js"></script>
	<script src="js/star-rating.js" type="text/javascript"></script>
<style>
.error {
	padding: 15px;
	margin-bottom: 20px;
	border: 1px solid transparent;
	border-radius: 4px;
	color: #a94442;
	background-color: #f2dede;
	border-color: #ebccd1;
}

.msg {
	padding: 15px;
	margin-bottom: 20px;
	border: 1px solid transparent;
	border-radius: 4px;
	color: #31708f;
	background-color: #d9edf7;
	border-color: #bce8f1;
}

#login-box {
	width: 300px;
	padding: 20px;
	margin: 100px auto;
	background: #fff;
	-webkit-border-radius: 2px;
	-moz-border-radius: 2px;
	border: 1px solid #000;
}

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



<div id="header">
  <nav class="navbar navbar-toggleable-md navbar-light bg-faded">
  <div class="collapse navbar-collapse" id="navbarNav">
    <ul class="navbar-nav">
      <li class="nav-item">
        <a class="nav-link" href="/niceplace/cadastrar">Cadastre-se</a>
      </li>
    </ul>
  </div>
</nav>
</div>
<body onload='document.loginForm.username.focus();'>
	<h1>Bem vindo!! Encontre o melhor lugar para trabalhar</h1>
	<div id="login-box">
		<h2>Login with Username and Password</h2>
		<c:if test="${not empty error}">
			<div class="error">${error}</div>
		</c:if>
		<c:if test="${not empty msg}">
			<div class="msg">${msg}</div>
		</c:if>
		<form name='loginForm'
		  action="<c:url value='/j_spring_security_check' />" method='POST'>
		<table>
			<tr>
				<td>User:</td>
				<td><input type='text' name='username'></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type='password' name='password' /></td>
			</tr>
			<tr>
				<td colspan='2'><input name="submit" type="submit"
				  value="submit" /></td>
			</tr>
		  </table>
		  <input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" />
		</form>
	</div>
</body>
</html>
