<html>
    <head>
        <meta charset="UTF-8">
        <title></title>
    </head>
    <body>



<?php
    echo "CONSIGNE :".'<br>'."À l’aide d’une boucle, afficher tous les nombres pairs compris entre 1 et 100, un nombre par ligne.".'<br>'."Les multiples de 10 doivent s’afficher en gras.".'<br>';
            echo "RESULTALT : ".'<br>';
    echo "VOICI LES NOMBRES PAIRE ENTRE  1 ET 100: ".'<br>';

    for ($i=1 ;$i<=100 ; $i++)
        
{
if ($i%2==0 && $i%10!=0) 
    
{
echo " $i";
 }
    
if ($i%10==0)
{            
echo "<b> $i </b>";            
} 
}
?>
    </body>
</html>
