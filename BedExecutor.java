class BedExecutor {
    public static void main(String[] args) {

        Bed b = new Bed();

        b.add("Single Bed");
        b.add("Double Bed");
        b.add("Queen Bed");
        b.add("King Bed");
        b.add("Bunk Bed");
        b.add("Sofa Bed");
        b.add("Air Bed");
        b.add("Folding Bed");
        b.add("Storage Bed");
        b.add("Adjustable Bed");

        b.getAll();

        System.out.println("Search: " + b.search("Air Bed"));

        b.update("Air Bed", "Inflatable Air Bed");

        b.delete("Bunk Bed");

        System.out.println("After Update/Delete:");
        b.getAll();
    }
}