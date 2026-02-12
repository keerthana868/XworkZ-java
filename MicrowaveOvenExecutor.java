class MicrowaveOvenExecutor{
	
	public static void main(String[] food){
		boolean ref = MicrowaveOven.onOrOff();
		System.out.println("The oven is :"+ref);
		
		MicrowaveOven.increaseTemperature();
		MicrowaveOven.increaseTemperature();
		ref = MicrowaveOven.onOrOff();
		System.out.println("The oven is :"+ref);
		MicrowaveOven.increaseTemperature();
		ref = MicrowaveOven.onOrOff();
		System.out.println("The oven is :"+ref);
		MicrowaveOven.increaseTemperature();
		MicrowaveOven.increaseTemperature();
		MicrowaveOven.increaseTemperature();
		MicrowaveOven.increaseTemperature();
		MicrowaveOven.increaseTemperature();
		MicrowaveOven.increaseTemperature();
		MicrowaveOven.increaseTemperature();
		
		MicrowaveOven.decreaseTemperature();
		MicrowaveOven.decreaseTemperature();
		ref = MicrowaveOven.onOrOff();
		System.out.println("The oven is :"+ref);
		MicrowaveOven.decreaseTemperature();
		ref = MicrowaveOven.onOrOff();
		System.out.println("The oven is :"+ref);
		MicrowaveOven.decreaseTemperature();
		MicrowaveOven.decreaseTemperature();
		MicrowaveOven.decreaseTemperature();
		MicrowaveOven.decreaseTemperature();
		MicrowaveOven.decreaseTemperature();
		MicrowaveOven.decreaseTemperature();
		MicrowaveOven.decreaseTemperature();
	}
}