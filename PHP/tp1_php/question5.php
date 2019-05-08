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
           echo "CONSIGNE : À l’aide d’une boucle, afficher la liste : 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 !".'<br>';
           echo "RÉSULTAT: ".'<br>';
        for ($i=1 ;$i<=10 ; $i++)
{
            if ($i<10) 
                {
echo " $i," ;
            }
else 
    if ($i=10)
    {            
echo "$i!" ;
            
} 
}
        ?>
    </body>
</html>
