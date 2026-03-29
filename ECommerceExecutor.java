class ECommerceExecutor {
    public static void main(String[] args) {
        ECommerce obj = new ECommerce();

        obj.addProductName("iPhone");
        obj.addProductName("Laptop");
        obj.addProductName("Headphones");
        obj.addProductName("Smartwatch");
        obj.addProductName("Camera");
        obj.addProductName("Shoes");
        obj.addProductName("Backpack");
        obj.addProductName("T-Shirt");
        obj.addProductName("Jeans");
        obj.addProductName("Washing Machine");
        obj.addProductName("Refrigerator");
        obj.addProductName("Television");
        obj.addProductName("Mixer Grinder");
        obj.addProductName("Air Conditioner");
        obj.addProductName("Microwave");
        obj.addProductName("Keyboard");
        obj.addProductName("Mouse");
        obj.addProductName("Tablet");
        obj.addProductName("Power Bank");
        obj.addProductName("Bluetooth Speaker");
        obj.addProductName("Gaming Console");
        obj.addProductName("Printer");
        obj.addProductName("Router");
        obj.addProductName("Drone");
        obj.addProductName("Projector");
        obj.addProductName("Smart Bulb");

        System.out.println("All Items:");
        obj.getProductNames();

        int index = obj.search("iPhone");
        System.out.println("Index: " + index);

        obj.update("iPhone", "iPhone Updated");
        obj.delete("Smart Bulb");

        System.out.println("Final Data:");
        obj.getProductNames();
    }
}
