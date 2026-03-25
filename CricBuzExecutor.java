class CricBuzExecutor{
    public static void main(String[] args){
        CricBuz obj = new CricBuz();

        boolean v1 = obj.addTeamName("India");
        boolean v2 = obj.addTeamName("Australia");
        boolean v3 = obj.addTeamName("England");
        boolean v4 = obj.addTeamName("South Africa");
        boolean v5 = obj.addTeamName("New Zealand");
        boolean v6 = obj.addTeamName("Pakistan");
        boolean v7 = obj.addTeamName("Sri Lanka");
        boolean v8 = obj.addTeamName("West Indies");
        obj.getTeamNames();
    }
}

