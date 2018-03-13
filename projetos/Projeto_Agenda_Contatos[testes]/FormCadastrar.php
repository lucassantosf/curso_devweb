<!DOCTYPE html>
<html lang="pt-br">
<head>
	<meta charset="utf-8">
	<title>Estudo PHP</title>
	<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet" />

	<script type="text/javascript">

		function valida_form(){
			//Verificar Campos Sem conteúdo
			if(document.getElementById("nome").value == "" && document.getElementById("telefone").value == ""){
				alert('Por favor, preencher campos');				
				return false;
			}
			//Validar Campo Telefone receber apenas números
			if(isNaN(form1.telefone.value) ){
				alert('Por favor, campo Telefone aceita apenas números');
				form1.telefone.select();
				return false;
			}
		}

	</script>

</head>
<body>
	
	<div class="container">
		<div class="row">
			<div class="col-md-6">

				<h2>Formulário Para Cadastrar Telefone  </h2>
				<form method="post" action="cadastrar.php" name="form1" onsubmit="return valida_form()">					
					<div class="row">						
						<div class="col-md-2"><label>Nome :</label></div>
						<div class="col-md-10"><input type="text" name="nome" id="nome" placeholder="" maxlength="50"></div>
					</div>
					<div class="row">						
						<div class="col-md-2"><label>Número : </label></div>
						<div class="col-md-10"><input type="text" name="telefone" id="telefone" placeholder="" maxlength="10"></div>	
					</div>
					<div class="row">						
						<div class="col-md-1"><label>Ativo?</label></div>
						<div class="col-md-2"><label>S</label><input type="radio" name="ativo" value="S" required></div>
						<div class="col-md-2"><label>N</label><input type="radio" name="ativo" value="N" required></div>
					</div>

					<div class="row">
						<div class="col-md-12">
							<p>Selecione o Turno:<br>  
 								<input name="turno" type="radio" id="turno" value="Manhã" required>Manhã  
 								<input name="turno" type="radio" id="turno" value="Tarde" required>Tarde  
 								<input name="turno" type="radio" id="turno" value="Noite" required>Noite
 							</p> 
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<button type="submit">Cadastrar</button>
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