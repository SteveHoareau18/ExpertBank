package net.expertbank.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class AccountBank implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private long IBAN;
	private float money;
	private User user;
	
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public long getIBAN() {
		return IBAN;
	}
	public void setIBAN(long iBAN) {
		IBAN = iBAN;
	}
	public float getMoney() {
		return money;
	}
	public void setMoney(float money) {
		this.money = money;
	}
	@Override
	public String toString() {
		return "AccountBank [IBAN=" + IBAN + ", money=" + money + ", user=" + user + "]";
	}
	
	
	
}
