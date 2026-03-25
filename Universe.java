class Universe{
    private String galaxies[] = new String[17];
    int index;

    public boolean addGalaxy(String name){
        boolean isAdded = false;
        if(name != null && !name.isEmpty()){
            galaxies[index++] = name;
            isAdded = true;
        }else{
            System.out.println(name + " is invalid");
        }
        return isAdded;
    }

    public void getGalaxies(){
        for(String n:galaxies){
            System.out.println(n);
        }
    }
}
