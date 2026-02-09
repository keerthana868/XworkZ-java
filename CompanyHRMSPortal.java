class CompanyHRMSPortal{
	
	static void companyAccount(String employeeName,String employeeId,String password,int otp,String biometric,String roll){
		System.out.println("The name of employee is:" + employeeName);
		System.out.println("The ID of employee is:" + employeeId);
		System.out.println("The OTP provided is:" + otp);
		System.out.println("The biometric recognition is:" + biometric);
		System.out.println("The roll provided to employee is:" + roll);
	}
		
	public static void main(String[] args){
		companyAccount("Chandu","UKNI6789","UKNI6789",8796,"face recognition","developer");
		
	}
}
		