class Government{
    private String competitiveExamNames[] = new String[9];
    int index;

    public boolean addExamName(String name){
        boolean isAdded = false;
        if(name != null && !name.isEmpty()){
            competitiveExamNames[index++] = name;
            isAdded = true;
        }else{
            System.out.println(name + " is invalid");
        }
        return isAdded;
    }

    public void getCompetitiveExamNames(){
        for(String n:competitiveExamNames){
            System.out.println(n);
        }
    }
}
