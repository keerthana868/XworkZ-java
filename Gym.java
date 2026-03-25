class Gym{
	private String equipmentNames[] = new String[16];
	int index;
	
	public boolean addEquipmentName(String equipmentName){
		boolean isEquipmentAdded = false;
		if(equipmentName != null && !equipmentName.isEmpty()){
			equipmentNames[index] = equipmentName;
			index++;
			isEquipmentAdded = true;
		}else{
			System.out.println(equipmentName +"is invalid");
		}
		return isEquipmentAdded;
	}
	public void getEquipmentNames(){
		for(String equipmentName:equipmentNames){
			System.out.println(equipmentName);
		}
	}
}

