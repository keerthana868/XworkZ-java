class TurbineExecutor {
    public static void main(String[] args) {

        Turbine t = new Turbine();

        t.add("Steam Turbine");
        t.add("Gas Turbine");
        t.add("Water Turbine");
        t.add("Wind Turbine");
        t.add("Hydraulic Turbine");
        t.add("Impulse Turbine");
        t.add("Reaction Turbine");
        t.add("Kaplan Turbine");
        t.add("Francis Turbine");
        t.add("Pelton Turbine");

        t.getAll();

        System.out.println("Search: " + t.search("Wind Turbine"));

        t.update("Wind Turbine", "Modern Wind Turbine");

        t.delete("Gas Turbine");

        System.out.println("After Update/Delete:");
        t.getAll();
    }
}