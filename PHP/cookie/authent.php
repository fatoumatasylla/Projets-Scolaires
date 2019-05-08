<?php 
include("entete.php");

include("pieddepage.php");
?>

<?php


echo $_COOKIE['login'] ; 
//$login = $_POST['login'];
//$mdp=$_POST['mdp'];

define("login","fatou");
define("MDP","azerty");

if ( login == $_POST['login'] && MDP==$_POST['mdp'] )
	{       
     		include("entete.php");
		echo "identitication réussite " ;
        setcookie("login",$_POST['login'],time()+86400*30);
		echo"<a href=\"index.php\"> Retour à l'acceuil </a>" ;
		include("pieddepage.php");

	}

else { header('Location:index.php');} 

 
 		
?>
	
	
	
	
	
