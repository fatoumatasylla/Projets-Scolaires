<?php


  $repInclude = './include/';
  require($repInclude . "_init.inc.php");
  require($repInclude . "_entete.inc.html");
  require($repInclude . "_sommaire.inc.php");
  $num = $_COOKIE['id'];
?>

      <form id="frmConnexion" action="" method="POST">
        <table>
  <tr> <td width="129"> <h1> Saisie </h1></td></tr>
    <tr>

      <td colspan=2 >VISITEUR :</td>
      <td > numéro :</td>
      <td > <input type="text" name="numero" value="<?php echo "$num" ?>" size="8"/></td>
    </tr>
    <tr>

      <td colspan=2 >  PERIODE  D'ENGAGEMENT: </td>
      <td>Mois (2 chiffres) : </td>
		<td> <input type="text" name="mois" value="" placeholder="mm" size="8" minlength="2" maxlength="2"/></td>
      <td >Année (4 chiffres): </td>
      <td ><input type="text" name="annee" value="" placeholder="aaaa" size="8" minlength="4" maxlength="4"/> </td>
    </tr>

		<tr> <td colspan=3> <h1> Frais au forfait </h1> </tr>

    <tr>

		<td colspan=2> Repas midi : </td>
      <td><input type="text" name="repas" value="" size="8"/></br><p></td></td>

    </tr>
    <tr>

      <td colspan=2>Nuitées :</td>
      <td> <input type="text" name="nuit" value="" size="8"/></br><p></td>

    </tr>
    <tr>

      <td colspan=2>Etape :</td>
      <td> <input type="text" name="etape" value="" size="8"/></br><p></td>

    </tr>
    <tr>

      <td colspan=2 > Kilométrage :</td>
      <td><input type="text" name="km" value="" size="8"/></br><p></td>
       <td  vertical-align = "right" colspan=4 ><input type="submit" value="Valider"/></td>
</tr>
</table>
        </table>
   </form>
<?php
$id = $_POST["numero"];
$mois = $_POST["mois"];
$annee = $_POST["annee"];
$repas = $_POST["repas"];
$nuit = $_POST["nuit"];
$etape = $_POST["etape"];
$km = $_POST["km"];
if(!$idConnexion){
                   echo "Erreur de connexion à la base de données.";
               } else {
                   $req1="SELECT * FROM visiteur WHERE id='$id'";
                   $requete =  mysqli_query($idConnexion,$req1);

               if (mysqli_num_rows($requete) == 0) {
     echo "L'identifiant est incorrect'";
                   } else {
                     $req1="INSERT INTO lignefraisforfait (idVisiteur, mois, idFraisForfait, quantite)
                     VALUES('$id','$mois','REP', '$repas')";
                     $req2="INSERT INTO lignefraisforfait (idVisiteur, mois, idFraisForfait, quantite)
                     VALUES('$id','$mois','NUI', '$nuit')";
                     $req3="INSERT INTO lignefraisforfait (idVisiteur, mois, idFraisForfait, quantite)
                     VALUES('$id','$mois','ETP', '$etape')";
                     $req4="INSERT INTO lignefraisforfait (idVisiteur, mois, idFraisForfait, quantite)
                     VALUES('$id','$mois','KM', '$km')";

             	// Exécution de la requête
             		$resultat = mysqli_query($idConnexion,$req1,$req2,$req3,$req4);
             		if($resultat==True)
             			{	echo "Vos coordonnées ont été correctement enregistrées.<br /><br />";	}
             		else
             			{	echo "Echec de la requête ";
                       }
               }
}
 ?>
