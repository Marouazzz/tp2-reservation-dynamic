package org.example.tp2reservationdynamic.metier;
import org.example.tp2reservationdynamic.dao.IDAOReservation;
import org.example.tp2reservationdynamic.dao.IDAOReservation;

import org.example.tp2reservationdynamic.model.Client;
import org.example.tp2reservationdynamic.model.Reservation;

public class ReservationMetierImpl implements IMetierReservation {
    private IDAOReservation dao;
    // injection via constructeur
    public ReservationMetierImpl(IDAOReservation dao) {

        this.dao = dao;
    }


    @Override
    public void ajouterReservation(Reservation reservation) {

        dao.ajouterReservation(reservation);

    }
}
