class GovernmentExecutor{
    public static void main(String[] args){
        Government obj = new Government();

        boolean v1 = obj.addExamName("UPSC");
        boolean v2 = obj.addExamName("SSC CGL");
        boolean v3 = obj.addExamName("SSC CHSL");
        boolean v4 = obj.addExamName("IBPS PO");
        boolean v5 = obj.addExamName("IBPS Clerk");
        boolean v6 = obj.addExamName("RRB NTPC");
        boolean v7 = obj.addExamName("GATE");
        boolean v8 = obj.addExamName("NEET");
        boolean v9 = obj.addExamName("JEE");
        obj.getCompetitiveExamNames();
    }
}
