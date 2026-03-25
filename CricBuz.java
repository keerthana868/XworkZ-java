class CricBuz{
    private String teamNames[] = new String[8];
    int index;

    public boolean addTeamName(String name){
        boolean isAdded = false;
        if(name != null && !name.isEmpty()){
            teamNames[index++] = name;
            isAdded = true;
        }else{
            System.out.println(name + " is invalid");
        }
        return isAdded;
    }

    public void getTeamNames(){
        for(String n:teamNames){
            System.out.println(n);
        }
    }
}
