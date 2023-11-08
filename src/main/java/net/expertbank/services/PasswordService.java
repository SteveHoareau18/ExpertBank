package net.expertbank.services;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.util.Base64;
import java.util.Base64.Encoder;

import org.wildfly.security.WildFlyElytronProvider;
import org.wildfly.security.password.Password;
import org.wildfly.security.password.PasswordFactory;
import org.wildfly.security.password.interfaces.BCryptPassword;
import org.wildfly.security.password.spec.EncryptablePasswordSpec;
import org.wildfly.security.password.spec.IteratedSaltedPasswordAlgorithmSpec;
import org.wildfly.security.password.util.ModularCrypt;

import net.expertbank.model.SaltedPassword;

@SuppressWarnings("deprecation")
public class PasswordService {
	
	static final Provider ELYTRON_PROVIDER = new WildFlyElytronProvider();
	
	public static SaltedPassword toSecurePassword(String s) {
		PasswordFactory passwordFactory = null;
		try {
			passwordFactory = PasswordFactory.getInstance(BCryptPassword.ALGORITHM_BCRYPT, ELYTRON_PROVIDER);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		
	    int iterationCount = 6;

	    byte[] salt = new byte[BCryptPassword.BCRYPT_SALT_SIZE];
	    SecureRandom random = new SecureRandom();
	    random.nextBytes(salt);

	    IteratedSaltedPasswordAlgorithmSpec iteratedAlgorithmSpec = new IteratedSaltedPasswordAlgorithmSpec(iterationCount, salt);
	    EncryptablePasswordSpec encryptableSpec = new EncryptablePasswordSpec(s.toCharArray(), iteratedAlgorithmSpec);
	    
	    BCryptPassword original = null;
		try {
			original = (BCryptPassword) passwordFactory.generatePassword(encryptableSpec);
		} catch (InvalidKeySpecException e) {
			e.printStackTrace();
		}

	    byte[] hash = original.getHash();
	    
	    Encoder encoder = Base64.getEncoder();
	    
	    SaltedPassword saltedPassword = new SaltedPassword();
	    saltedPassword.setPassword(encoder.encodeToString(hash)).setSalt(encoder.encodeToString(salt));
		
		return saltedPassword;
	}

	public static boolean isPasswordEquals(SaltedPassword saltedPassword, SaltedPassword saltedPassword2) {
		PasswordFactory passwordFactory = null;
		try {
			passwordFactory = PasswordFactory.getInstance(BCryptPassword.ALGORITHM_BCRYPT, ELYTRON_PROVIDER);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} 
		Password password = null;
		try {
			password = ModularCrypt.decode(saltedPassword.getPassword());
		} catch (InvalidKeySpecException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Password userPasswordRestored = null;
		try {
			userPasswordRestored = passwordFactory.translate(password);
		} catch (InvalidKeyException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

        // Verify existing user password you want to verify
        try {
			return passwordFactory.verify(userPasswordRestored, saltedPassword.getPassword().toCharArray());
		} catch (InvalidKeyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return false;
	}
}
