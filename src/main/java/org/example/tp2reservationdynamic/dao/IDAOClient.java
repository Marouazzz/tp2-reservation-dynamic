package org.example.tp2reservationdynamic.dao;

import org.example.tp2reservationdynamic.model.Client;

public interface IDAOClient {
    void ajouterClient(Client client);
    void supprimerClient(Client client);
    void modifierClient(Client client);
    void supprimerAllClients();
    public Client getClient(int id);

}
