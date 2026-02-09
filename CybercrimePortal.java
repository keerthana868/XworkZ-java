class CybercrimePortal{
	static void newAccount(String email,int otp,String captchaCode,String idVerification){
		System.out.println("the email is:" + email);
		System.out.println("the OTP is:" + otp);
		System.out.println("the captcha code is:" + captchaCode);
		System.out.println("the id verification is:" + idVerification);
	}
		
	public static void main(String[] args){
		newAccount("jhon123@gmail.com",8976,"uhk65","jhongeorge");
		
	}
}