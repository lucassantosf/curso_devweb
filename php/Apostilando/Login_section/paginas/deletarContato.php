<?php

	function deletarcontato(){

		isset($_POST['id_contato']) ? $id_contato = ( (int) $_POST['id_contato']) : $id_usuario = '';
		require_once('../db.class.php');
		$objetoDB = new db();
		$link = $objetoDB->conecta_mysql();
		$sql = "DELETE FROM tb_contatos WHERE id_contato = '$id_contato' ;";
		$resultado = mysqli_query($link,$sql);		
		if($resultado){
			return  'Deletado com sucesso';			
		}else{
			return 'Erro ao deletar';
		}
	}	

	
	return deletarcontato();

?>