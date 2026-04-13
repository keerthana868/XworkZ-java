class TrafficSignalExecutorRef {
    public static void main(String[] args) {

        Cop cop = new Cop();
        cop.name = "Arjun";
        cop.badgeNumber = 1234;
        cop.rank = "Inspector";
        cop.shift = "Morning";
        cop.experience = 8;
        cop.locationAssigned = "Main Junction";

        TrafficSignal signal = new TrafficSignal();
        signal.cop = cop;

        signal.getCop();
    }
}