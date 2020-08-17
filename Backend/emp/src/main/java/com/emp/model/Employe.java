package com.emp.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Employe")


public class Employe {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String cin;
	private String prenom;
	private String nom;
	private String datenaissance;
	private String nationalite;
	private String etatcivile;
	private String email;
	private String numtel;
	private String adresse;
	private String photo;
	private String fonction;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDatenaissance() {
		return datenaissance;
	}
	public void setDatenaissance(String datenaissance) {
		this.datenaissance = datenaissance;
	}
	public String getNationalite() {
		return nationalite;
	}
	public void setNationalite(String nationalite) {
		this.nationalite = nationalite;
	}
	public String getEtatcivile() {
		return etatcivile;
	}
	public void setEtatcivile(String etatcivile) {
		this.etatcivile = etatcivile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNumtel() {
		return numtel;
	}
	public void setNumtel(String numtel) {
		this.numtel = numtel;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getFonction() {
		return fonction;
	}
	public void setFonction(String fonction) {
		this.fonction = fonction;
	}
	@Override
	public String toString() {
		return "Employe [id=" + id + ", cin=" + cin + ", prénom=" + prenom + ", nom=" + nom + ", datenaissance="
				+ datenaissance + ", nationnalité=" + nationalite + ", étatcivile=" + etatcivile + ", email=" + email
				+ ", numtél=" + numtel + ", adresse=" + adresse + ", photo=" + photo + ", fontion=" + fonction + "]";
	}
	
	
	
	
}
	