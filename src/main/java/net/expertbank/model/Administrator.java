package net.expertbank.model;

import jakarta.persistence.Entity;

@Entity
public class Administrator extends Operator{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	public Administrator setName(String name) {
		// TODO Auto-generated method stub
		 super.setName(name);
		 return this;
	}

	@Override
	public Administrator setFirstName(String firstName) {
		// TODO Auto-generated method stub
		 super.setFirstName(firstName);
		 return this;
	}

	@Override
	public Administrator setPhoneNumber(String phoneNumber) {
		// TODO Auto-generated method stub
		 super.setPhoneNumber(phoneNumber);
		 return this;
	}

	@Override
	public Administrator setActive(boolean active) {
		// TODO Auto-generated method stub
		 super.setActive(active);
		 return this;
	}

	@Override
	public Administrator setEmail(String email) {
		// TODO Auto-generated method stub
		 super.setEmail(email);
		 return this;
	}

	@Override
	public Administrator setSaltedPassword(SaltedPassword saltedPassword) {
		// TODO Auto-generated method stub
		super.setSaltedPassword(saltedPassword);
		return this;
	}

	@Override
	public String toString() {
		return "Administrator [toString()=" + super.toString() + ", getName()=" + getName() + ", getFirstName()="
				+ getFirstName() + ", getPhoneNumber()=" + getPhoneNumber() + ", isActive()=" + isActive()
				+ ", getEmail()=" + getEmail() + ", getSaltedPassword()=" + getSaltedPassword() + "]";
	}
}
