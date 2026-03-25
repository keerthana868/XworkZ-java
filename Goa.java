class Goa{
    private String beachNames[] = new String[19];
    int index;

    public boolean addBeachName(String name){
        boolean isAdded = false;
        if(name != null && !name.isEmpty()){
            beachNames[index++] = name;
            isAdded = true;
        }else{
            System.out.println(name + " is invalid");
        }
        return isAdded;
    }

    public void getBeachNames(){
        for(String n:beachNames){
            System.out.println(n);
        }
    }
}
