package com.example.demo.entity;
// Generated 5 juin 2023, 20:00:47 by Hibernate Tools 4.3.5.Final

import jakarta.persistence.*;

import static jakarta.persistence.GenerationType.IDENTITY;
/**
 * Question generated by hbm2java
 */
@Entity
@Table(name = "question", catalog = "pfe")
public class Question implements java.io.Serializable {

	private Integer idQst;
	private Quiz quiz;
	private String question;
	private String reponse;
	private String option1;
	private String option2;
	private String option3;
	private Float note;

	public Question() {
	}

	public Question(Quiz quiz, String question) {
		this.quiz = quiz;
		this.question = question;
	}

	public Question(Quiz quiz, String question, String reponse, Float note,String option1,String option2,String option3) {
		this.quiz = quiz;
		this.question = question;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.reponse = reponse;

		this.note = note;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_qst", unique = true, nullable = false)
	public Integer getIdQst() {
		return this.idQst;
	}

	public void setIdQst(Integer idQst) {
		this.idQst = idQst;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "quiz", nullable = false)
	public Quiz getQuiz() {
		return this.quiz;
	}

	public void setQuiz(Quiz quiz) {
		this.quiz = quiz;
	}

	@Column(name = "Question", nullable = false)
	public String getQuestion() {
		return this.question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}
	@Column(name = "reponse", nullable = false)
	public String getReponse() {
		return this.reponse;
	}

	public void setReponse(String reponse) {
		this.reponse = reponse;
	}
	@Column(name = "option1")
	public String getOption1() {
		return this.option1;
	}

	public void setOption1(String option1) {
		this.option1 = option1;
	}
	@Column(name = "option2")
	public String getOption2() {
		return this.option2;
	}

	public void setOption2(String option2) {
		this.option2 = option2;
	}
	@Column(name = "option3")
	public String getOption3() {
		return this.option3;
	}

	public void setOption3(String option3) {
		this.option3 = option3;
	}
	@Column(name = "note", precision = 12, scale = 0)
	public Float getNote() {
		return this.note;
	}

	public void setNote(Float note) {
		this.note = note;
	}

}