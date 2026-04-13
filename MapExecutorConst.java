class MapExecutorConst {
    public static void main(String[] args) {

        Location location = new Location();
        location.name = "Tech Park";
        location.latitude = 12.9716;
        location.longitude = 77.5946;
        location.city = "Bangalore";
        location.country = "India";
        location.pincode = 560001;

        Map map = new Map(101, location);

        map.getLocation();
    }
}