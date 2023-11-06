package net.expertbank.model;

import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class AccountBank implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(unique = true,length = 1000)
	private String IBAN;
	private float money;
	@OneToOne
	private Client member;
	
	public Client getUserAccount() {
		return member;
	}
	public AccountBank setUserAccount(Client member) {
		this.member = member;
		return this;
	}
	
	public long getId() {
		return id;
	}
	
	public AccountBank setIBAN(String iBAN) {
		IBAN = iBAN;
		return this;
	}

	public String getIBAN() {
		return IBAN;
	}

	public float getMoney() {
		return money;
	}
	public AccountBank setMoney(float money) {
		this.money = money;
		return this;
	}
	@Override
	public String toString() {
		return "AccountBank [id=" + id + ", IBAN=" + IBAN + ", money=" + money + ", member=" + member + "]";
	}
}
