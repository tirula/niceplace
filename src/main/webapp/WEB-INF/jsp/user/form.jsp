<div>
	<form  id="formUser" method="POST"> 	
		<div class="form-group row">
			<label for="nameUser" class="col-2 col-form-label">Nome</label>
			<div class="col-10">
				<input class="form-control" type="text" Name="name" id="nameuser" maxlength="50" required>
			</div>
		</div>
		<div class="form-group row">
			<label for="emailUser" class="col-2 col-form-label">Email</label>
			<div class="col-10">
				<input class="form-control" type="text" name="email" id="emailUser" maxlength="100" required>
			</div>
		</div>
		<div class="form-group row">
			<label for="passwordUser" class="col-2 col-form-label">Senha</label>
			<div class="col-10">
				<input class="form-control" type="password" name="password" id="passwordUser" maxlength="20" required>
			</div>
		</div>
		<div class="form-group row">
			<button id="btSaveUser" class="btn btn-primary">Salvar</button>
		</div>
	</form>
</div>