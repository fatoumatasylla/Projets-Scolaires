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
            echo "CONSIGNE :".'<br>'."Écrire un programme qui initialise trois variables $a, $b et $c à 126, 258 et 34 respectivement et qui affiche la somme et la moyenne à l’écran.".'<br>'."L’affichage des résultats doit se faire sur deux lignes.".'<br>';
            $a=126 ;
            $b=258;
            $c=34;
            
            $s=$a+$b+$c;
            
            $m=$s/3;

            
            echo "RÉSULTAT: ".'<br>';
             echo "Somme : $s".'<br>';
             echo "Moyenne: $m".'<br>';
            
        ?>
    </body>
</html>
