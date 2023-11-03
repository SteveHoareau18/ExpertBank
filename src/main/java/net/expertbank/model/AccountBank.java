package net.expertbank.model;

import java.io.Serializable;
import java.util.Random;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class AccountBank implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private String IBAN;
	private float money;
	@OneToOne
	private User user;
	
	public void AccountRank() {
		this.IBAN = "FR";
		String CIN = 10+new Random(80).nextInt()+"";
		String Abi = 12345+new Random(87653).nextInt()+"";
		String Guichet = 12345+new Random(87653).nextInt()+"";
		String numeroCompte1 = 1234567891+new Random(876543210).nextInt()+"";
		String NumeroCompte2 = 2+new Random(5).nextInt()+"";
		String CleDeControle = 9+new Random(89).nextInt()+"";
		this.IBAN=CIN+Abi+Guichet+numeroCompte1+NumeroCompte2+CleDeControle;
	}
	
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getIBAN() {
		return IBAN;
	}
	public void setIBAN(String iBAN) {
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
