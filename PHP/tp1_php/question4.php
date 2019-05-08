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
            $Caff=3000 ;
            echo "CONSIGNE :".'<br>'."Écrire un programme qui détermine le taux de ristourne à appliquer au chiffre d’affaires.".'<br>'."ici le CA est de $Caff".'<br>';
            echo "RÉSULTAT: ";
            
                $Caff=2500;
                if ($Caff >=2000){
                    echo "ristourne de 4%";
                }elseif(2000 <$Caff  &&  $Caff<=3000){
                    echo "ristourne de 3%";
                }elseif (1500 <$Caff  &&  $Caff<=2000) {
                    echo "ristourne de 2%";
                }elseif ($Caff<=1500) {
                    echo "ristourne de 1%";
                }
                
        
        ?>
    </body>
</html>
