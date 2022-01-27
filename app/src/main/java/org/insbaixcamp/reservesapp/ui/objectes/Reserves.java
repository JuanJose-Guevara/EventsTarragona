package org.insbaixcamp.reservesapp.ui.objectes;

public class Reserves {

    String dataReserva;
    String nomEvent;
    String nomClient;
    int nombreEntrades;

    public Reserves() {
    }

    public Reserves(String dataReserva, String nomEvent, String nomClient, int nombreEntrades) {
        this.dataReserva = dataReserva;
        this.nomEvent = nomEvent;
        this.nomClient = nomClient;
        this.nombreEntrades = nombreEntrades;
    }

    public String getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(String dataReserva) {
        this.dataReserva = dataReserva;
    }

    public String getNomEvent() {
        return nomEvent;
    }

    public void setNomEvent(String nomEvent) {
        this.nomEvent = nomEvent;
    }

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public int getNombreEntrades() {
        return nombreEntrades;
    }

    public void setNombreEntrades(int nombreEntrades) {
        this.nombreEntrades = nombreEntrades;
    }

    @Override
    public String toString() {
        return "Reserves{" +
                "dataReserva='" + dataReserva + '\'' +
                ", nomEvent='" + nomEvent + '\'' +
                ", nomClient='" + nomClient + '\'' +
                ", nombreEntrades=" + nombreEntrades +
                '}';
    }
}
