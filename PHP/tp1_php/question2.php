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
         $moyenne=12;
            echo "CONSIGNE :".'<br>'." Ecrire un programme qui affiche l'appréciation sur les bulletins en fonction d’une moyenne générale : \"Bon travail\" à partir de la moyenne, \"Peut mieux faire\" en dessous.".'<br>'."Ici la moyenne générale à pour valeur $moyenne .".'<br>';
            
            echo "RÉSULTAT: ";
   
        
    if  ($moyenne<10)
         { echo "peut mieux faire";  }
        elseif($moyenne>10)
       { echo "bon Travail"; }

        ?>
    </body>
</html>
