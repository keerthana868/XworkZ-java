class AirPurifierExecutor{
	
	public static void main(String[] air){
		boolean ref = AirPurifier.onOrOff();
		System.out.println("The air purifier is :"+ref);
		
		AirPurifier.increaseSpeed();
		AirPurifier.increaseSpeed();
		ref = AirPurifier.onOrOff();
		System.out.println("The dish washer is :"+ref);
		AirPurifier.increaseSpeed();
		ref = AirPurifier.onOrOff();
		System.out.println("The dish washer is :"+ref);
		AirPurifier.increaseSpeed();
		AirPurifier.increaseSpeed();
		AirPurifier.increaseSpeed();
		AirPurifier.increaseSpeed();
		AirPurifier.increaseSpeed();
		AirPurifier.increaseSpeed();
		AirPurifier.increaseSpeed();
		
		AirPurifier.decreaseSpeed();
		AirPurifier.decreaseSpeed();
		ref = AirPurifier.onOrOff();
		System.out.println("The air purifier is :"+ref);
		AirPurifier.decreaseSpeed();
		ref = AirPurifier.onOrOff();
		System.out.println("The air purifier is :"+ref);
		AirPurifier.decreaseSpeed();
		AirPurifier.decreaseSpeed();
		AirPurifier.decreaseSpeed();
		AirPurifier.decreaseSpeed();
		AirPurifier.decreaseSpeed();
		AirPurifier.decreaseSpeed();
		AirPurifier.decreaseSpeed();
	}
}