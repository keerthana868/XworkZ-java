class ElectricChimneyExecutor{
	
	public static void main(String[] chimney){
		boolean ref = ElectricChimney.onOrOff();
		System.out.println("The chimney is :"+ref);
		
		ElectricChimney.increaseSpeed();
		ElectricChimney.increaseSpeed();
		ref = ElectricChimney.onOrOff();
		System.out.println("The ElectricChimney is :"+ref);
		ElectricChimney.increaseSpeed();
		ref = ElectricChimney.onOrOff();
		System.out.println("The ElectricChimney is :"+ref);
		ElectricChimney.increaseSpeed();
		ElectricChimney.increaseSpeed();
		ElectricChimney.increaseSpeed();
		ElectricChimney.increaseSpeed();
		ElectricChimney.increaseSpeed();
		ElectricChimney.increaseSpeed();
		ElectricChimney.increaseSpeed();
		
		ElectricChimney.decreaseSpeed();
		ElectricChimney.decreaseSpeed();
		ref = ElectricChimney.onOrOff();
		System.out.println("The ElectricChimney is :"+ref);
		ElectricChimney.decreaseSpeed();
		ref =ElectricChimney.onOrOff();
		System.out.println("The ElectricChimney is :"+ref);
		ElectricChimney.decreaseSpeed();
		ElectricChimney.decreaseSpeed();
		ElectricChimney.decreaseSpeed();
		ElectricChimney.decreaseSpeed();
		ElectricChimney.decreaseSpeed();
	    ElectricChimney.decreaseSpeed();
		ElectricChimney.decreaseSpeed();
	}
}