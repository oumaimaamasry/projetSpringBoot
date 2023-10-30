
<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>


<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
       <link href="webjars/bootstrap/5.2.0/css/bootstrap.min.css" rel="stylesheet" >
        <link href="webjars/bootstrap-icons/1.10.3/font/bootstrap-icons.css" rel="stylesheet" >
              <script src="/webjars/bootstrap/5.2.0/js/bootstrap.bundle.min.js"></script>
       <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Ajouter technicien</title>
    </head>
    <body>
    <header >
        <h1 class="p-3 mb-2 bg-secondary text-white text-center">Ajouter technicien</h1>
    </header>

        <main class="container my-5">
        <form action="saveTechnicien" method="post" enctype="multipart/form-data">
        <div class="form-group">
     <label class="font-weight-bold" for="typeEmploi">Type Service:</label>
     </br>
        <select name="typeEmploi">
          <c:forEach var = "typeEmp" items="${typeEmplois}">
              <option value="${typeEmp.id}">${typeEmp.nom} </option>
                 </c:forEach>
                 </select>
                  </div>

                  <div class="form-group">
                   <label for="nomTech" class="font-weight-bold">Nom :</label>
                   <input class="form-control" type="text" id="nomTech" name="nom">
                  </div>
                   <div class="form-group">
         <label for="prenom" class="font-weight-bold">Prenom : </label>
              <input type="text" class="form-control" id="prenom" name="prenom">
           </div>
          <div class="form-group">
     <label for="tel" class="font-weight-bold">Telephone : </label>
         <input type="text" id="tel" class="form-control" name="telephone">
        </div>
        <div class="form-group">
        <label for="img" class="font-weight-bold">Image : </label>
         <input type="file" id="img" name="imageFile">
        </div>
</br>
<div class="form-group text-center">
         <button href="listTechnicien" type="submit" class="btn btn-primary">Ajouter</button>
          </div>
    </form>
            ${msgJsp}
        </main>

    </body>
</html>


