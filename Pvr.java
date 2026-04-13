class Pvr {
    int pvrId;
    Screen screen;

    Pvr() {}

    Pvr(int pvrId, Screen screen) {
        System.out.println("Constructor is started");
        this.pvrId = pvrId;
        this.screen = screen;
        System.out.println("Constructor is ended");
    }

    public boolean addScreen(Screen screen) {
        boolean isScreenSaved = false;
        System.out.println("Add Screen Method started:");
        this.screen = screen;
        isScreenSaved = true;
        System.out.println("Add Screen Method ended:");
        return isScreenSaved;
    }

    public void getScreen() {
        System.out.println("Screen info:");
        System.out.println("Screen Number: " + screen.screenNumber);
        System.out.println("Screen Type: " + screen.screenType);
        System.out.println("Seating Capacity: " + screen.seatingCapacity);
        System.out.println("Resolution: " + screen.resolution);
        System.out.println("Sound System: " + screen.soundSystem);
        System.out.println("Ticket Price: " + screen.ticketPrice);
    }
}