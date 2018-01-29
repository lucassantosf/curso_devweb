<?php

	session_start();

	if(!$_SESSION['usuario']){
		header('Location: index.php?erro=1');
	}

	require_once('db.class.php');

	$id_usuario = $_SESSION['id_usuario'];

	$objDb = new db();
    $link = $objDb->conecta_mysql();
    
    $sql = "SELECT DATE_FORMAT(t.data_inclusao, '%d %b %Y %T') AS data_inclusao_formatada, t.tweet, u.usuario ";
    $sql.= "from tweet as t JOIN usuarios as u on (t.id_usuario = u.id)";
    $sql.= "WHERE id_usuario = $id_usuario ";
    $sql.= "order by data_inclusao DESC ";
    
    $resultado_id = mysqli_query($link, $sql);

    if($resultado_id){

    	while ($registro = mysqli_fetch_array($resultado_id, MYSQLI_ASSOC)) {
    		echo '<a href="#" class="list-group-item">';
    			echo '<h4 class="list-group-heading">'.$registro['usuario'].'<small> - '.$registro['data_inclusao_formatada'].'</small></h4>' ;
    			echo '<p class="list-group-item-text">'.$registro['tweet'].' </p>';
    		echo '</a>';
    	}

    }else{
    	echo 'Erro na consulta do Banco de Dados';
    }

?>