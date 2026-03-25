class State{
    private String highwayNames[] = new String[9];
    int index;

    public boolean addHighwayName(String name){
        boolean isAdded = false;
        if(name != null && !name.isEmpty()){
            highwayNames[index++] = name;
            isAdded = true;
        }else{
            System.out.println(name + " is invalid");
        }
        return isAdded;
    }

    public void getHighwayNames(){
        for(String n:highwayNames){
            System.out.println(n);
        }
    }
}
