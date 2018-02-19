<?php
	session_start();

	if(!isset($_SESSION['login'])){
		header('Location:../index.php');
	}

	require_once('../db.class.php');
	$objetoDB = new db();
	$link = $objetoDB->conecta_mysql();

	$usuario_logado = $_SESSION['login'];
	$id = $_SESSION['id_login'];
	
	function deletarUser ($id_usuario){


	}

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
			
			<div class="col-md-6">
				<h2>Olá <?= $usuario_logado ?></h2>
				
			</div>
		</div>

		<div class="row">
			<div class="col-md-6">
				
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3>Funções</h3>
					</div>
					<div class="panel-body">						
						<a href="deslogar.php">Sair</a>
					</div>
						
				</div>
			</div>	

			<div class="col-md-6">
				<div class="panel panel-info">
					<div class="panel-heading">
						<h4>Usuários Existentes<a href="cadastrar.php" style="margin-left: 10px;width: 20px;height: 20px;"><span style="margin-left: -5px;" class="glyphicon glyphicon-plus"></span></a></h4>						
					</div>
					<div class="panel-body">

						<?php
							$consultarUsuarios = "select * from tb_usuario where id_usuario <> $id ";
							$resultado_query = mysqli_query($link,$consultarUsuarios);
							if($resultado_query){
								while ($registro = mysqli_fetch_array($resultado_query, MYSQLI_ASSOC)) {
									echo 'Usuário -> '.$registro['login'].' - Tipo de Perfil -> '.$registro['tipo_perfil'];	
									
									echo '<br/>';		
									
								}
							}else{
								echo 'Erro ao pesquisar por usuários';
							}

						?>
						
					</div>
				</div>
			</div>

		</div>
			
			

		
	</div>
	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js" type="text/javascript"></script>
	<script type="text/javascript" src="../bootstrap/js/bootstrap.min.js"></script>
	<script type="text/javascript">
		
		function deletar(){

		    $.ajax({
		        method: "post",
		        url: "deletarUsuario.php",
		        data: $("#form").serialize(),
		        success: function(data){
		            alert(data);
		        }

		    });
		}

  		
}

	</script>
</body>
</html>