class TelevisionExecutor {
    public static void main(String[] args) {
        Television obj = new Television();

        obj.addChannelName("Star Plus");
        obj.addChannelName("Zee TV");
        obj.addChannelName("Colors");
        obj.addChannelName("Sony TV");
        obj.addChannelName("Sun TV");
        obj.addChannelName("Gemini TV");
        obj.addChannelName("Udaya TV");
        obj.addChannelName("Asianet");
        obj.addChannelName("ETV");
        obj.addChannelName("Discovery");
        obj.addChannelName("National Geographic");
        obj.addChannelName("Cartoon Network");
        obj.addChannelName("Pogo");
        obj.addChannelName("Nickelodeon");
        obj.addChannelName("Star Sports");
        obj.addChannelName("Sony Sports");
        obj.addChannelName("DD National");

        System.out.println("All Items:");
        obj.getChannelNames();

        int index = obj.search("Star Plus");
        System.out.println("Index: " + index);

        obj.update("Star Plus", "Star Plus Updated");
        obj.delete("DD National");

        System.out.println("Final Data:");
        obj.getChannelNames();
    }
}

