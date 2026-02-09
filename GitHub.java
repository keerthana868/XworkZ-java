class GitHub{
	static void newGitAccount(String email,String password,String twoFactorAuth,String passkeys,String sessionManagement){
		System.out.println("the mail id is:" + email);
		System.out.println("the password is:" + password);
		System.out.println("the two step verification is:" + twoFactorAuth);
		System.out.println("the passkey is:" + passkeys);
		System.out.println("the session management pass is:" + sessionManagement);
	}
	public static void main(String[] args){
		newGitAccount("keerthana@gmail.com","pass3456@1234","pass3456@1234","Password","userpass");
		
		
	}
}	