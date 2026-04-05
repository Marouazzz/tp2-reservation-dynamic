package org.example.tp2reservationdynamic.dao;

import org.example.tp2reservationdynamic.model.Reservation;

public interface IDAOReservation {
    void ajouterReservation(Reservation reservation);
    void supprimerReservation(Reservation reservation);
}
