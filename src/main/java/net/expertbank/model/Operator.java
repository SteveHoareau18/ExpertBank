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
	public Operator setPassword(String password) {
		// TODO Auto-generated method stub
		super.setPassword(password);
		return this; 
	}

	@Override
	public Operator setSalt(String salt) {
		// TODO Auto-generated method stub
		super.setSalt(salt);
		return this; 
	}
}
