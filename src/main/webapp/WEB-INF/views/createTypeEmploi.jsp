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
        <title>Ajouter type service</title>
    </head>
    <body>
        <header>
            <h1>Ajouter type Service</h1>
        </header>
        <main class="container my-5">

         <form action="saveTypeEmploi" method="post">

                  <div class="form-group">
                   <div>
                              <label for="emploi" class="font-weight-bold">Service:</label>
                              </br>
                             <select name="emploi">
                                 <c:forEach items="${emplois}" var="emp">
                                     <option value="${emp.id}">${emp.nom}</option>
                                 </c:forEach>
                             </select>
                                            </div>
                                            <div class="form-group">
                                  <div>
           <label for="nomser" class="font-weight-bold">Type Service : </label>
            <input type="text" id="nomser"  class="form-control" name="nom">
                                  </div>
                                  </div>
</br>
<div class="form-group text-center">
                  <button href="listTypeEmploi" type="submit" class="btn btn-primary">Ajouter</button>
                  </div>
                </form>
            ${msgJsp}
        </main>

    </body>
</html>