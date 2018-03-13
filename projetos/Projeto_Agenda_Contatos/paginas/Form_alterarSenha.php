<?php

	session_start();
	if(!isset($_SESSION['login'])){
		header('Location:../index.php');
	}
	$usuario_logado = $_SESSION['login'];
?>

<!DOCTYPE html>
<html>
<head>
	<title>ACESSO USER - <?= $usuario_logado ?></title>
	<meta charset="utf-8">	
	<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet" />
</head>
<body>

	<div class="container">
		<div class="row">
			<div class="col-md-4"></div>
			<div class="col-md-4">
				<h4>Informar campos para trocar senha</h4>
				<form action="alterarSenha.php" method="post">
					<!--<input type="text" name="senha_atual" placeholder="Digite sua senha atual"><hr>-->
					<input type="password" name="nova_senha"  placeholder="Digite a nova senha"><hr>
					<input type="password" name="confirmar_senha" placeholder="Confirme nova senha"><hr>
					<button type="submit">Alterar</button>
				</form>
			</div>	
		</div>
	</div>


</body>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js" type="text/javascript"></script>
	<script type="text/javascript" src="../bootstrap/js/bootstrap.min.js"></script>
	<script type="text/javascript">
		
		
	</script>
</html>