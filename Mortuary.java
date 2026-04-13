class Mortuary {
    int mortuaryId;
    DeadBody deadBody;

    Mortuary() {}

    Mortuary(int mortuaryId, DeadBody deadBody) {
        System.out.println("Constructor is started");
        this.mortuaryId = mortuaryId;
        this.deadBody = deadBody;
        System.out.println("Constructor is ended");
    }

    public boolean addDeadBody(DeadBody deadBody) {
        boolean isDeadBodySaved = false;
        System.out.println("Add DeadBody Method started:");
        this.deadBody = deadBody;
        isDeadBodySaved = true;
        System.out.println("Add DeadBody Method ended:");
        return isDeadBodySaved;
    }

    public void getDeadBody() {
        System.out.println("DeadBody info:");
        System.out.println("Name: " + deadBody.name);
        System.out.println("Age: " + deadBody.age);
        System.out.println("Cause of Death: " + deadBody.causeOfDeath);
        System.out.println("Time of Death: " + deadBody.timeOfDeath);
        System.out.println("Identification Number: " + deadBody.idNumber);
        System.out.println("Status: " + deadBody.status);
    }
}