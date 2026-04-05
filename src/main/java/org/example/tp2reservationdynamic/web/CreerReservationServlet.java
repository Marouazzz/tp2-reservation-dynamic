package org.example.tp2reservationdynamic.web;

import org.example.tp2reservationdynamic.dao.ClientDAOImpl;
import org.example.tp2reservationdynamic.dao.IDAOClient;
import org.example.tp2reservationdynamic.dao.IDAOReservation;
import org.example.tp2reservationdynamic.dao.ReservationDAOImpl;
import org.example.tp2reservationdynamic.metier.ClientMetierImpl;
import org.example.tp2reservationdynamic.metier.IMetierClient;
import org.example.tp2reservationdynamic.metier.IMetierReservation;
import org.example.tp2reservationdynamic.metier.ReservationMetierImpl;
import org.example.tp2reservationdynamic.model.Client;
import org.example.tp2reservationdynamic.model.Reservation;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "rs", urlPatterns = {"/addRsv"})
public class CreerReservationServlet extends HttpServlet {

    private IMetierReservation metierReservation;
    private IMetierClient metierClient;


    @Override
    public void init() throws ServletException {
        //  Injection (couplage faible)
        IDAOReservation dao = new ReservationDAOImpl();
        metierReservation = new ReservationMetierImpl(dao);

        IDAOClient daoClient = new ClientDAOImpl();
        metierClient = new ClientMetierImpl(daoClient);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //Récupération des données
        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");
        String telephone = request.getParameter("telephone");
        String email = request.getParameter("email");

        String type = request.getParameter("type");
        String vue = request.getParameter("vue");
        String prixStr = request.getParameter("prix");

        // Validation
        if (nom == null || nom.isEmpty() ||
                prenom == null || prenom.isEmpty() ||
                telephone == null || telephone.isEmpty() ||
                email == null || email.isEmpty() ||
                type == null || type.isEmpty() ||
                vue == null || vue.isEmpty() ||
                prixStr == null || prixStr.isEmpty()) {

            request.setAttribute("error", "Tous les champs sont obligatoires !");
            request.getRequestDispatcher("Reservation.jsp").forward(request, response);
            return;
        }

        double prix = 0;
        try {
            prix = Double.parseDouble(prixStr);
        } catch (Exception e) {
            request.setAttribute("error", "Prix invalide !");
            request.getRequestDispatcher("Reservation.jsp").forward(request, response);
            return;
        }

        // Création des objets et appel des metiers
        Client client = new Client(nom, prenom, telephone, email);
        metierClient.ajouterClient(client);
        Reservation r = new Reservation(client, type, vue, prix);
        metierReservation.ajouterReservation(r);

        //  Envoi vers JSP
        request.setAttribute("reservation", r);
        request.getRequestDispatcher("infoReservation.jsp").forward(request, response);
    }
}