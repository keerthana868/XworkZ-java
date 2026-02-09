class DefenceRecruitmentPortals{
	static void armyAccount(long registrationID,int password,int dateOfBirth,int captchaCode,int otp){
		System.out.println("The registration ID is:" + registrationID);
		System.out.println("The password is:" + password);
		System.out.println("The date of birth is:" + dateOfBirth);
		System.out.println("The captcha code is:" + captchaCode);
		System.out.println("The OTP is:" + otp);
	}
	public static void main(String[] args){
		armyAccount(65487396L,7654,29-02-2004,6543,7654);
		
	}
}