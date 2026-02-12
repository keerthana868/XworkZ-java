class ElectricThreadmill{
	
	static boolean isTurnedOn ;
	static int currentSpeed;
	static int maxSpeed=8;
	static int minSpeed;
	
	   static boolean onOrOff(){
		   if(isTurnedOn == false ){
			  isTurnedOn = true ;
			  System.out.println("The threadmill is turned on..");
		   }else if(isTurnedOn == true){
			   isTurnedOn = false;
			   System.out.println("The threadmill is turned off..");
		   }
		   
		   return isTurnedOn;
	   }
	   static void increaseSpeed(){
		   
		   if(isTurnedOn==true){
			   if(currentSpeed<maxSpeed){
				   currentSpeed+=1;
				   System.out.println("The current Speed is:"+currentSpeed);
			   }else{
				   System.out.println("The current Speed reached its maximum Speed.");
		       }
		    }else{
			  System.out.println("Please first Turn on the threadmill");
			}
	   }
	   
	   static void decreaseSpeed(){
		   
		   if(isTurnedOn==true){
			   if(currentSpeed>minSpeed){
				   currentSpeed-=1;
				   System.out.println("The current Speed is:"+currentSpeed);
			   }else{
				   System.out.println("The current Speed reached its minimum Speed.");
		       }
		    }else{
			  System.out.println("Please first Turn on the threadmill");
			}
	   }
}