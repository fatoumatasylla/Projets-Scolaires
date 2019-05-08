<!doctype html>
<html>
<head>
<meta charset="UTF-8">
<!-- TemplateBeginEditable name="doctitle" -->
<title>Document sans titre</title>
<!-- TemplateEndEditable -->
<!-- TemplateBeginEditable name="head" -->
<!-- TemplateEndEditable -->
</head>

<body>
<?php
    
         
    $adherent =$_POST['adherent'];
    $statut = $_POST['statut'];
   
    
    switch($_POST['niveau'])
    {
        case 1:{$niveau=210 ; break;}
        case 2:{$niveau=320 ; break;}
        case 3:{$niveau=370 ; break;}
        }
    
    
    //adherent  lyceen
    if ($adherent == 1 && $statut ==2 && ($_POST['niveau']== 1 || $_POST['niveau']==2 ) )
    {$prix =$niveau * 0.70;}
    
    elseif  (($adherent == 1 && $statut ==2 ) && $_POST['niveau'] == 3 )
    {$prix= $niveau * 0.50 ; }
    
    // non adherent
    
   elseif( ($adherent == 2 &&  $statut == 1) ||  ($adherent == 2 && $statut== 2) )
    { $prix=$niveau*1.20;
    }
    // adulte adherent
    
   else
    {
        $prix= $niveau;
    }
    //pension
    switch($_POST['regime'])
    {
        case 1: {$regime = 330 ; break;}
        case 2:{ $regime = 230;break;}
        case 3: {$regime = 70 ;break;}
            
    }
    
    //montant total
     $montant = $regime + $prix;
    
    echo "vous devez payer un montant de :".$montant."euros, pour votre stage." ;
   
    e
    /** pour verifier les resultalts
       echo ("Detail:".'<br/>'."niveau: $niveau".'<br/>'."statut: $statut ".'<br/>'."ad: $adherent ".'<br/>'."regime : $regime ".'<br/>'."prix: $prix ")
     */
  
    ?>
</body>
</html>

