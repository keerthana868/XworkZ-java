class GymExecutor {
    public static void main(String[] args) {
        Gym obj = new Gym();

        obj.addEquipment("Treadmill");
        obj.addEquipment("Dumbbells");
        obj.addEquipment("Barbell");
        obj.addEquipment("Bench Press");
        obj.addEquipment("Leg Press");
        obj.addEquipment("Pull Up Bar");
        obj.addEquipment("Elliptical");
        obj.addEquipment("Rowing Machine");
        obj.addEquipment("Kettlebell");
        obj.addEquipment("Resistance Bands");
        obj.addEquipment("Cable Machine");
        obj.addEquipment("Smith Machine");
        obj.addEquipment("Exercise Bike");
        obj.addEquipment("Medicine Ball");
        obj.addEquipment("Stepper");
        obj.addEquipment("Foam Roller");

        System.out.println("All Items:");
        obj.getEquipments();

        int index = obj.search("Treadmill");
        System.out.println("Index: " + index);

        obj.update("Treadmill", "Treadmill Updated");
        obj.delete("Foam Roller");

        System.out.println("Final Data:");
        obj.getEquipments();
    }
}
