<?php

  $repInclude = './include/';
  require($repInclude . "_init.inc.php");
  require($repInclude . "_entete.inc.html");
  require($repInclude . "_sommaire.inc.php");

?>
<form id="frmConnexion" action="" method="POST">
  <table>
    <tr> <td width="129"> <h1> Connection Admin </h1></td></tr>
    <tr>
      <td colspan=2 >Login :</td>
      <td > <input type="text" name="login" value="" size="8"/></td>
    </tr>
    
    <tr>
      <td colspan=2 >  Mot de passe: </td>
      <td > <input type="password" name="mdp" value="" size="8"/></td>
      <td  vertical-align = "right" colspan=4 ><input type="submit" value="Valider"/></td>
    </tr>
  </table>
</form>

<?php
  $login=$_POST['login'];
  $mdp = $_POST["mdp"];
  if(!$idConnexion){
    echo "Erreur de connexion à la base de données.";
    header ("location:formul.php");
  } 
  
  elseif(mysqli_num_rows($resultat) == 0){
  echo"Le pseudo ou le mot de passe est incorrect.";
 }
 
  else {
  $req1="SELECT * FROM visiteur WHERE login='$login' AND mdp='$mdp'";
  $resultat =  mysqli_query($idConnexion,$req1);
  $enregistrement = mysqli_fetch_array($resultat);
  setcookie("id", $enregistrement['id'], time()+ 60 * 60 * 24 * 30);
  }

 ?>
