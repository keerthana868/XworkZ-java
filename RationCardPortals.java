class RationCardPortals{
	static void firstAccount(long rationCardNumber,String password,int otp,String captchaCode,String familyMembersVerify){
		System.out.println("The ration number is:" + rationCardNumber);
		System.out.println("The password is:" + password);
		System.out.println("The OTP is:" + otp);
		System.out.println("The captcha code is:" + captchaCode);
		System.out.println("The verification from family memebers is:" + familyMembersVerify);
	}
	public static void main(String[] args){
		firstAccount(675845674L,"hygkjd@456",7898,"ghy67","Yes");
		
	}
}
