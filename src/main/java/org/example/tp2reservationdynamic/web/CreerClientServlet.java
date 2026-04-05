package org.example.tp2reservationdynamic.web;

import org.example.tp2reservationdynamic.dao.ClientDAOImpl;
import org.example.tp2reservationdynamic.dao.IDAOClient;
import org.example.tp2reservationdynamic.metier.ClientMetierImpl;
import org.example.tp2reservationdynamic.metier.IMetierClient;
import org.example.tp2reservationdynamic.model.Client;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "cs" , urlPatterns = {"/addClt"})
public class CreerClientServlet  extends HttpServlet {
    private IMetierClient metier;

    @Override
    public void init() throws ServletException{
        IDAOClient dao = new ClientDAOImpl();
        metier = new ClientMetierImpl(dao);
    }
    @Override
    public void doPost (HttpServletRequest req , HttpServletResponse res) throws ServletException , IOException {
        String nom = req.getParameter("nom");
        String prenom = req.getParameter("prenom");
        String telephone = req.getParameter("telephone");
        String email = req.getParameter("email");

        if ( nom == null || nom.isEmpty() || prenom == null || prenom.isEmpty() || telephone == null || email.isEmpty() ) {
            req.setAttribute("error" , "TOUS LES CHAMPS SONT OBLIGATOIRES !!!");
            req.getRequestDispatcher("inscription.jsp").forward(req, res);
            return ;
        }
        Client client = new Client(nom, prenom, telephone, email);
        metier.ajouterClient(client);
        req.setAttribute("client", client);
        req.getRequestDispatcher("infoClient.jsp").forward(req, res);
    }
}
