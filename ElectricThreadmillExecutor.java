class ElectricThreadmillExecutor{
	
	public static void main(String[] exercise){
		boolean ref = ElectricThreadmill.onOrOff();
		System.out.println("The threadmill is :"+ref);
		
		ElectricThreadmill.increaseSpeed();
		ElectricThreadmill.increaseSpeed();
		ref = ElectricThreadmill.onOrOff();
		System.out.println("The ElectricThreadmill is :"+ref);
		ElectricThreadmill.increaseSpeed();
		ref = ElectricThreadmill.onOrOff();
		System.out.println("The ElectricThreadmill is :"+ref);
		ElectricThreadmill.increaseSpeed();
		ElectricThreadmill.increaseSpeed();
		ElectricThreadmill.increaseSpeed();
		ElectricThreadmill.increaseSpeed();
		ElectricThreadmill.increaseSpeed();
		ElectricThreadmill.increaseSpeed();
		ElectricThreadmill.increaseSpeed();
		
		ElectricThreadmill.decreaseSpeed();
		ElectricThreadmill.decreaseSpeed();
		ref = ElectricThreadmill.onOrOff();
		System.out.println("The ElectricThreadmill is :"+ref);
		ElectricThreadmill.decreaseSpeed();
		ref =ElectricThreadmill.onOrOff();
		System.out.println("The ElectricThreadmill is :"+ref);
		ElectricThreadmill.decreaseSpeed();
		ElectricThreadmill.decreaseSpeed();
		ElectricThreadmill.decreaseSpeed();
		ElectricThreadmill.decreaseSpeed();
		ElectricThreadmill.decreaseSpeed();
	    ElectricThreadmill.decreaseSpeed();
		ElectricThreadmill.decreaseSpeed();
	}
}