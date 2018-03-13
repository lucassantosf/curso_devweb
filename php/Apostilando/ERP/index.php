
<!DOCTYPE html>
<html>
<head>
	<title>Tela Inicial</title>
	<meta charset="utf-8">
	<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet" />	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js" type="text/javascript"></script>
	<script type="text/javascript" src="../bootstrap/js/bootstrap.min.js"></script>
</head>
<body>	

	<div class="container">
		<div class="row">
		
			<div class="col-md-7">
				
			</div>
			<div class="col-md-5">
				<button type="button" class="btn btn-success" data-toggle="modal" data-target="#modalLogin">Fazer Login
				</button>
				<div class="modal fade" id="modalLogin" tabindex="-1" role="dialog" aria-labelledby="modalLoginLabel">
					<div class="modal-dialog" role="document">
						<div class="modal-content">
			      			<div class="modal-header">
			            	  	<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span>
			            	  	</button>
			              		<h4 class="modal-title">Fazer Login</h4>
			      			</div>
				            <div class="modal-body">
				              <form action="autentica.php" method="post">
				              <label for="nome">Nome de usuário:</label>
				              <input type="text" id="nome" name="nome">
				              <label for="senha">Senha:</label>
				              <input type="password" id="senha" name="senha">	
				              <button type="submit" class="btn btn-success">Login</button>
				              <a href="#">Perdeu a senha?</a>
				              </form>
				            </div>				            
		        		</div> <!-- /.modal-content -->
					</div> <!-- /.modal-dialog -->  
	     		</div> <!-- /.modal -->
			</div>
			
			

		</div>
	
	</div>
	
		
</body>
</html>