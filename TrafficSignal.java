class TrafficSignal {
    int signalId;
    Cop cop;

    TrafficSignal() {}

    TrafficSignal(int signalId, Cop cop) {
        System.out.println("Constructor is started");
        this.signalId = signalId;
        this.cop = cop;
        System.out.println("Constructor is ended");
    }

    public boolean addCop(Cop cop) {
        boolean isCopSaved = false;
        System.out.println("Add Cop Method started:");
        this.cop = cop;
        isCopSaved = true;
        System.out.println("Add Cop Method ended:");
        return isCopSaved;
    }

    public void getCop() {
        System.out.println("Cop info:");
        System.out.println("Name: " + cop.name);
        System.out.println("Badge Number: " + cop.badgeNumber);
        System.out.println("Rank: " + cop.rank);
        System.out.println("Shift: " + cop.shift);
        System.out.println("Experience: " + cop.experience + " years");
        System.out.println("Location Assigned: " + cop.locationAssigned);
    }
}