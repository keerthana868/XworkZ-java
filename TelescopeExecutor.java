class TelescopeExecutor{
      public static void main(String[] args){
	  
		Telescope t1 = new Telescope(2401);
        Telescope t2 = new Telescope("James Webb");
        Telescope t3 = new Telescope(1000.0);
        Telescope t4 = new Telescope(6500, "Korsch");
        Telescope t5 = new Telescope(6500.0, "NASA", 2021);
        Telescope t6 = new Telescope(1500000.0, 5000);
        Telescope t7 = new Telescope("6.5m", true);
        System.out.println("-------------------------");
		}
}		