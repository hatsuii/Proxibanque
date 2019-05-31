<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="style.css" />
 <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
 
<title>Virement</title>
</head>
<body>
	<h1>
		Bienvenue<br> <small>sur Proxibanque
		</small>
	<ul class="nav nav-tabs">
		 <li class="nav-item">
		   <a class="nav-link active" href="accueil.html">Accueil</a>
		 </li>
		 <li class="nav-item">
		   <a class="nav-link active" href="creationClient.html">Cr�er un client</a>
		 </li>
		 <li class="nav-item">
		   <a class="nav-link" href="listeClient.html">Liste des clients</a>
		 </li>
		 <li class="nav-item">
		   <a class="nav-link" href="supprClient.html">Supprimer un client</a>
		 </li>
		 <li class="nav-item">
		   <a class="nav-link" href="virement.html">Effectuer un virement</a>
		 </li>
	</ul>

<p><input id="deco" type="image" width="50" height="50" src="deconnexion.png" onclick="javascript:location.href='login.html'" ><p>
	<form action="redirectVirement" method="post" accept-charset="UTF-8"
		autocomplete="on">
		<fieldset class="fieldset">
			<legend>Formulaire de Virement</legend>
			
			Client � d�biter<br>
			
				<input type="text" style="width:400px;" class="form-control" name="numdeb" placeholder="Identifiant client"
					required>
			Numero de compte d�bit�<br>
			<p>
				<input type="text" style="width:400px;" class="form-control" name="numdeb" placeholder="Compte d�bit�"
					required>
			</p>
			
			Client � cr�diter<br>
			<p>
				<input type="text" style="width:400px;" class="form-control" name="numdeb" placeholder="Identifiant client"
					required>
			</p>
			<br> Numero de compte cr�dit�<br>
			<p>
				<input type="text" style="width:400px;" class="form-control" name="numcred"
					placeholder="Compte cr�dit�" required>
			</p>
			<br> Montant<br>
			<p>
				<input type="text" style="width:100px;"class="form-control" name="montant"
					placeholder="Montant">
			</p>
			<br> <input type="submit" value="Virement" class="btn btn-primary">
		</fieldset>
	</form>
<body>


	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script
		src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</html>