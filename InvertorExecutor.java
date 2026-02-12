class InvertorExecutor{
	
	public static void main(String[] current){
		boolean ref = Invertor.onOrOff();
		System.out.println("The invertor is :"+ref);
		
		Invertor.increaseSpeed();
		Invertor.increaseSpeed();
		ref = Invertor.onOrOff();
		System.out.println("The Invertor is :"+ref);
		Invertor.increaseSpeed();
		ref = Invertor.onOrOff();
		System.out.println("The Invertor is :"+ref);
		Invertor.increaseSpeed();
		Invertor.increaseSpeed();
		Invertor.increaseSpeed();
		Invertor.increaseSpeed();
		Invertor.increaseSpeed();
		Invertor.increaseSpeed();
		Invertor.increaseSpeed();
		
		Invertor.decreaseSpeed();
		Invertor.decreaseSpeed();
		ref = Invertor.onOrOff();
		System.out.println("The Invertor is :"+ref);
		Invertor.decreaseSpeed();
		ref =Invertor.onOrOff();
		System.out.println("The Invertor is :"+ref);
		Invertor.decreaseSpeed();
		Invertor.decreaseSpeed();
		Invertor.decreaseSpeed();
		Invertor.decreaseSpeed();
		Invertor.decreaseSpeed();
	    Invertor.decreaseSpeed();
		Invertor.decreaseSpeed();
	}
}