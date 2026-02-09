class StudentPortal{
	static void studentAccount(String studentName,String studentRollno,String password,String captchaCode,String roll,String forgotPassword){
		System.out.println("The name of the student is:" + studentName);
		System.out.println("The rollno of the student is:" + studentRollno);
		System.out.println("The password is:" + password);
        System.out.println("The captcha code is:" + captchaCode);
		System.out.println("The roll of the candidate is:" + roll);
		System.out.println("The message popup of forgot password is:" + forgotPassword);
	}
		
	public static void main(String[] args){
		studentAccount("Keerthana J","4AI22CS040","kushi5678","ycv1465","Student","Forgot password?");
		
		
	}
}
		