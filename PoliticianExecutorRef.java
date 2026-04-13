class PoliticianExecutorRef {
    public static void main(String[] args) {

        Voter voter = new Voter();
        voter.name = "Ramesh";
        voter.age = 30;
        voter.voterId = "V12345";
        voter.constituency = "Bangalore South";
        voter.gender = "Male";
        voter.voteStatus = "Voted";

        Politician politician = new Politician();
        politician.voter = voter;

        politician.getVoter();
    }
}