class TrafficSignalExecutorConst {
    public static void main(String[] args) {

        Cop cop = new Cop();
        cop.name = "Arjun";
        cop.badgeNumber = 1234;
        cop.rank = "Inspector";
        cop.shift = "Morning";
        cop.experience = 8;
        cop.locationAssigned = "Main Junction";

        TrafficSignal signal = new TrafficSignal(401, cop);

        signal.getCop();
    }
}