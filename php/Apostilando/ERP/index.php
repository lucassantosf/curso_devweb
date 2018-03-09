<?php  

?>
<!DOCTYPE html>
<html>
<head>
	<title>Tela Inicial</title>
	<meta charset="utf-8">
	<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet" />
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js" type="text/javascript"></script>
	<script type="text/javascript">
		function newPopup(){
			newpopupWindow = window.open ('pagina.html', '', "width=250 height=250");			
		}

		$('#btn').on('click',function(e){
		     e.preventdefault();
		     $('#teste').fadeIn();		     
		});


	</script>

</head>
<body>	

	<div class="container">
		<div class="row">
		
			<div class="col-md-6">
				<h1>Teste</h1>
			</div>
			<div class="col-md-6">
				<a href="javascript:newPopup()">Abrir popup</a>
				<button class="btn" id="btn">Abrir</button>
			</div>
			
			<div id="teste">
				<h4>Div Escondido</h4>
			</div>


		</div>
	
	</div>
	

</body>
</html>