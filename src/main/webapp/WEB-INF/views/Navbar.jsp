<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
       <meta http-equiv="X-UA-Compatible" content="IE=edge">
       <link href="webjars/bootstrap/5.2.0/css/bootstrap.min.css" rel="stylesheet" >
       <link href="webjars/bootstrap-icons/1.10.3/font/bootstrap-icons.css" rel="stylesheet" >
       <script src="/webjars/bootstrap/5.2.0/js/bootstrap.bundle.min.js"></script>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <link rel="stylesheet" type="text/css" href="background.css">
    </head>
    <body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
 <!-- <a class="navbar-brand" href="">Navbar</a>-->
   <img src="src/main/resources/static/images/about_laptop.png"  style="width: 70px; height: 50px;" >
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
    <div class="navbar-nav">
      <a class="nav-item nav-link active" href="listTechnicien">Technicien <span class="sr-only"></span></a>
      <a class="nav-item nav-link" href="listEmploi">Service</a>
      <a class="nav-item nav-link" href="listTypeEmploi">Type Service</a>

    </div>
  </div>
</nav>
    </body>
</html>
