<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Espace Client</title>


    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>

<body class="bg-light">

<div class="container mt-5">


    <div class="row justify-content-center">
        <div class="col-md-6">

            <div class="card shadow">

                <h3 class="card-header text-center">ESPACE CLIENT</h3>

                <div class="card-body">

                    <form action="addClt" method="post">

                        <div class="mb-3">
                            <label class="form-label">Nom</label>
                            <input type="text" name="nom" class="form-control">
                        </div>

                        <div class="mb-3">
                            <label class="form-label">Prénom</label>
                            <input type="text" name="prenom" class="form-control">
                        </div>

                        <div class="mb-3">
                            <label class="form-label">Téléphone</label>
                            <input type="text" name="telephone" class="form-control">
                        </div>

                        <div class="mb-3">
                            <label class="form-label">Email</label>
                            <input type="email" name="email" class="form-control">
                        </div>

                        <div class="d-grid">
                            <button type="submit" class="btn btn-success">
                                S'inscrire
                            </button>
                        </div>

                    </form>

                </div>

                <div class="card-footer text-center">
                    APPLICATION DE GESTION DES RESERVATIONS @2026
                </div>

            </div>

            <p class="text-danger mt-3 text-center">
                ${error}
            </p>

        </div>
    </div>

</div>

</body>
</html>