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
            
              $moyenne=17;
            
            echo "CONSIGNE :".'<br>'."Modifier le programme précédent pour afficher « Excellent » au-delà de 14 de moyenne.".'<br>'."ici la moyenne générale est de $moyenne".'<br>' ;
           
            echo "RÉSULTAT: ".'<br>' ;
      
          
            
     if  ($moyenne<10)
       { echo "peut mieux faire";}
    elseif ($moyenne>10 && $moyenne<14)
       { echo "Bon Travail";}
    else
       {echo "Excellent Travail";}
            
            
        ?>
    </body>
</html>
