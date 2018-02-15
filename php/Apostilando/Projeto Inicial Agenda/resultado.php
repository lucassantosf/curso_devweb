<?php

	$idade = $_POST['idade'];



?>

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
				<form method="post" action="funcoes.php">
					<h2>Formulário Para treino</h2>
					<p> Sua idade é <?= $idade ?></p>
					<a href="funcoes.php">Voltar</a>
				</form>
				
			</div>
		</div>
	</div>
	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js" type="text/javascript"></script>
	<script type="text/javascript" src="../bootstrap/js/bootstrap.min.js"></script>

</body>
</html>