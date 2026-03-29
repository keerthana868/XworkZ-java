class StateExecutor {
    public static void main(String[] args) {
        State obj = new State();

        obj.addHighwayName("NH44");
        obj.addHighwayName("NH48");
        obj.addHighwayName("NH66");
        obj.addHighwayName("NH75");
        obj.addHighwayName("NH150");
        obj.addHighwayName("NH275");
        obj.addHighwayName("NH50");
        obj.addHighwayName("NH52");
        obj.addHighwayName("NH169");

        System.out.println("All Items:");
        obj.getHighwayNames();

        int index = obj.search("NH44");
        System.out.println("Index: " + index);

        obj.update("NH44", "NH44 Updated");
        obj.delete("NH169");

        System.out.println("Final Data:");
        obj.getHighwayNames();
    }
}
