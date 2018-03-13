<?php
	
	function deletarusuario(){
		
		isset($_POST['id_usuario']) ? $id_usuario = ( (int) $_POST['id_usuario']) : $id_usuario = '';
		require_once('../db.class.php');
		$objetoDB = new db();
		$link = $objetoDB->conecta_mysql();
		$sql = "DELETE FROM tb_usuario WHERE id_usuario = '$id_usuario' ;";
		$resultado = mysqli_query($link,$sql);		
		if($resultado){
			return  'Deletado com sucesso';			
		}else{
			return 'Erro ao deletar';
		}
	}	

	return deletarusuario();

?>