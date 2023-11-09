package net.expertbank.services;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.Key;
import java.security.KeyStore;
import java.security.PrivateKey;

public class JwtService {
	static {
		FileInputStream inFile = null;
		char[] password = "xDeZhVsjzI4nuav".toCharArray();
		String alias = "alias";
		PrivateKey pk = null;
		try {
			KeyStore ks = KeyStore.getInstance("JKS");
			String configDir = System.getProperty("jboss.server.config.dir");
			String keystorePath = File.separator +"jwtKeyStore.keyStore";
			inFile = new FileInputStream(keystorePath);
			ks.load(inFile, password);
			Key key = ks.getKey(alias, password);
			if(key instanceof PrivateKey) {
				pk = (PrivateKey) key;
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(inFile != null) {
				try {
					inFile.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		privateKey = pk;
	}
	
	private static final PrivateKey privateKey;
	private static final int TOKEN_VALIDITY = 14400;
	private static final String CLAIM_ROLES = "groups";
	private static final String ISSUER = "quickstart-jwt-issuer";
	private static final String AUDIENCE = "jwt-audience";
	
	public static int getTokenValidity() {
		return TOKEN_VALIDITY;
	}



	public static String getClaimRoles() {
		return CLAIM_ROLES;
	}



	public static String getIssuer() {
		return ISSUER;
	}



	public static String getAudience() {
		return AUDIENCE;
	}



	public static PrivateKey getPrivateKey() {
		return privateKey;
	}

}
