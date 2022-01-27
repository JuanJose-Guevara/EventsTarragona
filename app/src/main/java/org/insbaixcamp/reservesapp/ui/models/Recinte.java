package org.insbaixcamp.reservesapp.ui.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Recinte {

    @JsonProperty("Adreça")
    public String getAdreça() {
        return this.adreça; }
    public void setAdreça(String adreça) {
        this.adreça = adreça; }
    String adreça;
    @JsonProperty("Latitud")
    public double getLatitud() {
        return this.latitud; }
    public void setLatitud(double latitud) {
        this.latitud = latitud; }
    double latitud;
    @JsonProperty("Longitud")
    public double getLongitud() {
        return this.longitud; }
    public void setLongitud(double longitud) {
        this.longitud = longitud; }
    double longitud;
    @JsonProperty("Superficie")
    public String getSuperficie() {
        return this.superficie; }
    public void setSuperficie(String superficie) {
        this.superficie = superficie; }
    String superficie;

    @Override
    public String toString() {
        return "Recinte{" +
                "adreça='" + adreça + '\'' +
                ", latitud=" + latitud +
                ", longitud=" + longitud +
                ", superficie='" + superficie + '\'' +
                '}';
    }
}
