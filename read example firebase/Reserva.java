package org.insbaixcamp.firebaseconnect;
 import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
public class Reserva{
    @JsonProperty("Pagades")
    public int pagades;
    @JsonProperty("Event")
    public int event;
    @JsonProperty("DataReserva")
    public String dataReserva;
    @JsonProperty("Client")
    public String client;
}
