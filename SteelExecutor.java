class SteelExecutor {
    public static void main(String[] args) {

        Steel s = new Steel();

        s.add("Carbon Steel");
        s.add("Alloy Steel");
        s.add("Stainless Steel");
        s.add("Tool Steel");
        s.add("Mild Steel");
        s.add("High Speed Steel");
        s.add("Spring Steel");
        s.add("Structural Steel");
        s.add("Galvanized Steel");
        s.add("Forged Steel");

        s.getAll();

        System.out.println("Search: " + s.search("Mild Steel"));

        s.update("Mild Steel", "Low Carbon Steel");

        s.delete("Tool Steel");

        System.out.println("After Update/Delete:");
        s.getAll();
    }
}