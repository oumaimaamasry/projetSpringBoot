
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <link href="webjars/bootstrap/5.2.0/css/bootstrap.min.css" rel="stylesheet" >
         <link href="webjars/bootstrap-icons/1.10.3/font/bootstrap-icons.css" rel="stylesheet" >
               <script src="/webjars/bootstrap/5.2.0/js/bootstrap.bundle.min.js"></script>
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <title>Ajouter service</title>
    </head>
    <body>

        <header>
            <h1>Ajouter Service</h1>
        </header>
        <main class="container my-5">


        <form action="saveEmploi" method="post">
          <div class="form-group">
           <label for="nomser" class="font-weight-bold">Service:</label>
           <input type="text" class="form-control" id="nomser" name="nom" >

          </div>
</br>

<div class="form-group text-center">
          <button href="listEmploi" type="submit" class="btn btn-primary">Ajouter</button>
          </div>
        </form>


            ${msgJsp}

        </main>

    </body>
</html>
