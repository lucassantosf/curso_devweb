<?php
	
	require_once('../db.class.php');
	$objetoDB = new db();
	$link = $objetoDB->conecta_mysql();

	$login = $_POST['login'];
	$senha = md5($_POST['senha']);
	$tipo_usuario = $_POST['tipo_usuario'];

	$sql = "INSERT INTO tb_usuario (login,senha_usuario, tipo_perfil) VALUES ('$login','$senha','$tipo_usuario')";

	$resultado = mysqli_query($link,$sql);

	if($resultado){
		echo 'Cadastrado com sucesso, Você será direcionado à seu perfil em instantes...';
		header('refresh: 4; pagina2.php');
	}else{
		echo 'Erro ao salvar informações no banco de dados';
		header('refresh: 2; cadastrarUsuario2.php');
	}

?>