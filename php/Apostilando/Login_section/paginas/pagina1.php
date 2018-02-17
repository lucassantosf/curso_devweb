<?php
	session_start();
	if(!isset($_SESSION['login'])){
		header('Location:../index.php');
	}
?>

<!DOCTYPE html>
<html>
<head>
	<title>ACESSO 1</title>
</head>
<body>

	<h2>COMUM</h2>
	<a href="deslogar.php">Sair</a>
</body>
</html>