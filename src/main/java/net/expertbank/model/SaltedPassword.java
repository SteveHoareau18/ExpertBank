package net.expertbank.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class SaltedPassword implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String password,salt;

	public String getPassword() {
		return password;
	}

	public SaltedPassword setPassword(String password) {
		this.password = password;
		return this;
	}

	public String getSalt() {
		return salt;
	}

	public SaltedPassword setSalt(String salt) {
		this.salt = salt;
		return this;
	}

	@Override
	public String toString() {
		return "SaltedPassword [id=" + id + ", password=" + password + ", salt=" + salt + "]";
	}
}
