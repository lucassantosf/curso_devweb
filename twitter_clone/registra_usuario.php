<?php
	
	require_once('db.class.php');

	$usuario = $_POST['usuario'];
	$email = $_POST['email'];
	$senha = md5($_POST['senha']);

	$obj = new db();
	$link = $obj->conecta_mysql();

	$sql = "insert into usuarios(usuario, email, senha) values ('$usuario','$email','$senha') ";

	//executar a query - mysqli_query( conexao , codigo);
	if(mysqli_query($link,$sql)){
		echo "Usuario registrado com sucesso";
	}else{
		echo "Erro ao registrar usuario";
	}
?>