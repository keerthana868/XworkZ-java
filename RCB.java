class RCB{
    private String playerNames[] = new String[15];
    int index;

    public boolean addPlayerName(String name){
        boolean isAdded = false;
        if(name != null && !name.isEmpty()){
            playerNames[index++] = name;
            isAdded = true;
        }else{
            System.out.println(name + " is invalid");
        }
        return isAdded;
    }

    public void getPlayerNames(){
        for(String n:playerNames){
            System.out.println(n);
        }
    }
}
