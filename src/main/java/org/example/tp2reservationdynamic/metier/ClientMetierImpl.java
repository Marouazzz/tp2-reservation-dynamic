package org.example.tp2reservationdynamic.metier;


import org.example.tp2reservationdynamic.model.Client;
import org.example.tp2reservationdynamic.dao.ClientDAOImpl;
import org.example.tp2reservationdynamic.dao.IDAOClient;


public class ClientMetierImpl implements IMetierClient {
    private IDAOClient dao;

    // injection via constructeur
    public ClientMetierImpl(IDAOClient dao) {
        this.dao = dao;
        dao = new ClientDAOImpl();
    }
    @Override
    public void ajouterClient(Client client) {

        dao.ajouterClient(client);

    }

}
