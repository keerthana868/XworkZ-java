class PetShop{
    private String petAccessories[] = new String[20];
    int index;

    public boolean addAccessory(String name){
        boolean isAdded = false;
        if(name != null && !name.isEmpty()){
            petAccessories[index++] = name;
            isAdded = true;
        }else{
            System.out.println(name + " is invalid");
        }
        return isAdded;
    }

    public void getPetAccessories(){
        for(String n:petAccessories){
            System.out.println(n);
        }
    }
}
