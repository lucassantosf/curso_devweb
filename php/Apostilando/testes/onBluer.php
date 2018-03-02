<!DOCTYPE html>
<html>
<head lang="PT-BR">
    <meta charset="UTF-8">
    <title></title>
</head>
<script>

    function checar(){
        if(document.getElementById("email").value === "")
        {
            document.getElementById("botao").disabled = true;
        }
        else // há algum conteúdo
        {
            document.getElementById("botao").disabled = false;
        }
    }

    function keyupFunction(){
        alert('Deu certo');
    }

</script>
<body>

<h2>Evento onblur, oposto ao onfocus</h2>
<p>onblur disparado quando o input textbox deixar de ter o foco</p>
<br>
<input type="text" id="email" onblur="checar();" >

<input type="submit" id="botao" value="Enviar" disabled><br/><br/>

<input type="text" onkeydown="keydownFunction()" onkeyup="keyupFunction()">


</body>



</html>