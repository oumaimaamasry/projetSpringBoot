<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
  <%@ include file="Navbar.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
       <meta http-equiv="X-UA-Compatible" content="IE=edge">
       <link href="webjars/bootstrap/5.2.0/css/bootstrap.min.css" rel="stylesheet" >
        <link href="webjars/bootstrap-icons/1.10.3/font/bootstrap-icons.css" rel="stylesheet" >
              <script src="/webjars/bootstrap/5.2.0/js/bootstrap.bundle.min.js"></script>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>List type des services</title>
    </head>
    <body>
        <main class="container my-5">
</br>
<a class="btn btn-primary" href="createTypeEmploi" role="button">Ajouter</a></br>
</br>
         <table class="table">
                  <thead>
                    <tr>
                      <th scope="col">ID</th>
                       <th scope="col">Service</th>
                      <th scope="col">Type Service</th>
                      <th scope="col">Action</th>
                    </tr>
                  </thead>
                  <tbody>
                   <c:forEach var = "typeservice" items="${typeEmploisJsp}">

                    <tr>
                                   <td>${typeservice.id}</td>
                                    <td>${typeservice.emploi.nom}</td>

                    <td> ${typeservice.nom}</td>
                    <td><a onClick="return confirm ('Are you sure to delete this service Type?')" href=deleteTypeEmploi?id=${typeservice.id}><button type="button" class="btn btn-danger ">Supprimer</button></a>
                    <a href=showTypeEmploi?id=${typeservice.id}><button type="button" class="btn btn-success "> Modifier</button></a></td>
                                                   </tr>
                                   </c:forEach>
                  </tbody>
                </table>

        </main>

    </body>
</html>
