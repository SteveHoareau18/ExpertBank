package net.expertbank.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Session implements Serializable { 
	
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String token;
	
	@ManyToOne
	private User user;
	
	@ManyToOne
	private AccountBank accountBank;
	
	
	public AccountBank getAccountBank() {
		return accountBank;
	}

	public void setAccountBank(AccountBank accountBank) {
		this.accountBank = accountBank;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Session [token=" + token + ", user=" + user + ", accountBank=" + accountBank + "]";
	}
	

	
	


}
