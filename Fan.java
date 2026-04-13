class Fan{
	int fanId;
	Capacitor capacitor;
	
	Fan(){}
	
	Fan(int fanId, Capacitor capacitor){
		System.out.println("Constructor is started");
		this.fanId = fanId;
		this.capacitor = capacitor;
		System.out.println("Constructor is ended");
	}
	
	public boolean addCapacitor(Capacitor capacitor){
		boolean isCapacitorSaved = false;
		System.out.println("Add Capacitor Method started:");
		this.capacitor = capacitor;
		isCapacitorSaved = true;
		System.out.println("Add Capacitor Method ended:");
		return isCapacitorSaved;
	}
	
	public void getCapacitor(){
		System.out.println("Capacitor info:");
		System.out.println("Capacitance:"+capacitor.capacitance);
		System.out.println("Voltage rating:"+capacitor.voltageRating);
		System.out.println("Frequency:"+capacitor.frequency);
		System.out.println("Reactance:"+capacitor.reactance);
		System.out.println("Current:"+capacitor.current);
		System.out.println("Power Factory:"+capacitor.powerFactor);
	}
}