<?php

	$num = 1;
	while ( $num <= 1000) {
		
		$num = $num + 1;
		if($num == 80)
			break;	
		if($num == 10)
			continue;
		echo $num;
		echo '<br />';
	}


?>
