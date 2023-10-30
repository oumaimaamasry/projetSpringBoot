<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
       <meta http-equiv="X-UA-Compatible" content="IE=edge">
       <link href="webjars/bootstrap/5.2.0/css/bootstrap.min.css" rel="stylesheet" >
        <link href="webjars/bootstrap-icons/1.10.3/font/bootstrap-icons.css" rel="stylesheet" >
              <script src="/webjars/bootstrap/5.2.0/js/bootstrap.bundle.min.js"></script>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>UPDATE technicien</title>
    </head>
    <body>
        <header>
            <h1>Update technicien</h1>
        </header>
        <main class="container my-5">
            <form action="updateTechnicien" method="post">
            <div>
                                <label for="idTech" class="form-label">Id : </label>
                                <input type="text" id="idTech" class="form-control" name="id" value="${technicienJsp.id}">
                            </div>
                <div>
                    <label for="nomTech" class="form-label">Nom : </label>
                    <input type="text" id="nomTech" class="form-control" name="nom" value="${technicienJsp.nom}">
                </div>
                <div>
                    <label for="prenom" class="form-label">Prenom : </label>
                    <input type="text" id="prenom" class="form-control" name="prenom" value="${technicienJsp.prenom}">
                </div>
                <div>
                    <label for="tel" class="form-label">Telephone : </label>
            	     <input type="text" id="tel" class="form-control" name="telephone" value="${technicienJsp.telephone}">
                </div>
                </br>
                <div>
                    <input type="submit" class="btn btn-success" value="Modifier">
                </div>
            </form>

        </main>

    </body>
</html>
