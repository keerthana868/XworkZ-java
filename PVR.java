class PVR {
    String location;
    String city;
    int screenCount;
    boolean hasIMAX;
    boolean has4DX;
    double ticketPrice;
    int seatingCapacity;
    String currentMovie;
    boolean snacksAvailable;
    double revenueDaily;
    String theatreType; // Gold, Lux, Normal
    int staffCount;
    boolean parkingAvailable;
    double soundSystemDb;
    String projectionTech;
    boolean isReclinerAvailable;
    int showTimingsPerDay;
    String popcornFlavors;
    boolean acWorking;
    String domainName;

    PVR(String location, String city, int screenCount, boolean hasIMAX, boolean has4DX, double ticketPrice, int seatingCapacity, String currentMovie, boolean snacksAvailable, double revenueDaily, String theatreType, int staffCount, boolean parkingAvailable, double soundSystemDb, String projectionTech, boolean isReclinerAvailable, int showTimingsPerDay, String popcornFlavors, boolean acWorking, String domainName) {
        this.location = location;
        this.city = city;
        this.screenCount = screenCount;
        this.hasIMAX = hasIMAX;
        this.has4DX = has4DX;
        this.ticketPrice = ticketPrice;
        this.seatingCapacity = seatingCapacity;
        this.currentMovie = currentMovie;
        this.snacksAvailable = snacksAvailable;
        this.revenueDaily = revenueDaily;
        this.theatreType = theatreType;
        this.staffCount = staffCount;
        this.parkingAvailable = parkingAvailable;
        this.soundSystemDb = soundSystemDb;
        this.projectionTech = projectionTech;
        this.isReclinerAvailable = isReclinerAvailable;
        this.showTimingsPerDay = showTimingsPerDay;
        this.popcornFlavors = popcornFlavors;
        this.acWorking = acWorking;
        this.domainName = domainName;
    }

    void display() {
        System.out.println("PVR " + location + ", " + city + " [" + theatreType + "]");
        System.out.println("Now Playing: " + currentMovie + " | Ticket: " + ticketPrice);
        System.out.println("IMAX: " + hasIMAX + " | 4DX: " + has4DX + " | Screens: " + screenCount);
        System.out.println("--------------------------------");
    }
}