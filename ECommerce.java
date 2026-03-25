class ECommerce{
    private String productNames[] = new String[26];
    int index;

    public boolean addProductName(String name){
        boolean isAdded = false;
        if(name != null && !name.isEmpty()){
            productNames[index++] = name;
            isAdded = true;
        }else{
            System.out.println(name + " is invalid");
        }
        return isAdded;
    }

    public void getProductNames(){
        for(String n:productNames){
            System.out.println(n);
        }
    }
}
