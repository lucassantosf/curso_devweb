<?php
	
?>

<!DOCTYPE html>
<html>
<head>
	<title>Tela Inicial</title>
	<meta charset="utf-8">	
	<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet" />
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js" type="text/javascript"></script>
	<script>
		
		$(document).ready(function(){
		    
		    $('#procurar').click( function(){

		    	if($('#search').val().length > 0){
		    		$.ajax({
		    			url: 'procurar_contatos.php',
						method: 'post',
						data: $('#search').serialize(),
						success: function(data) {
							
						}
		    		});
		    	};

		    });
		    		    
		});

		

	</script>
</head>
<body>

	<div class="container">
		<div class="row">
			<div class="col-md-7"></div>
			<div class="col-md-2"><h3>Faça Login</h3></div>			
		</div>
		<div class="row">
			<div class="col-md-7"></div>
			<div class="col-md-2">
					<form action="logar.php" method="post">
							<input type="text" name="login" placeholder="Login" />
							<input type="password" name="senha" placeholder="Senha" />							
			</div>
			<div class="col-md-3">
							<button class="btn btn-info" type="submit">Entrar</button>
							<label style="color: #858585;">Não é cadastrado?</label><a href="cadastrar.php">Cadastrar</a>
					</form>
			</div>			
		</div>

		<div class="row">
			<div class="col-md-2"></div>
			<div class="col-md-10">
				<h4>Pesquisa Rápida de Contatos</h4><br/>
				<input type="text" name="telefone" placeholder="Tel" id="search">
				<button id="procurar">Procurar</button>
			</div>
		</div>
		<div class="row">
			<div class="col-md-2">
				
			</div>
			<div class="col-md-8" id="contatos">
				 	
			</div>
		</div>
	</div>
	
</body>
</html>