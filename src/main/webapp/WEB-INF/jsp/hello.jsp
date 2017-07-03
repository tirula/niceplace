<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
	<jsp:include page="import.jsp" />
	<body>			
		<div class="container">
			<div class="content">
				<form id="formPlace">
					<div class="form-group">
						<div class="col-4">
							<input class="form-control" type="text" id="searchPlace" name="name">
						</div>
					</div>
					<div class="form-group">
						<div class="col-2">
							<button id="btSearchPlace" type="submit" class="btn btn-primary">Buscar Estabelecimento</button>
						</div>
					</div>
				</form><br>		
				<jsp:include page="place/list.jsp" />
			</div>
		</div>
	</body>
</html>