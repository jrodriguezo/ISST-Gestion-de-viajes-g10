package es.upm.dit.isst.webLab.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class TFG implements Serializable{
	
	@Id
	private String email;
	private String password;
	private String name;
	private String title;
	private int status;
	
	@Lob
	private byte[] document;
	private double grade;
	
	@ManyToOne
	private Professor advisor;
	
	public TFG() {}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public byte[] getDocument() {
		return document;
	}

	public void setDocument(byte[] document) {
		this.document = document;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	public Professor getAdvisor() {
		return advisor;
	}

	public void setAdvisor(Professor advisor) {
		this.advisor = advisor;
	}
	
	
}

