class Office {
    String name;
    String location;
    int floorCount;
    int employeeCount;
    boolean isOpenPlan;
    double rentMonthly;
    String companyName;
    boolean hasCafeteria;
    int meetingRoomCount;
    String internetProvider;
    boolean parkingAvailable;
    double areaSqFt;
    String furnitureStyle;
    boolean acWorking;
    int computerCount;
    String dressCode;
    boolean allowsRemoteWork;
    String securityType;
    int windowCount;
    boolean coffeeMachinePresent;

    Office(String name, String location, int floorCount, int employeeCount, boolean isOpenPlan, double rentMonthly, String companyName, boolean hasCafeteria, int meetingRoomCount, String internetProvider, boolean parkingAvailable, double areaSqFt, String furnitureStyle, boolean acWorking, int computerCount, String dressCode, boolean allowsRemoteWork, String securityType, int windowCount, boolean coffeeMachinePresent) {
        this.name = name;
        this.location = location;
        this.floorCount = floorCount;
        this.employeeCount = employeeCount;
        this.isOpenPlan = isOpenPlan;
        this.rentMonthly = rentMonthly;
        this.companyName = companyName;
        this.hasCafeteria = hasCafeteria;
        this.meetingRoomCount = meetingRoomCount;
        this.internetProvider = internetProvider;
        this.parkingAvailable = parkingAvailable;
        this.areaSqFt = areaSqFt;
        this.furnitureStyle = furnitureStyle;
        this.acWorking = acWorking;
        this.computerCount = computerCount;
        this.dressCode = dressCode;
        this.allowsRemoteWork = allowsRemoteWork;
        this.securityType = securityType;
        this.windowCount = windowCount;
        this.coffeeMachinePresent = coffeeMachinePresent;
    }

    void display() {
        System.out.println("Office: " + name + " (" + companyName + ") | Location: " + location);
        System.out.println("Employees: " + employeeCount + " | Monthly Rent: $" + rentMonthly + " | AC: " + acWorking);
        System.out.println("--------------------------------");
    }
}