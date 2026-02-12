class SmartSpeakerExecutor{
	
	public static void main(String[] sound){
		boolean ref = SmartSpeaker.onOrOff();
		System.out.println("The speaker is :"+ref);
		
		SmartSpeaker.increaseSpeed();
		SmartSpeaker.increaseSpeed();
		ref = SmartSpeaker.onOrOff();
		System.out.println("The SmartSpeaker is :"+ref);
		SmartSpeaker.increaseSpeed();
		ref = SmartSpeaker.onOrOff();
		System.out.println("The SmartSpeaker is :"+ref);
		SmartSpeaker.increaseSpeed();
		SmartSpeaker.increaseSpeed();
		SmartSpeaker.increaseSpeed();
		SmartSpeaker.increaseSpeed();
		SmartSpeaker.increaseSpeed();
		SmartSpeaker.increaseSpeed();
		SmartSpeaker.increaseSpeed();
		
		SmartSpeaker.decreaseSpeed();
		SmartSpeaker.decreaseSpeed();
		ref = SmartSpeaker.onOrOff();
		System.out.println("The SmartSpeaker is :"+ref);
		SmartSpeaker.decreaseSpeed();
		ref =SmartSpeaker.onOrOff();
		System.out.println("The SmartSpeaker is :"+ref);
		SmartSpeaker.decreaseSpeed();
		SmartSpeaker.decreaseSpeed();
		SmartSpeaker.decreaseSpeed();
		SmartSpeaker.decreaseSpeed();
		SmartSpeaker.decreaseSpeed();
	    SmartSpeaker.decreaseSpeed();
		SmartSpeaker.decreaseSpeed();
	}
}