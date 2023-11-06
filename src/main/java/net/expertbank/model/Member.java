package net.expertbank.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Member implements Serializable{
	
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
	public String getName() {
		return name;
	}
	public Member setName(String name) {
		this.name = name;
		return this;
	}
	public String getFirstName() {
		return firstName;
	}
	public Member setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public Member setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		return this;
	}
	public boolean isActive() {
		return active;
	}
	public Member setActive(boolean active) {
		this.active = active;
		return this;
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", firstName=" + firstName + ", phoneNumber=" + phoneNumber
				+ ", active=" + active + "]";
	}

}
