<%-- 
    Document   : accueil
    Created on : 31 mai 2019, 14:04:39
    Author     : lorris
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="fr">
<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="style.css" />
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
		  <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
		  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
		<![endif]-->
<title>Accueil Conseiller</title>
</head>


<body>
	<h1>
		Bienvenue<br> <small>sur Proxibanque</small>
	</h1>
	<ul class="nav nav-tabs">
		 <li class="nav-item">
		   <a class="nav-link active" href="accueil.html">Accueil</a>
		 </li>
		 <li class="nav-item">
		   <a class="nav-link active" href="creationClient.html">Créer un client</a>
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
<form>
    
    <%  out.println(request.getAttribute("idConseiller")); %>
    
		<fieldset class="fieldset">
			<legend>Accueil</legend>
			<input type="submit" value="Liste des clients" onclick="javascript:document.location.href='listeClient.html'" class="btn btn-primary"/><BR>
			<BR><input type="submit" value="Créer un client" onclick="javascript:location.href='creationClient.html'"class="btn btn-primary"/><BR>
			<BR><input type="submit" value="Effectuer un virement" onclick="javascript:location.href='Virement.html'"class="btn btn-primary"/><BR>
			<BR><input type="submit" value="Supprimer un client" onclick="javascript:location.href='supprClient.html'"class="btn btn-primary"/><BR>
			
		</fieldset>
	
</form>
	</body>
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script
		src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</html>
