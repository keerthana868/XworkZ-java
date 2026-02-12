class InductionStoveExecutor{
	
	public static void main(String[] stove){
		boolean ref = InductionStove.onOrOff();
		System.out.println("The stove is :"+ref);
		
		InductionStove.increaseTemperature();
		InductionStove.increaseTemperature();
		ref = InductionStove.onOrOff();
		System.out.println("The stove is :"+ref);
		InductionStove.increaseTemperature();
		ref = InductionStove.onOrOff();
		System.out.println("The stove is :"+ref);
		InductionStove.increaseTemperature();
		InductionStove.increaseTemperature();
		InductionStove.increaseTemperature();
		InductionStove.increaseTemperature();
		InductionStove.increaseTemperature();
		InductionStove.increaseTemperature();
		InductionStove.increaseTemperature();
		
		InductionStove.decreaseTemperature();
		InductionStove.decreaseTemperature();
		ref = InductionStove.onOrOff();
		System.out.println("The stove is :"+ref);
		InductionStove.decreaseTemperature();
		ref = InductionStove.onOrOff();
		System.out.println("The stove is :"+ref);
		InductionStove.decreaseTemperature();
		InductionStove.decreaseTemperature();
		InductionStove.decreaseTemperature();
		InductionStove.decreaseTemperature();
		InductionStove.decreaseTemperature();
		InductionStove.decreaseTemperature();
		InductionStove.decreaseTemperature();
	}
}
	
