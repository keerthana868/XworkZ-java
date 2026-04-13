class Map {
    int mapId;
    Location location;

    Map() {}

    Map(int mapId, Location location) {
        System.out.println("Constructor is started");
        this.mapId = mapId;
        this.location = location;
        System.out.println("Constructor is ended");
    }

    public boolean addLocation(Location location) {
        boolean isLocationSaved = false;
        System.out.println("Add Location Method started:");
        this.location = location;
        isLocationSaved = true;
        System.out.println("Add Location Method ended:");
        return isLocationSaved;
    }

    public void getLocation() {
        System.out.println("Location info:");
        System.out.println("Name: " + location.name);
        System.out.println("Latitude: " + location.latitude);
        System.out.println("Longitude: " + location.longitude);
        System.out.println("City: " + location.city);
        System.out.println("Country: " + location.country);
        System.out.println("Pincode: " + location.pincode);
    }
}