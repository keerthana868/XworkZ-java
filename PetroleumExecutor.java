class PetroleumExecutor {
    public static void main(String[] args) {
        Petroleum obj = new Petroleum();

        obj.add("Crude"); obj.add("Petrol"); obj.add("Diesel"); obj.add("Kerosene");
        obj.add("LPG"); obj.add("Bitumen"); obj.add("Wax"); obj.add("Oil");
        obj.add("Fuel"); obj.add("Asphalt");

        obj.getAll();
        obj.update("Diesel", "Premium Diesel");
        obj.delete("Wax");
        obj.getAll();
    }
}