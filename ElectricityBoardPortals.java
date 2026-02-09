class ElectricityBoardPortals{
	static void electricAccount(String consumerName,int password,int captchaCode,int otp){
		System.out.println("The name of the consumer is:" + consumerName);
		System.out.println("The password is:" + password);
		System.out.println("The captcha code is:" + captchaCode);
		System.out.println("The OTP is:" + otp);
	}
		
	public static void main(String[] args){
		electricAccount("Hima",7654,6543,76540);
		
		
	}
}