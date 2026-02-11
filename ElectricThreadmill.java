class ElectricThreadmill{
	
	//ref
	static boolean isTurnedOn ;
	
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
}