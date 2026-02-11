class MicrowaveOven{
	
	//ref
	static boolean isTurnedOn ;
	
	   static boolean onOrOff(){
		   if(isTurnedOn == false ){
			  isTurnedOn = true ;
			  System.out.println("The oven is turned on..");
		   }else if(isTurnedOn == true){
			   isTurnedOn = false;
			   System.out.println("The oven is turned off..");
		   }
		   
		   return isTurnedOn;
	   }
}