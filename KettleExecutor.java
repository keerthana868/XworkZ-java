class KettleExecutor {
    public static void main(String[] args) {

        Kettle k = new Kettle();

        k.add("Electric Kettle");
        k.add("Steel Kettle");
        k.add("Glass Kettle");
        k.add("Plastic Kettle");
        k.add("Travel Kettle");
        k.add("Mini Kettle");
        k.add("Smart Kettle");
        k.add("Cordless Kettle");
        k.add("Classic Kettle");
        k.add("Whistling Kettle");

        k.getAll();

        System.out.println("Search: " + k.search("Glass Kettle"));

        k.update("Glass Kettle", "Transparent Glass Kettle");

        k.delete("Mini Kettle");

        System.out.println("After Update/Delete:");
        k.getAll();
    }
}