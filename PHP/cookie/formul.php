  
  <?php 
if (!empty($_COOKIE["login"]){
$login= $_COOKIE["login"]; }
        
?>

                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
<h1> <b> BIENVENUE </b></h1>
		 

	<form action="formul.php" method="post" name="authent.php" > 

<h3> Identifiez-vous </h3>
<table >
	<tr>
		<td> Login:</td>
		<td> 
					<?php
					if (empty($login))
							{echo " <input type=\"text\"  name=\"login\" value=\"\" /> " ;}
					else  
							{ echo " <input type=\"text\"  name=\"login\" value=\"$login\" />"; }
																	
						?> 
		</td>
	</tr>	
	<tr>
			<td> Mot de Passe : </td>
			<td> <input type="password"  name="mdp"/></td>
	</tr>
		
	<tr> 
		<td></td>
		<td> <input type="submit" value="se connecter" /></td>
</tr>

</table>
</form>

	
	
