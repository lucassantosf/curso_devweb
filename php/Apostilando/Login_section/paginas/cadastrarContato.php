<!DOCTYPE html>
<html>
<head>
	<title>Cadastrar Contatos</title>
	<meta charset="utf-8">	
	<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet" />	
</head>
<body>

	<div class="container">
		<div class="row">
			<div class="col-md-4"></div>
			<div class="col-md-2"><h3>Cadastre novos contatos</h3></div>			
		</div>
		<div class="row">
			<div class="col-md-4"></div>
			<div class="col-md-2">
					<form action="cadastrarContato2.php" method="post">
							<input type="text" name="descricao" placeholder="Descrição" />
							<input type="text" name="telefone" id="telefone" placeholder="Telefone" maxlength="12" autocomplete="off"/>							
			</div>			
			<div class="col-md-4">
							<button class="btn btn-info" type="submit" name="salvar">Salvar</button>
							<a href="pagina1.php">Voltar</a>
					</form>
			</div>			
		</div>
	</div>

	
	
</body>
</html>