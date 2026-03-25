class PlayList{
    private String songNames[] = new String[15];
    int index;

    public boolean addSongName(String name){
        boolean isAdded = false;
        if(name != null && !name.isEmpty()){
            songNames[index++] = name;
            isAdded = true;
        }else{
            System.out.println(name + " is invalid");
        }
        return isAdded;
    }

    public void getSongNames(){
        for(String n:songNames){
            System.out.println(n);
        }
    }
}
