class PvrExecutorMethod {
    public static void main(String[] args) {

        Screen screen = new Screen();
        screen.screenNumber = 1;
        screen.screenType = "IMAX";
        screen.seatingCapacity = 250;
        screen.resolution = "4K";
        screen.soundSystem = "Dolby Atmos";
        screen.ticketPrice = 350.0;

        Pvr pvr = new Pvr();
        pvr.addScreen(screen);

        pvr.getScreen();
    }
}