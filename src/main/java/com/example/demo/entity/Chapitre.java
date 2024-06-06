package com.example.demo.entity;
// Generated 5 juin 2023, 20:00:47 by Hibernate Tools 4.3.5.Final

import java.util.Date;
import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import static jakarta.persistence.GenerationType.IDENTITY;
/**
 * Chapitre generated by hbm2java
 */
@Entity
@Table(name = "chapitre", catalog = "pfe")
public class Chapitre implements java.io.Serializable  {

	private Integer idChpt;
	private Modul modul;
	private String titre;
	private Date dateAjoute;
	private String Contenue;
	private String Image;

	public Chapitre() {
	}

	public Chapitre(Modul modul, String titre, Date dateAjoute, String Contenue,String Image) {
		this.modul = modul;
		this.titre = titre;
		this.dateAjoute = dateAjoute;
		this.Contenue = Contenue;
		this.Image = Image;

	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_chpt", unique = true, nullable = false)
	public Integer getIdChpt() {
		return this.idChpt;
	}

	public void setIdChpt(Integer idChpt) {
		this.idChpt = idChpt;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "module", nullable = false)
	public Modul getModul() {
		return this.modul;
	}

	public void setModul(Modul modul) {
		this.modul = modul;
	}


	@Column(name = "titre", nullable = false, length = 45)
	public String getTitre() {
		return this.titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "Date_ajoute", nullable = true, columnDefinition = "DATE DEFAULT CURRENT_DATE", length = 10)
	public Date getDateAjoute() {
		return this.dateAjoute;
	}

	public void setDateAjoute(Date dateAjoute) {
		this.dateAjoute = dateAjoute;
	}


	/* Contenu*/
	@Column(name = "Contenue", nullable = true, length = 2250)
	public String getContenue() {
		return this.Contenue;
	}
	public void setContenue(String Contenue) {
		this.Contenue = Contenue;
	}

	/* Contenu*/
	@Column(name = "Image", nullable = true, length = 2250)
	public String getImage() {
		return this.Image;
	}
	public void setImage(String Image) {
		this.Image = Image;
	}


	@Override
	public String toString() {
		return "Chapitre{" +
				"idChpt=" + idChpt +
				", modul=" + modul.getNomModul() +
				", titre='" + titre + '\'' +
				", dateAjoute=" + dateAjoute +
				", Contenue='" + Contenue + '\'' +
				'}';
	}
}