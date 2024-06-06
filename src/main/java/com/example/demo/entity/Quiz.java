package com.example.demo.entity;
// Generated 5 juin 2023, 20:00:47 by Hibernate Tools 4.3.5.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import jakarta.persistence.*;

import static jakarta.persistence.GenerationType.IDENTITY;


/**
 * Quiz generated by hbm2java
 */
@Entity
@Table(name = "quiz", catalog = "pfe")
public class Quiz implements java.io.Serializable {

	private Integer idQz;
	private Modul modul;
	private String titre;
	private Date dateAjoute;
	private Date dateLimite;
	private Set<NoteQuiz> noteQuizs = new HashSet<NoteQuiz>(0);
	private Set<Question> questions = new HashSet<Question>(0);

	public Quiz() {
	}

	public Quiz(Modul modul, String titre, Date dateAjoute) {
		this.modul = modul;
		this.titre = titre;
		this.dateAjoute = dateAjoute;
	}

	public Quiz(Modul modul, String titre, Date dateAjoute, Date dateLimite, Set<NoteQuiz> noteQuizs,
			Set<Question> questions) {
		this.modul = modul;
		this.titre = titre;
		this.dateAjoute = dateAjoute;
		this.dateLimite = dateLimite;
		this.noteQuizs = noteQuizs;
		this.questions = questions;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_qz", unique = true, nullable = false)
	public Integer getIdQz() {
		return this.idQz;
	}

	public void setIdQz(Integer idQz) {
		this.idQz = idQz;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "module", nullable = true)
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
	@Column(name = "Date_ajoute", nullable = true, length = 10)
	public Date getDateAjoute() {
		return this.dateAjoute;
	}

	public void setDateAjoute(Date dateAjoute) {
		this.dateAjoute = dateAjoute;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "Date_limite",nullable = true, length = 10)
	public Date getDateLimite() {
		return this.dateLimite;
	}

	public void setDateLimite(Date dateLimite) {
		this.dateLimite = dateLimite;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "quiz")
	public Set<NoteQuiz> getNoteQuizs() {
		return this.noteQuizs;
	}

	public void setNoteQuizs(Set<NoteQuiz> noteQuizs) {
		this.noteQuizs = noteQuizs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "quiz")
	public Set<Question> getQuestions() {
		return this.questions;
	}

	public void setQuestions(Set<Question> questions) {
		this.questions = questions;
	}

}
