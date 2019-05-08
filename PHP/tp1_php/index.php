<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <meta charset="UTF-8">
        <title></title>
    </head>
    <body> 

        <?php
            
            
        $today = date("d/m/y.");
       echo"Bonjour  nous sommes le $today ".'<br>' ;
       echo"Voici le TP1 .".'<br>';
            for ($i=1 ;$i<=7 ; $i++)
  {
    echo " <a color:balck  href=\"question$i.php\"> question $i </a>".'<br>';
  }
  
		?>  

    </body>
</html>

