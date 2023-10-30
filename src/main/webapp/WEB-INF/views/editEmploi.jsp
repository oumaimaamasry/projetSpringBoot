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
        <title>UPDATE service</title>
    </head>
    <body>
        <header>
            <h1>Update service</h1>
        </header>
        <main class="container my-5">
            <form action="updateEmploi" method="post">
            <div>
                                <label for="idser" class="form-label">Id : </label>
                                <input type="text" id="idser" class="form-control" name="id" value="${emploisJsp.id}">
                            </div>
                <div>
                    <label for="nomser" class="form-label">Service : </label>
                    <input type="text" id="nomser" class="form-control" name="nom" value="${emploisJsp.nom}">
                </div>
</br>
                <div>
                    <input type="submit" class="btn btn-success" value="Modifier">
                </div>
            </form>

        </main>

    </body>
</html>
