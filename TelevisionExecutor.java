class TelevisionExecutor{
    public static void main(String[] args){
        Television obj = new Television();

        boolean v1 = obj.addChannelName("Star Plus");
        boolean v2 = obj.addChannelName("Zee TV");
        boolean v3 = obj.addChannelName("Colors");
        boolean v4 = obj.addChannelName("Sony TV");
        boolean v5 = obj.addChannelName("Sun TV");
        boolean v6 = obj.addChannelName("Gemini TV");
        boolean v7 = obj.addChannelName("Udaya TV");
        boolean v8 = obj.addChannelName("Asianet");
        boolean v9 = obj.addChannelName("ETV");
        boolean v10 = obj.addChannelName("Discovery");
        boolean v11 = obj.addChannelName("National Geographic");
        boolean v12 = obj.addChannelName("Cartoon Network");
        boolean v13 = obj.addChannelName("Pogo");
        boolean v14 = obj.addChannelName("Nickelodeon");
        boolean v15 = obj.addChannelName("Star Sports");
        boolean v16 = obj.addChannelName("Sony Sports");
        boolean v17 = obj.addChannelName("DD National");
        obj.getChannelNames();
    }
}
