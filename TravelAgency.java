class TravelAgency{
    private String places[] = new String[17];
    int index;

    public boolean addPlace(String name){
        boolean isAdded = false;
        if(name != null && !name.isEmpty()){
            places[index++] = name;
            isAdded = true;
        }else{
            System.out.println(name + " is invalid");
        }
        return isAdded;
    }

    public void getPlaces(){
        for(String n:places){
            System.out.println(n);
        }
    }
}
