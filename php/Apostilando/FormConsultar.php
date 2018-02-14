<?php

	require_once('db.class.php');
	$objDb = new db();
    $link = $objDb->conecta_mysql();

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

				<h2>Formulário Para Consultar Telefone  </h2>
				<form method="post" action="FormConsultar.php">					
					<div class="row">					
						<div class="col-md-10"><input type="text" name="nome" placeholder="Consultar pelo Nome" maxlength="50"></div>
					</div>

					<div class="row">						
						<div class="col-md-10"><input type="text" name="telefone" placeholder="Consultar pelo Telefone" maxlength="10"></div>	
					</div>
										
					<div class="row">
						<div class="col-md-12">
							<button type="submit">Consultar</button>

							<?php
								$nome = $_POST['nome'];
								$telefone = $_POST['telefone'];

								if($nome != '' ){									
									$sql = "Select * from contatos where nome like '%$nome%'" ;
									$resultado = mysqli_query($link,$sql);
									if($resultado){
			
										while($registro = mysqli_fetch_array($resultado, MYSQLI_ASSOC)){
											$nome = $registro['nome'];
											echo '<br/>';
											echo 'Contato:'.$nome.' Tel: '.$registro['telefone'];
										}

									}
									else{
										echo "Erro ao executar consulta no Banco de Dados";
									}

								}else if($telefone != '' ){									
									
									$sql = "Select * from contatos where telefone like '%$telefone%' " ;
									$resultado = mysqli_query($link,$sql);
									if($resultado){
			
										while($registro = mysqli_fetch_array($resultado, MYSQLI_ASSOC)){
											$nome = $registro['nome'];
											echo '<br/>';
											echo 'Contato:'.$nome.' Tel: '.$registro['telefone'];
										}

									}else{
										echo "Erro ao executar consulta no Banco de Dados";
									}
								}								
														
							?>

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