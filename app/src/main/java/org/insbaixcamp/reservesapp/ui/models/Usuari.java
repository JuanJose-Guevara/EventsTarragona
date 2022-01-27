package org.insbaixcamp.reservesapp.ui.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Usuari {

    @JsonProperty("Codi postal")
    public int getCodiPostal() {
        return this.codiPostal; }
    public void setCodiPostal(int codiPostal) {
        this.codiPostal = codiPostal; }
    int codiPostal;
    @JsonProperty("Cognoms")
    public String getCognoms() {
        return this.cognoms; }
    public void setCognoms(String cognoms) {
        this.cognoms = cognoms; }
    String cognoms;
    @JsonProperty("Contrasenya d'accés")
    public String getContrasenyaDAccés() {
        return this.contrasenyaDAccés; }
    public void setContrasenyaDAccés(String contrasenyaDAccés) {
        this.contrasenyaDAccés = contrasenyaDAccés; }
    String contrasenyaDAccés;
    @JsonProperty("Correu electrònic")
    public String getCorreuElectrònic() {
        return this.correuElectrònic; }
    public void setCorreuElectrònic(String correuElectrònic) {
        this.correuElectrònic = correuElectrònic; }
    String correuElectrònic;
    @JsonProperty("DNI")
    public String getDNI() {
        return this.dNI; }
    public void setDNI(String dNI) {
        this.dNI = dNI; }
    String dNI;
    @JsonProperty("Nom")
    public String getNom() {
        return this.nom; }
    public void setNom(String nom) {
        this.nom = nom; }
    String nom;
    @JsonProperty("Telèfon")
    public int getTelèfon() {
        return this.telèfon; }
    public void setTelèfon(int telèfon) {
        this.telèfon = telèfon; }
    int telèfon;

}
