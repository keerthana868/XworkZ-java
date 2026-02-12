class HomeTheatreExecutor{
	
	public static void main(String[] screen){
		boolean ref = HomeTheatre.onOrOff();
		System.out.println("The home theatre is :"+ref);
		
		HomeTheatre.increaseSpeed();
		HomeTheatre.increaseSpeed();
		ref = HomeTheatre.onOrOff();
		System.out.println("The HomeTheatre is :"+ref);
		HomeTheatre.increaseSpeed();
		ref = HomeTheatre.onOrOff();
		System.out.println("TheHomeTheatre is :"+ref);
		HomeTheatre.increaseSpeed();
		HomeTheatre.increaseSpeed();
		HomeTheatre.increaseSpeed();
		HomeTheatre.increaseSpeed();
		HomeTheatre.increaseSpeed();
		HomeTheatre.increaseSpeed();
		HomeTheatre.increaseSpeed();
		
		HomeTheatre.decreaseSpeed();
		HomeTheatre.decreaseSpeed();
		ref = HomeTheatre.onOrOff();
		System.out.println("The HomeTheatre is :"+ref);
		HomeTheatre.decreaseSpeed();
		ref =HomeTheatre.onOrOff();
		System.out.println("The HomeTheatre is :"+ref);
		HomeTheatre.decreaseSpeed();
		HomeTheatre.decreaseSpeed();
		HomeTheatre.decreaseSpeed();
		HomeTheatre.decreaseSpeed();
		HomeTheatre.decreaseSpeed();
	    HomeTheatre.decreaseSpeed();
		HomeTheatre.decreaseSpeed();
	}
}