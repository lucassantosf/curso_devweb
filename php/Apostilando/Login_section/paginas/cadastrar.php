<!DOCTYPE html>
<html>
<head>
	<title>Tela Inicial</title>
	<meta charset="utf-8">	
	<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet" />
</head>
<body>

	<div class="container">
		<div class="row">
			<div class="col-md-4"></div>
			<div class="col-md-2"><h3>Cadastre novos usuários</h3></div>			
		</div>
		<div class="row">
			<div class="col-md-4"></div>
			<div class="col-md-2">
					<form action="cadastrarUsuario2.php" method="post">
							<input type="text" name="login" value="" placeholder="Login" />
							<input type="password" name="senha" value="" placeholder="Senha" />
							
			</div>
			<div class="col-md-2">
				<label>Qual tipo de perfil?</label><br />
				<select name="tipo_usuario">
					<option value="">Selecione</option>
					<option value="1">Usuário Comum</option>
					<option value="2">Admnistrador</option>
				</select>
			</div>
			<div class="col-md-4">
							<button class="btn btn-info" type="submit" name="salvar">Salvar</button>
							<a href="pagina2.php">Voltar</a>
					</form>
			</div>			
		</div>
	</div>
</body>
</html>