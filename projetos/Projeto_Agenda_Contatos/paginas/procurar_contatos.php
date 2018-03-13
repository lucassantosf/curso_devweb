<?php  
	require_once('../db.class.php');
	$objetoDB = new db();
	$link = $objetoDB->conecta_mysql();
	
	$telefone = $_POST['telefone'];
	$sql = "SELECT * FROM tb_contatos where telefone like '%$telefone%' or descricao like '%$telefone%' ;";
		
	$resultado_id = mysqli_query($link, $sql);
	
	if($resultado_id){

        while($registro = mysqli_fetch_array($resultado_id, MYSQLI_ASSOC)){
        	echo $registro['descricao'].' - '.$registro['telefone'];							
			echo '<hr class="hr-primary">';
        }

    }else{
    	echo 'Erro na consulta';
    }
    
?>