class Museum{
    private String historicalMonuments[] = new String[16];
    int index;

    public boolean addMonument(String name){
        boolean isAdded = false;
        if(name != null && !name.isEmpty()){
            historicalMonuments[index++] = name;
            isAdded = true;
        }else{
            System.out.println(name + " is invalid");
        }
        return isAdded;
    }

    public void getHistoricalMonuments(){
        for(String n:historicalMonuments){
            System.out.println(n);
        }
    }
}
