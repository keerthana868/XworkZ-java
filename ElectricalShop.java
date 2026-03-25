class ElectricalShop{
    private String appliances[] = new String[20];
    int index;

    public boolean addAppliance(String name){
        boolean isAdded = false;
        if(name != null && !name.isEmpty()){
            appliances[index++] = name;
            isAdded = true;
        }else{
            System.out.println(name + " is invalid");
        }
        return isAdded;
    }

    public void getAppliances(){
        for(String n:appliances){
            System.out.println(n);
        }
    }
}
