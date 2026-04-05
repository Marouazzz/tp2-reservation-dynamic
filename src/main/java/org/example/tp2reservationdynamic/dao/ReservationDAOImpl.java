package org.example.tp2reservationdynamic.dao;

import org.example.tp2reservationdynamic.model.Reservation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ReservationDAOImpl implements IDAOReservation {
    @Override
    public void ajouterReservation(Reservation reservation) {
        Connection conn = Dbconnection.getConnection();
        String sql = "INSERT INTO reservations(client_id ,type,vue ,prix) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, 1);
            ps.setString(2, reservation.getType());
            ps.setString(3, reservation.getVue());
            ps.setDouble(4, reservation.getPrix());
            ps.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void supprimerReservation(Reservation reservation) {
        Connection conn = Dbconnection.getConnection();
        String sql = "DELETE FROM reservations WHERE reservation_id = ?";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1,reservation.getId());
            ps.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
