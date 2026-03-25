class GymExecutor{
	public static void main(String[] args){
		Gym gymManage = new Gym();
		boolean equipment1 = gymManage.addEquipmentName("dumble");
		boolean equipment2 = gymManage.addEquipmentName("threadmill");
		boolean equipment3 = gymManage.addEquipmentName("cycle");
		boolean equipment4 = gymManage.addEquipmentName("cross trainer");
		boolean equipment5 = gymManage.addEquipmentName("Elliptical");
		boolean equipment6 = gymManage.addEquipmentName("Bike");
		boolean equipment7 = gymManage.addEquipmentName("smith rack");
		boolean equipment8 = gymManage.addEquipmentName("free squat rack");
		boolean equipment9 = gymManage.addEquipmentName("large gantry frame");
		boolean equipment10 = gymManage.addEquipmentName("pullup machine");
		boolean equipment11= gymManage.addEquipmentName("roman chair");
		boolean equipment12= gymManage.addEquipmentName("kettlebell");
		boolean equipment13= gymManage.addEquipmentName("steerup machine");
		boolean equipment14= gymManage.addEquipmentName("butterfly ,achine");
		boolean equipment15= gymManage.addEquipmentName("chest pusher");
		boolean equipment16= gymManage.addEquipmentName("fitnesscana");
		
		gymManage.getEquipmentNames();
	}
}