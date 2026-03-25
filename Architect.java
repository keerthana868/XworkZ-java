class Architect{
    private String interiorDesignNames[] = new String[11];
    int index;

    public boolean addInteriorDesign(String name){
        boolean isAdded = false;
        if(name != null && !name.isEmpty()){
            interiorDesignNames[index++] = name;
            isAdded = true;
        }else{
            System.out.println(name + " is invalid");
        }
        return isAdded;
    }

    public void getInteriorDesignNames(){
        for(String n:interiorDesignNames){
            System.out.println(n);
        }
    }
}
