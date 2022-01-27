package org.insbaixcamp.reservesapp.ui.objectes;

public class Event {

    String nom;
    String data;
    String hora;
    String recinte;
    String descripco;
    double prue;
    int aforament;

    public Event() {
    }

    public Event(String nom, String data, String hora, String recinte, String descripco, double prue, int aforament) {
        this.nom = nom;
        this.data = data;
        this.hora = hora;
        this.recinte = recinte;
        this.descripco = descripco;
        this.prue = prue;
        this.aforament = aforament;
    }

    public String getNom() {
        return nom;
    }

    public String getData() {
        return data;
    }

    public String getHora() {
        return hora;
    }

    public String getRecinte() {
        return recinte;
    }

    public String getDescripco() {
        return descripco;
    }

    public double getPrue() {
        return prue;
    }

    public int getAforament() {
        return aforament;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setRecinte(String recinte) {
        this.recinte = recinte;
    }

    public void setDescripco(String descripco) {
        this.descripco = descripco;
    }

    public void setPrue(double prue) {
        this.prue = prue;
    }

    public void setAforament(int aforament) {
        this.aforament = aforament;
    }

    @Override
    public String toString() {
        return "Event{" +
                "nom='" + nom + '\'' +
                ", data='" + data + '\'' +
                ", hora='" + hora + '\'' +
                ", recinte='" + recinte + '\'' +
                ", descripco='" + descripco + '\'' +
                ", prue=" + prue +
                ", aforament=" + aforament +
                '}';
    }
}
