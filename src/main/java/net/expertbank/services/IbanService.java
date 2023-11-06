package net.expertbank.services;

import java.util.Random;

public class IbanService {
	
	public static String generateIBAN() {
		Random random = new Random();
		String CIN = 10+random.nextInt(80)+"";
		String Abi = 12345+random.nextInt(87653)+"";
		String Guichet = 12345+random.nextInt(87653)+"";
		String numeroCompte1 = 1234567891+random.nextInt(876543210)+"";
		String NumeroCompte2 = 2+random.nextInt(5)+"";
		String CleDeControle = 9+random.nextInt(89)+"";
		return "FR"+CIN+Abi+Guichet+numeroCompte1+NumeroCompte2+CleDeControle;
	}
}
