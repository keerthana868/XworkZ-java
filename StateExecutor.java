class StateExecutor{
    public static void main(String[] args){
        State obj = new State();

        boolean v1 = obj.addHighwayName("NH44");
        boolean v2 = obj.addHighwayName("NH48");
        boolean v3 = obj.addHighwayName("NH66");
        boolean v4 = obj.addHighwayName("NH75");
        boolean v5 = obj.addHighwayName("NH150");
        boolean v6 = obj.addHighwayName("NH275");
        boolean v7 = obj.addHighwayName("NH50");
        boolean v8 = obj.addHighwayName("NH52");
        boolean v9 = obj.addHighwayName("NH169");
        obj.getHighwayNames();
    }
}
