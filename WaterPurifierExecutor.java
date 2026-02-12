class WaterPurifierExecutor{
	
	public static void main(String[] water){
		boolean ref = WaterPurifier.onOrOff();
		System.out.println("The water purifier is :"+ref);
		
		WaterPurifier.increaseSpeed();
		WaterPurifier.increaseSpeed();
		ref = WaterPurifier.onOrOff();
		System.out.println("The water purifier is :"+ref);
		WaterPurifier.increaseSpeed();
		ref = WaterPurifier.onOrOff();
		System.out.println("The water purifier is :"+ref);
		WaterPurifier.increaseSpeed();
		WaterPurifier.increaseSpeed();
		WaterPurifier.increaseSpeed();
		WaterPurifier.increaseSpeed();
		WaterPurifier.increaseSpeed();
		WaterPurifier.increaseSpeed();
		WaterPurifier.increaseSpeed();
		
		WaterPurifier.decreaseSpeed();
		WaterPurifier.decreaseSpeed();
		ref = WaterPurifier.onOrOff();
		System.out.println("The Water purifier is :"+ref);
		WaterPurifier.decreaseSpeed();
		ref = WaterPurifier.onOrOff();
		System.out.println("The Water purifier is :"+ref);
		WaterPurifier.decreaseSpeed();
		WaterPurifier.decreaseSpeed();
		WaterPurifier.decreaseSpeed();
		WaterPurifier.decreaseSpeed();
		WaterPurifier.decreaseSpeed();
		WaterPurifier.decreaseSpeed();
		WaterPurifier.decreaseSpeed();
	}
}