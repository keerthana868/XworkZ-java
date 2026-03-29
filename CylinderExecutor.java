class CylinderExecutor {
    public static void main(String[] args) {
        Cylinder obj = new Cylinder();

        obj.add("Gas"); obj.add("Hydraulic"); obj.add("Pneumatic"); obj.add("LPG");
        obj.add("Oxygen"); obj.add("Nitrogen"); obj.add("CO2"); obj.add("Steam");
        obj.add("Fire"); obj.add("Industrial");

        obj.getAll();
        System.out.println(obj.search("Oxygen"));
        obj.update("Oxygen", "Medical Oxygen");
        obj.delete("CO2");
        obj.getAll();
    }
}