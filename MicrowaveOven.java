class MicrowaveOven{
	
	static boolean isTurnedOn;
    static int currentTemperature;
	static int maxTemperature=8;
	static int minTemperature;	
	
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
	   static void increaseTemperature(){
		   
		   if(isTurnedOn==true){
			   if(currentTemperature<maxTemperature){
				   currentTemperature+=1;
				   System.out.println("The current Temperature is:"+currentTemperature);
			   }else{
				   System.out.println("The current Temperature reached its maximum Temperature.");
		       }
		    }else{
			  System.out.println("Please first Turn on the oven");
			}
	   }
	   
	   static void decreaseTemperature(){
		   
		   if(isTurnedOn==true){
			   if(currentTemperature>minTemperature){
				   currentTemperature-=1;
				   System.out.println("The current Temperature is:"+currentTemperature);
			   }else{
				   System.out.println("The current Temperature reached its minimum Temperature.");
		       }
		    }else{
			  System.out.println("Please first Turn on the oven");
			}
	   }
}