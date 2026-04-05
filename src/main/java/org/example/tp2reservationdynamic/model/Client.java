package org.example.tp2reservationdynamic.model;

public class Client {
    //ATTRIBUTS
    private Integer id;
    private String nom;
    private String prenom;
    private String telephone;
    private String email;

// CONTRUCTEURS AVEC PARAMS ET SANS PARAMS
    public Client() {
    }
    public Client(Integer id , String nom ,  String prenom , String telephone , String email) {
        this.id = id ;
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.email = email;
    }
    public Client( String nom ,  String prenom , String telephone , String email) {

        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.email = email;
    }

//GETTERS ET SETTERS
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
