package org.example.tp2reservationdynamic.dao;

import org.example.tp2reservationdynamic.model.Client;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClientDAOImpl implements IDAOClient {
    @Override
    public void ajouterClient(Client client) {
        Connection conn = Dbconnection.getConnection();
        String sql = "INSERT INTO client(nom, prenom,telephone , email) VALUES (?,?,?,?)";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, client.getNom());
            ps.setString(2, client.getPrenom());
            ps.setString(3, client.getTelephone());
            ps.setString(4, client.getEmail());
            ps.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    @Override
    public void supprimerClient(Client client) {
        Connection conn= Dbconnection.getConnection();
        String sql = "DELETE FROM client WHERE id =?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, client.getId());
            ps.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void modifierClient(Client client) {
        Connection conn= Dbconnection.getConnection();
        String sql = "UPDATE client SET nom = ?, prenom = ? , telephone = ?, email = ? WHERE id = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql );
            ps.setString(1, client.getNom());
            ps.setString(2, client.getPrenom());
            ps.setString(3, client.getTelephone());
            ps.setString(4, client.getEmail());
            ps.setInt(5, client.getId());
            ps.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void supprimerAllClients() {
        Connection conn = Dbconnection.getConnection();
        String sql = "DELETE * FROM client";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public Client getClient(int id) {
        Connection conn = Dbconnection.getConnection();
        String sql = "SELECT * FROM client WHERE id = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql) ;
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Client c = new Client();
                c.setId(rs.getInt("id"));
                c.setNom(rs.getString("nom"));
                c.setPrenom(rs.getString("prenom"));
                c.setTelephone(rs.getString("telephone"));
                c.setEmail(rs.getString("email"));
                return c;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
