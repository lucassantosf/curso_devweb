<!DOCTYPE html>
<html>
<head>
	<title>Tela Inicial</title>
	<meta charset="utf-8">	
	<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet" />
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js" type="text/javascript">
		

	</script>
	<script type="text/javascript">
		
		$(document).ready(function(){

			$('#procurar').click( function(){

				if($('#telefone').val().length > 0 ){					
					$.ajax({
						url: 'paginas/procurar_contatos.php',
						method: 'post',
						data: $('#formtel').serialize(),
						success: function(data){
							$('#contatos').html(data);
						}
					});

				}
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
				<form id="formtel">
					<input type="text" name="telefone" id="telefone" placeholder="Tel" >
					<button id="procurar" type="button">Procurar</button>
				</form>
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