package net.expertbank.model;

import jakarta.persistence.Entity;

@Entity
public class Operator extends Client{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public Operator setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
		return this; 
	}

	@Override
	public Operator setFirstName(String firstName) {
		// TODO Auto-generated method stub
		super.setFirstName(firstName);
		return this; 
	}

	@Override
	public Operator setPhoneNumber(String phoneNumber) {
		// TODO Auto-generated method stub
		super.setPhoneNumber(phoneNumber);
		return this; 
	}

	@Override
	public Operator setActive(boolean active) {
		// TODO Auto-generated method stub
		super.setActive(active);
		return this; 
	}

	@Override
	public Operator setEmail(String email) {
		// TODO Auto-generated method stub
		super.setEmail(email);
		return this; 
	}

	@Override
	public Operator setSaltedPassword(SaltedPassword saltedPassword) {
		super.setSaltedPassword(saltedPassword);
		return this;
	}

	@Override
	public String toString() {
		return "Operator [getName()=" + getName() + ", getFirstName()=" + getFirstName() + ", getPhoneNumber()="
				+ getPhoneNumber() + ", isActive()=" + isActive() + ", getEmail()=" + getEmail()
				+ ", getSaltedPassword()=" + getSaltedPassword() + ", toString()=" + super.toString() + "]";
	}
}
