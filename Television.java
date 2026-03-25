class Television{
    private String channelNames[] = new String[17];
    int index;

    public boolean addChannelName(String name){
        boolean isAdded = false;
        if(name != null && !name.isEmpty()){
            channelNames[index++] = name;
            isAdded = true;
        }else{
            System.out.println(name + " is invalid");
        }
        return isAdded;
    }

    public void getChannelNames(){
        for(String n:channelNames){
            System.out.println(n);
        }
    }
}
