package org.example.tp2reservationdynamic.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Dbconnection {
    // attributs pour la requete sql
    private  static  final String URL = "jdbc:mysql://localhost:3306/reservation_db";
    private static final String USER="root";
    private static final String PASSWORD="";

    // méthode pour récupérer la connexion
    public static Connection getConnection(){
        Connection conn = null ;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(URL,USER,PASSWORD);
System.out.println("CONNEXION A BD REUSSIE !");
        }catch (Exception e){
            e.printStackTrace();
        }
        return conn;
    }
}
