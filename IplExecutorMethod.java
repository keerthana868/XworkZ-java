class IplExecutorMethod {
    public static void main(String[] args) {

        Rcb rcb = new Rcb();
        rcb.teamName = "Royal Challengers Bangalore";
        rcb.captain = "Faf du Plessis";
        rcb.homeGround = "Chinnaswamy Stadium";
        rcb.titlesWon = 0;
        rcb.topBatsman = "Virat Kohli";
        rcb.topBowler = "Mohammed Siraj";

        Ipl ipl = new Ipl();
        ipl.addRcb(rcb);

        ipl.getRcb();
    }
}