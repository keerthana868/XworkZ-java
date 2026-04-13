class Ipl {
    int iplId;
    Rcb rcb;

    Ipl() {}

    Ipl(int iplId, Rcb rcb) {
        System.out.println("Constructor is started");
        this.iplId = iplId;
        this.rcb = rcb;
        System.out.println("Constructor is ended");
    }

    public boolean addRcb(Rcb rcb) {
        boolean isRcbSaved = false;
        System.out.println("Add RCB Method started:");
        this.rcb = rcb;
        isRcbSaved = true;
        System.out.println("Add RCB Method ended:");
        return isRcbSaved;
    }

    public void getRcb() {
        System.out.println("RCB info:");
        System.out.println("Team Name: " + rcb.teamName);
        System.out.println("Captain: " + rcb.captain);
        System.out.println("Home Ground: " + rcb.homeGround);
        System.out.println("Titles Won: " + rcb.titlesWon);
        System.out.println("Top Batsman: " + rcb.topBatsman);
        System.out.println("Top Bowler: " + rcb.topBowler);
    }
}