class Wonderla{
    private String waterGames[] = new String[20];
    int index;

    public boolean addWaterGame(String name){
        boolean isAdded = false;
        if(name != null && !name.isEmpty()){
            waterGames[index++] = name;
            isAdded = true;
        }else{
            System.out.println(name + " is invalid");
        }
        return isAdded;
    }

    public void getWaterGames(){
        for(String n:waterGames){
            System.out.println(n);
        }
    }
}
