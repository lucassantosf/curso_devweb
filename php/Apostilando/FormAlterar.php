<!DOCTYPE html>
<html lang="pt-br">
<head>
	<meta charset="utf-8">
	<title>Estudo PHP</title>
	<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet" />

</head>
<body>
	
	<div class="container">
		<div class="row">
			<div class="col-md-6">

				<h2>Formulário Para Alteração de Informações </h2>
				<form method="post" action="alterar.php">					
					<div class="row">					
						<div class="col-md-10"><input type="text" name="nome" placeholder="Alterar pelo Nome" maxlength="50"></div>
					</div>

					<div class="row">						
						<div class="col-md-10"><input type="text" name="telefone" placeholder="Alterar pelo Telefone" maxlength="10"></div>	
					</div>

					<div class="row">						
						<div class="col-md-10"><input type="text" name="id_contato" placeholder="Alterar pelo ID" maxlength="10"></div>	
					</div>
										
					<div class="row">
						<div class="col-md-12">
							<button type="submit">Alterar</button>
						</div>
					</div>				
						
					
				</form>	
			</div>

			<div class="col-md-6">

			<div>

		</div>
		<div class="row">
			<div class="col-md-6">
				
			</div>
			<div class="col-md-6"></div>

		</div>

	</div>
	

	<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js" type="text/javascript"></script>
	<script type="text/javascript" src="../bootstrap/js/bootstrap.min.js"></script>
</body>
</html>