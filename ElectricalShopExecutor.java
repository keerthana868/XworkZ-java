class ElectricalShopExecutor {
    public static void main(String[] args) {
        ElectricalShop obj = new ElectricalShop();

        obj.addAppliance("Fan");
        obj.addAppliance("Light");
        obj.addAppliance("Heater");
        obj.addAppliance("Iron Box");
        obj.addAppliance("Mixer");
        obj.addAppliance("Grinder");
        obj.addAppliance("Toaster");
        obj.addAppliance("Kettle");
        obj.addAppliance("Water Purifier");
        obj.addAppliance("Air Cooler");
        obj.addAppliance("Air Conditioner");
        obj.addAppliance("Refrigerator");
        obj.addAppliance("Washing Machine");
        obj.addAppliance("Microwave");
        obj.addAppliance("Vacuum Cleaner");
        obj.addAppliance("Inverter");
        obj.addAppliance("Battery");
        obj.addAppliance("Switch Board");
        obj.addAppliance("LED Bulb");
        obj.addAppliance("Extension Cord");

        System.out.println("All Items:");
        obj.getAppliances();

        int index = obj.search("Fan");
        System.out.println("Index: " + index);

        obj.update("Fan", "Fan Updated");
        obj.delete("Extension Cord");

        System.out.println("Final Data:");
        obj.getAppliances();
    }
}
