class MortuaryExecutorRef {
    public static void main(String[] args) {

        DeadBody deadBody = new DeadBody();
        deadBody.name = "Unknown";
        deadBody.age = 45;
        deadBody.causeOfDeath = "Accident";
        deadBody.timeOfDeath = "10:30 PM";
        deadBody.idNumber = "DB101";
        deadBody.status = "Identified";

        Mortuary mortuary = new Mortuary();
        mortuary.deadBody = deadBody;

        mortuary.getDeadBody();
    }
}