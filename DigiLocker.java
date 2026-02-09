class DigiLocker{
	
	static void oneAccount(long mobileNumber,String userName,String password,int otp,long adharNumber){
	    System.out.println("The mobile number is:" + mobileNumber);
		System.out.println("The user name is:" + userName);
		System.out.println("The password is:" + password);
		System.out.println("The OTP provided is:" + otp);
		System.out.println("The Adhar number is:" + adharNumber);
    }

	public static void main(String[] args){
		oneAccount(8147936281L,"lokdeep@gmail.com","lok12345",890700,345676548649L);
		
	}
}
		
		