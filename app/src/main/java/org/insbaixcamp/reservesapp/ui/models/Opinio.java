package org.insbaixcamp.reservesapp.ui.models;


public class Opinio {

    private String Data;
    private int Event;
    private String NomUsuari;
    private String Opinió;
    private int Puntuació;
    private String Usuari;

    @Override
    public String toString() {
        return "Opinio{" +
                "data='" + Data + '\'' +
                ", event=" + Event +
                ", nomUsuari='" + NomUsuari + '\'' +
                ", opinio='" + Opinió + '\'' +
                ", puntuació=" + Puntuació +
                ", usuari='" + Usuari + '\'' +
                '}';
    }
}