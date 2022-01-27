package org.insbaixcamp.reservesapp.ui.models;

import com.fasterxml.jackson.annotation.JsonProperty;;
import java.util.ArrayList;

public class Event {

    @JsonProperty("adreça")
    public String getAdreça() {
        return this.adreça; }
    public void setAdreça(String adreça) {
        this.adreça = adreça; }
    String adreça;
    @JsonProperty("aforament")
    public String getAforament() {
        return this.aforament; }
    public void setAforament(String aforament) {
        this.aforament = aforament; }
    String aforament;
    @JsonProperty("ambit")
    public String getAmbit() {
        return this.ambit; }
    public void setAmbit(String ambit) {
        this.ambit = ambit; }
    String ambit;
    @JsonProperty("data")
    public String getData() {
        return this.data; }
    public void setData(String data) {
        this.data = data; }
    String data;
    @JsonProperty("descripcio")
    public String getDescripcio() {
        return this.descripcio; }
    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio; }
    String descripcio;
    @JsonProperty("espai")
    public String getEspai() {
        return this.espai; }
    public void setEspai(String espai) {
        this.espai = espai; }
    String espai;
    @JsonProperty("hora")
    public String getHora() {
        return this.hora; }
    public void setHora(String hora) {
        this.hora = hora; }
    String hora;
    @JsonProperty("imatges")
    public ArrayList<String> getImatges() {
        return this.imatges; }
    public void setImatges(ArrayList<String> imatges) {
        this.imatges = imatges; }
    ArrayList<String> imatges;
    @JsonProperty("latitud")
    public double getLatitud() {
        return this.latitud; }
    public void setLatitud(double latitud) {
        this.latitud = latitud; }
    double latitud;
    @JsonProperty("longitud")
    public double getLongitud() {
        return this.longitud; }
    public void setLongitud(double longitud) {
        this.longitud = longitud; }
    double longitud;
    @JsonProperty("municipi")
    public String getMunicipi() {
        return this.municipi; }
    public void setMunicipi(String municipi) {
        this.municipi = municipi; }
    String municipi;
    @JsonProperty("nom")
    public String getNom() {
        return this.nom; }
    public void setNom(String nom) {
        this.nom = nom; }
    String nom;
    @JsonProperty("preu")
    public String getPreu() {
        return this.preu; }
    public void setPreu(String preu) {
        this.preu = preu; }
    String preu;


    @Override
    public String toString() {
        return "Event{" +
                "adreça='" + adreça + '\'' +
                ", aforament='" + aforament + '\'' +
                ", ambit='" + ambit + '\'' +
                ", data='" + data + '\'' +
                ", descripcio='" + descripcio + '\'' +
                ", espai='" + espai + '\'' +
                ", hora='" + hora + '\'' +
                ", imatges=" + imatges +
                ", latitud=" + latitud +
                ", longitud=" + longitud +
                ", municipi='" + municipi + '\'' +
                ", nom='" + nom + '\'' +
                ", preu='" + preu + '\'' +
                '}';
    }
}