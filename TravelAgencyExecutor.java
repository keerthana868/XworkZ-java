class TravelAgencyExecutor {
    public static void main(String[] args) {
        TravelAgency obj = new TravelAgency();

        obj.addPlace("Paris");
        obj.addPlace("London");
        obj.addPlace("New York");
        obj.addPlace("Dubai");
        obj.addPlace("Singapore");
        obj.addPlace("Bali");
        obj.addPlace("Maldives");
        obj.addPlace("Goa");
        obj.addPlace("Manali");
        obj.addPlace("Ooty");
        obj.addPlace("Mysore");
        obj.addPlace("Kerala");
        obj.addPlace("Jaipur");
        obj.addPlace("Agra");
        obj.addPlace("Varanasi");
        obj.addPlace("Ladakh");
        obj.addPlace("Andaman");

        System.out.println("All Items:");
        obj.getPlaces();

        int index = obj.search("Paris");
        System.out.println("Index: " + index);

        obj.update("Paris", "Paris Updated");
        obj.delete("Andaman");

        System.out.println("Final Data:");
        obj.getPlaces();
    }
}
