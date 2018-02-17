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
			<div class="col-md-2"><h3>Faça Login</h3></div>			
		</div>
		<div class="row">
			<div class="col-md-4"></div>
			<div class="col-md-2">
					<form action="logar.php" method="post">
							<input type="text" name="login" placeholder="Login" />
							<input type="password" name="senha" placeholder="Senha" />
							
			</div>
			<div class="col-md-6">
							<button class="btn btn-info" type="submit">Entrar</button>
							<label style="color: #858585;">Não é cadastrado?</label><a href="cadastrar.php">Cadastrar</a>
					</form>
			</div>			
		</div>
	</div>
</body>
</html>