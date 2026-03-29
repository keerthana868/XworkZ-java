class GovernmentExecutor {
    public static void main(String[] args) {
        Government obj = new Government();

        obj.addExamName("UPSC");
        obj.addExamName("SSC CGL");
        obj.addExamName("SSC CHSL");
        obj.addExamName("IBPS PO");
        obj.addExamName("IBPS Clerk");
        obj.addExamName("RRB NTPC");
        obj.addExamName("GATE");
        obj.addExamName("NEET");
        obj.addExamName("JEE");

        System.out.println("All Items:");
        obj.getCompetitiveExamNames();

        int index = obj.search("UPSC");
        System.out.println("Index: " + index);

        obj.update("UPSC", "UPSC Updated");
        obj.delete("JEE");

        System.out.println("Final Data:");
        obj.getCompetitiveExamNames();
    }
}

