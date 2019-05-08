<?php  

  $repInclude = './include/';
  require($repInclude . "_init.inc.php");
  
  // Est-on au 1er appel du programme ou non ?
  $etape=(count($_POST)!=0)?'validerConnexion' : 'demanderConnexion';
  
  if ($etape=='validerConnexion') { // un client demande à s'authentifier
      // acquisition des données envoyées, ici login et mot de passe
      $login = lireDonneePost("txtLogin");
      $mdp = lireDonneePost("txtMdp");   
      $lgUser = verifierInfosConnexion($idConnexion, $login, $mdp) ;
      // si l'id utilisateur a été trouvé, donc informations fournies sous forme de tableau
      if ( is_array($lgUser) ) { 
          affecterInfosConnecte($lgUser["id"], $lgUser["login"]);
      }
      else {
          ajouterErreur($tabErreurs, "Pseudo et/ou mot de passe incorrects");
      }
  }
 
  require($repInclude . "_entete.inc.html");
  require($repInclude . "_sommaire.inc.php");
  
          if ( $etape == "validerConnexion" ) 
          {
              if ( nbErreurs($tabErreurs) > 0 ) 
              {
                echo toStringErreurs($tabErreurs);
              }
          }
?>      
      <form id="frmConnexion" action="" method="post">
        <h1> Saisie </h1> 
        VISITEUR : numéro :
        <input type="text" name="numero" value="" size="8"/></br><p>
        PERIODE D'ENGAGEMENT : Mois :
        <input type="text" name="mois" value="" placeholder="mm" size="8" minlength="2" maxlength="2"/> 
        Année : <input type="text" name="annee" value="" placeholder="aaaa" size="8" minlength="4" maxlength="4"/></br><p>
        <h1> Frais au forfait </h1>
        Repas midi :
        <input type="text" name="repas" value="" size="8"/></br><p>
        Nuitées :
        <input type="text" name="nuit" value="" size="8"/></br><p>
        Etape :
        <input type="text" name="etape" value="" size="8"/></br><p>
        Kilométrage :
        <input type="text" name="km" value="" size="8"/></br><p>
        <input type="submit" value="Valider"/>
    </form>