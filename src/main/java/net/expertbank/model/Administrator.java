package net.expertbank.model;

public class Administrator extends Operator{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public Administrator setName(String name) {
		// TODO Auto-generated method stub
		 super.setName(name);
		 return this;
	}

	@Override
	public Administrator setFirstName(String firstName) {
		// TODO Auto-generated method stub
		 super.setFirstName(firstName);
		 return this;
	}

	@Override
	public Administrator setPhoneNumber(String phoneNumber) {
		// TODO Auto-generated method stub
		 super.setPhoneNumber(phoneNumber);
		 return this;
	}

	@Override
	public Administrator setActive(boolean active) {
		// TODO Auto-generated method stub
		 super.setActive(active);
		 return this;
	}

	@Override
	public Administrator setEmail(String email) {
		// TODO Auto-generated method stub
		 super.setEmail(email);
		 return this;
	}

	@Override
	public Administrator setPassword(String password) {
		// TODO Auto-generated method stub
		 super.setPassword(password);
		 return this;
	}

	@Override
	public Administrator setSalt(String salt) {
		// TODO Auto-generated method stub
		 super.setSalt(salt);
		 return this;
	}
}
