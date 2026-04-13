class Prison {
    int prisonId;
    Criminal criminal;

    Prison() {}

    Prison(int prisonId, Criminal criminal) {
        System.out.println("Constructor is started");
        this.prisonId = prisonId;
        this.criminal = criminal;
        System.out.println("Constructor is ended");
    }

    public boolean addCriminal(Criminal criminal) {
        boolean isCriminalSaved = false;
        System.out.println("Add Criminal Method started:");
        this.criminal = criminal;
        isCriminalSaved = true;
        System.out.println("Add Criminal Method ended:");
        return isCriminalSaved;
    }

    public void getCriminal() {
        System.out.println("Criminal info:");
        System.out.println("Name: " + criminal.name);
        System.out.println("Crime: " + criminal.crime);
        System.out.println("Age: " + criminal.age);
        System.out.println("Sentence Years: " + criminal.sentenceYears);
        System.out.println("Prison Block: " + criminal.prisonBlock);
        System.out.println("Status: " + criminal.status);
    }
}