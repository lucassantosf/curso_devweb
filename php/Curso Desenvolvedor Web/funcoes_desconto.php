<?php

function calcula_desconto($vtotal, $vdesc){
	$vdesc = $vtotal * ($vdesc/100);
	return $vtotal - $vdesc;
}

?>