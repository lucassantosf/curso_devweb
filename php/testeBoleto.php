<html>

<head>
	<title>Calculo de Vencimento Boleto</title>
</head>

<body>	
	
	<form action="teste.php" method="post">
	Data de Vencimento do Boleto : <input type="text" name="datVenc" value="" size="" maxlength=""> <br/>
	Data de Pagamento do Boleto :<input type="text" name="datPag" value="" size="" maxlength=""> <br/>
	Valor do Boleto : <input type="text" name="Val" value="" size="" maxlength=""> <br/>

	<input type=submit value="Calcular">

	</form>

	<?php 

		dia_semana();
		$dtVenc = $_POST["datVenc"];
		$datPag = $_POST["datPag"];
		$valor = $_POST["Val"];

		if($dtVenc >= $datPag){

			echo " Valor final de pagamento : $valor";

		}else{

			$diasjuros = 0;
			
			for($a = 0 ; $a < ($datPag - $dtVenc) ; $a++){
				
				if( dia_semana($datPag + $a) == "Sat"){
					//verificar se o dia de pagamento é sabado
				}else if( dia_semana() == "Sun"){

				}

			} 


		}
		
		function dia_semana(){
			
			return date("D");

		}

		
	


	?>

</body>

</html>