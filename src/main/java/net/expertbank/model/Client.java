package net.expertbank.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Client implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String name,firstName;
	private String phoneNumber;
	private boolean active;
	private String email,password,salt;
	
	public String getName() {
		return name;
	}
	public Client setName(String name) {
		this.name = name;
		return this;
	}
	public String getFirstName() {
		return firstName;
	}
	public Client setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public Client setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		return this;
	}
	public boolean isActive() {
		return active;
	}
	public Client setActive(boolean active) {
		this.active = active;
		return this;
	}
	
	public String getEmail() {
		return email;
	}
	public Client setEmail(String email) {
		this.email = email;
		return this;
	}
	public String getPassword() {
		return password;
	}
	public Client setPassword(String password) {
		this.password = password;
		return this;
	}
	public String getSalt() {
		return salt;
	}
	public Client setSalt(String salt) {
		this.salt = salt;
		return this;
	}
}
