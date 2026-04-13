class Politician {
    int politicianId;
    Voter voter;

    Politician() {}

    Politician(int politicianId, Voter voter) {
        System.out.println("Constructor is started");
        this.politicianId = politicianId;
        this.voter = voter;
        System.out.println("Constructor is ended");
    }

    public boolean addVoter(Voter voter) {
        boolean isVoterSaved = false;
        System.out.println("Add Voter Method started:");
        this.voter = voter;
        isVoterSaved = true;
        System.out.println("Add Voter Method ended:");
        return isVoterSaved;
    }

    public void getVoter() {
        System.out.println("Voter info:");
        System.out.println("Name: " + voter.name);
        System.out.println("Age: " + voter.age);
        System.out.println("Voter ID: " + voter.voterId);
        System.out.println("Constituency: " + voter.constituency);
        System.out.println("Gender: " + voter.gender);
        System.out.println("Vote Status: " + voter.voteStatus);
    }
}