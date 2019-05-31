<%-- 
    Document   : ListeClient
    Created on : 31 mai 2019, 14:32:09
    Author     : lorris
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="style.css" />
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

<title>Liste des clients</title>
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

<form action="accueil" method="post">
     <c:forEach var="client" items="${listeArticles}">
    <tr>
      <td><c:out value="${article.id}" /></td>
      <td><c:out value="${article.nom}" /></td>
      <td><c:out value="${article.prix}" /></td>
   </tr>
  </c:foreach>
				<input type="hidden" name="utilisateursChoisis" id="utilisateursChoisis"/>
					<TABLE><TR>
					<TD align="center"><B><FONT size="2">Liste des clients </FONT></B><BR>
					<select align=top name="liste1" size=6  style="width:120px">  
                    <option value="user1">user1</option>  
                    <option value="user2">user2</option>  
                    <option value="user3">user3</option>  
                    <option value="user4">user4</option>  
                </select> 

					</TD>
					<TD align="center">
					<INPUT type="button" value="Modifier le client" onClick="javascript:location.href='modifierClient.html'" class="btn btn-primary"><br>
					<INPUT type="button" value="Afficher comptes" onClick="javascript:location.href='listeComptes.html'" class="btn btn-primary">
					<BR><BR>
					

					
					<input type="submit" value="Retour" onclick="javascript:location.href='accueil.html'" class="btn btn-primary"/> 
				</FORM>
