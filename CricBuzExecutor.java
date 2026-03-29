class CricBuzExecutor {
    public static void main(String[] args) {
        CricBuz obj = new CricBuz();

        obj.addTeamName("India");
        obj.addTeamName("Australia");
        obj.addTeamName("England");
        obj.addTeamName("South Africa");
        obj.addTeamName("New Zealand");
        obj.addTeamName("Pakistan");
        obj.addTeamName("Sri Lanka");
        obj.addTeamName("West Indies");

        System.out.println("All Items:");
        obj.getTeamNames();

        int index = obj.search("India");
        System.out.println("Index: " + index);

        obj.update("India", "India Updated");
        obj.delete("West Indies");

        System.out.println("Final Data:");
        obj.getTeamNames();
    }
}


