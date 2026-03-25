class AirAsia{
    private String passengers[] = new String[30];
    int index;

    public boolean addPassenger(String name){
        boolean isAdded = false;
        if(name != null && !name.isEmpty()){
            passengers[index++] = name;
            isAdded = true;
        }else{
            System.out.println(name + " is invalid");
        }
        return isAdded;
    }

    public void getPassengers(){
        for(String n:passengers){
            System.out.println(n);
        }
    }
}
