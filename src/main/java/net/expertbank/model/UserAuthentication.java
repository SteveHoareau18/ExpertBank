package net.expertbank.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "UserAuthentication")
public class UserAuthentication extends Member {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String email,password,salt;

	public String getEmail() {
		return email;
	}
	public UserAuthentication setEmail(String email) {
		this.email = email;
		return this;
	}
	public String getPassword() {
		return password;
	}
	public UserAuthentication setPassword(String password) {
		this.password = password;
		return this;
	}
	public String getSalt() {
		return salt;
	}
	public UserAuthentication setSalt(String salt) {
		this.salt = salt;
		return this;
	}
	
	public long getId() {
		return id;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}
	@Override
	public String getFirstName() {
		// TODO Auto-generated method stub
		return super.getFirstName();
	}
	@Override
	public String getPhoneNumber() {
		// TODO Auto-generated method stub
		return super.getPhoneNumber();
	}
	@Override
	public boolean isActive() {
		// TODO Auto-generated method stub
		return super.isActive();
	}
	@Override
	public UserAuthentication setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
		return this;
	}
	@Override
	public UserAuthentication setFirstName(String firstName) {
		// TODO Auto-generated method stub
		super.setFirstName(firstName);
		return this;
	}
	@Override
	public UserAuthentication setPhoneNumber(String phoneNumber) {
		// TODO Auto-generated method stub
		super.setPhoneNumber(phoneNumber);
		return this;
	}
	@Override
	public UserAuthentication setActive(boolean active) {
		// TODO Auto-generated method stub
		super.setActive(active);
		return this;
	}
	@Override
	public String toString() {
		return "UserAuthentication [getEmail()=" + getEmail() + ", getPassword()=" + getPassword() + ", getSalt()="
				+ getSalt() + ", getId()=" + getId() + ", getName()=" + getName() + ", getFirstName()=" + getFirstName()
				+ ", getPhoneNumber()=" + getPhoneNumber() + ", isActive()=" + isActive() + "]";
	}
}
