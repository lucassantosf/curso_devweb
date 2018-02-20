<?php
      
      function queryRetorno($limite){

            $limite = 'm';
            return $limite;
      }

      //pegas os dados passados por post
      isset($_POST['limit']) ? $limit = ( (int) $_POST['limit'] * 2 ) : $limit = 0;

      //agora chamas a tua funcao php
      queryRetorno($limit);

 ?>