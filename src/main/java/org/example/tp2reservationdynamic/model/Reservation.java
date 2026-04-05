package org.example.tp2reservationdynamic.model;

public class Reservation {
    //ATTRUBUTS
    private Integer id;
    Client client;
    private String type;
    private   Double prix ;
    private String vue ;

//CONSTRUCTEURS AVEC PARAMS ET SANS PARAMS
    public Reservation(Integer id , Client client , String type, String vue , Double prix ) {
        this.id = id;
        this.client = client;
        this.type = type;
        this.prix = prix;
        this.vue = vue;
    }
    public Reservation() {
    }
// reservation doit etre juste les infos de clients !!! a refaire + ajouter un formulaire avec un champs hidden de client_id
    public Reservation(Client client, String type, String vue, double prix) {
        this.client = client;
        this.type = type;
        this.vue = vue;
        this.prix = prix;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    //GETTERS ET SETTERS
    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;

    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getPrix() {
        return prix;
    }
    public void setPrix(Double prix) {
        this.prix = prix;
    }
    public String getVue() {
        return vue;
    }
    public void setVue(String vue) {
        this.vue = vue;
    }


}
