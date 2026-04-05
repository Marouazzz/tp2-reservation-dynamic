<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Informations Client</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>

<body class="bg-light">

<div class="container mt-5">
    <div class="row justify-content-center">
        <div class="col-md-6">

            <div class="card shadow">

                <div class="card-header text-center">
                    <h3>Informations Client</h3>
                </div>

                <div class="card-body">

                    <p><strong>Nom :</strong> ${client.nom}</p>
                    <p><strong>Prénom :</strong> ${client.prenom}</p>
                    <p><strong>Téléphone :</strong> ${client.telephone}</p>
                    <p><strong>Email :</strong> ${client.email}</p>

                </div>

                <div class="card-footer text-center">
                    <a href="index.jsp" class="btn btn-secondary">Retour Accueil</a>
                </div>

            </div>

        </div>
    </div>
</div>

</body>
</html>