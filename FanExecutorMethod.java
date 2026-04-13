class FanExecutorMethod{
	public static void main(String[] f){
		
		Capacitor capacitor = new Capacitor();
		capacitor.capacitance = 2.5;
		capacitor.voltageRating = 400;
		capacitor.frequency = 50;
		capacitor.reactance = 1273.0;
		capacitor.current = 0.5;
		capacitor.powerFactor = 0.85;
		Fan fan = new Fan();
		fan.addCapacitor(capacitor);
		
		fan.getCapacitor();
	}
}