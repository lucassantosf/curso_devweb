<?php
	
	session_start();
	if(!isset($_SESSION['login'])){
		header('Location:../index.php');
	}

	//$senha_atual = $_POST['senha_atual'];
	$nova_senha = md5($_POST['nova_senha']);
	$confirmar_senha = md5($_POST['confirmar_senha']);
	$id_usuario = $_SESSION['id_login'];

	if($nova_senha !== $confirmar_senha){
		echo 'Erro ao confirmar campos de nova senha, verifique';
		header("refresh:2; Form_alterarSenha.php");
	}else{
		
		require_once('../db.class.php');
		$objetoDB = new db();
		$link = $objetoDB->conecta_mysql();
		$sql = "UPDATE tb_usuario SET senha_usuario = '$nova_senha' WHERE id_usuario = '$id_usuario';";
		$executarquery = mysqli_query($link,$sql);

		if($executarquery){
			echo 'Senha alterada com sucesso, sendo direcionado ao seu perfil...';
			header("refresh: 3; pagina2.php");
		}else{
			echo 'Erro ao salvar informações no banco de dados';
			header('refresh: 2; cadastrarUsuario2.php');
		}

	}

	
?>