<!doctype html>
<html>
<head>
<meta charset="UTF-8">
<title>Document sans titre</title>
</head>

<body>

<h2 align="center"> Centre équestre "Les Genêts" </h2>
	<h3> Calculer le montant de votre stage </h3>
	
<table width="846" border="1" bordercolor="#FFFDFD" >
 
	<form action="calcul.php" name="fraisstage" method="POST">
	
	 <tr>
	   
      <td width="225">Votre niveau de galop :</td>
      <td width="123"><input type="radio" name="niveau"  checked="checked" value="1"  > niveau 1 <br></td>
      <td width="107"><input type="radio" name="niveau" value="2" > niveau 2 <br> </td>
      <td width="89"colspan=2><input type="radio" name="niveau" value="3"  > niveau 3 <br> </td>
    </tr>
	
	
		<tr>
		 
	<td height="68">Statut:<br> </td>
	<td> <input type="radio" name="statut"  checked="checked" value="1" > Adulte </td>
	<td colspan=4 ><input name="statut" type="radio" value="2"  > Lycéen  <br></td>
	</tr>
		
	
	<tr>
	 
	<td>Êtes vous adhérent au centre equestre ?:</td>
	<td><input type="radio" name="adherent"  checked="checked" value="1"  > Oui</td>
	<td colspan=4 ><input type="radio" name="adherent" value="2" > Non </td>
	 
	</tr>
	
	<tr>
	<td> Quel régime souhaitez vous ?:</td>
<td><input type="radio" name="regime" checked="checked" value="1"  >Pension complète en chambre individuelle à 330€</td>
<td><input type="radio" name="regime" value="2" > Pension complète en dortoire à 230€</td>
<td width="268" colspan=4><input type="radio" name="regime" value="3" > Repas midi seul à 70€</td>

	</tr>
	
	<tr>
    <td colspan=5S > <input type="submit" name="valider" value="valider"> </tr>
	<tr> 
    <!-- <td > <h5> voici le montant que vous devez régler :</h5> </td>
	<td colspan=2> <input type="text" name="montant" value=" " </td> -->

		
		</tr>		 

	</form>
	
		</table> 	
</body>
</html>
