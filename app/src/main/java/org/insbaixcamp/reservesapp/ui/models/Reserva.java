package org.insbaixcamp.reservesapp.ui.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Reserva {

    @JsonProperty("Client")
    public String getClient() {
        return this.client; }
    public void setClient(String client) {
        this.client = client; }
    String client;
    @JsonProperty("DataReserva")
    public String getDataReserva() {
        return this.dataReserva; }
    public void setDataReserva(String dataReserva) {
        this.dataReserva = dataReserva; }
    String dataReserva;
    @JsonProperty("Event")
    public int getEvent() {
        return this.event; }
    public void setEvent(int event) {
        this.event = event; }
    int event;
    @JsonProperty("Pagades")
    public int getPagades() {
        return this.pagades; }
    public void setPagades(int pagades) {
        this.pagades = pagades; }
    int pagades;

    @Override
    public String toString() {
        return "Reserva{" +
                "client='" + client + '\'' +
                ", dataReserva='" + dataReserva + '\'' +
                ", event=" + event +
                ", pagades=" + pagades +
                '}';
    }
}
