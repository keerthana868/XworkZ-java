class PrisonExecutorConst {
    public static void main(String[] args) {

        Criminal criminal = new Criminal();
        criminal.name = "Ravi";
        criminal.crime = "Theft";
        criminal.age = 32;
        criminal.sentenceYears = 5;
        criminal.prisonBlock = "Block A";
        criminal.status = "Under Trial";

        Prison prison = new Prison(901, criminal);

        prison.getCriminal();
    }
}