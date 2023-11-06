package net.expertbank.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Session implements Serializable { 

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(unique = true,length = 1000)
	private String token;
	
	@ManyToOne
	private UserAuthentication user;
	
	@ManyToOne
	private AccountBank accountBank;
	private LocalDateTime validDate;
	
	public long getId() {
		return id;
	}

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

	public UserAuthentication getUser() {
		return user;
	}

	public void setUser(UserAuthentication user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Session [id=" + id + ", token=" + token + ", user=" + user + ", accountBank=" + accountBank
				+ ", validDate=" + validDate + "]";
	}

	public LocalDateTime getValidDate() {
		return validDate;
	}

	public void setValidDate(LocalDateTime validDate) {
		this.validDate = validDate;
	}
}
