<?php
	session_start();

	require_once('db.class.php');

    $login = $_POST['login'];
	$senha = md5($_POST['senha']);	

	$sql = "select * from tb_usuario where login = '$login' AND senha_usuario = '$senha' ;";

	$objDb = new db();
    $link = $objDb->conecta_mysql();

	$resultado_id = mysqli_query($link, $sql);

	if($resultado_id){

		$dados = mysqli_fetch_array($resultado_id);
		
		if($dados['tipo_perfil'] == 2 && (isset($dados['login'])) ){
			$_SESSION['login'] = $dados['login'];
			$_SESSION['id_login'] = $dados['id_usuario'];
			header('Location:paginas/pagina2.php');	

		}else if($dados['tipo_perfil'] == 1 && (isset($dados['login'])) ){
			$_SESSION['login'] = $dados['login'];
			$_SESSION['id_login'] = $dados['id_usuario'];
			header('Location:paginas/pagina1.php');
			
		}else{
			header('Location: index.php?erro=1');
		}


	}else{
		echo 'Falha ao pesquisar usuário';
	}	

?>