<?php
	session_start();
	if(!isset($_SESSION['login'])){
		header('Location:../index.php');
	}
?>

<!DOCTYPE html>
<html>
<head>
	<title>ACESSO 2</title>
</head>
<body>

	<h2>ADM</h2>
	<a href="deslogar.php">Sair</a>
</body>
</html>