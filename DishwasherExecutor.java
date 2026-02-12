class DishwasherExecutor{
	
	public static void main(String[] dish){
		boolean ref = Dishwasher.onOrOff();
		System.out.println("The dishwasher is :"+ref);
		
		Dishwasher.increaseSpeed();
		Dishwasher.increaseSpeed();
		ref = Dishwasher.onOrOff();
		System.out.println("The dish washer is :"+ref);
		Dishwasher.increaseSpeed();
		ref = Dishwasher.onOrOff();
		System.out.println("The dish washer is :"+ref);
		Dishwasher.increaseSpeed();
		Dishwasher.increaseSpeed();
		Dishwasher.increaseSpeed();
		Dishwasher.increaseSpeed();
		Dishwasher.increaseSpeed();
		Dishwasher.increaseSpeed();
		Dishwasher.increaseSpeed();
		
		Dishwasher.decreaseSpeed();
		Dishwasher.decreaseSpeed();
		ref = Dishwasher.onOrOff();
		System.out.println("The dish washer is :"+ref);
		Dishwasher.decreaseSpeed();
		ref = Dishwasher.onOrOff();
		System.out.println("The dish washer is :"+ref);
		Dishwasher.decreaseSpeed();
		Dishwasher.decreaseSpeed();
		Dishwasher.decreaseSpeed();
		Dishwasher.decreaseSpeed();
		Dishwasher.decreaseSpeed();
		Dishwasher.decreaseSpeed();
		Dishwasher.decreaseSpeed();
	}

}