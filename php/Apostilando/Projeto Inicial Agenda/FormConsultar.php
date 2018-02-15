<!DOCTYPE html>
<html lang="pt-br">
<head>
	<meta charset="utf-8">
	<title>Estudo PHP</title>
	<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet" />

	<script type="text/javascript">

		function valida_form(){
			if(document.getElementById("nome").value == "" && document.getElementById("telefone").value == ""){
				alert('Por favor, preencher campos');				
				return false;
			}
		}

	</script>

</head>

<body>
	
	<div class="container">
		<div class="row">
			<div class="col-md-6">

				<h2>Formulário Para Consultar Telefone  </h2>
				<form method="post" action="consultar.php" name="form1" onsubmit="return valida_form()">					
					<div class="row">					
						<div class="col-md-10"><input type="text" name="nome" id="nome" placeholder="Consultar pelo Nome" maxlength="50"/></div>
					</div>

					<div class="row">						
						<div class="col-md-10"><input type="text" name="telefone" id="telefone" placeholder="Consultar pelo Telefone" maxlength="10"></div>	
					</div>
										
					<div class="row">
						<div class="col-md-12">
							<button type="submit" onclick="validarCampos">Consultar</button>
						</div>
					</div>						
					
				</form>	
				
			</div>

		</div>

	</div>
	

	<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js" type="text/javascript"></script>
	<script type="text/javascript" src="../bootstrap/js/bootstrap.min.js"></script>
</body>
</html>