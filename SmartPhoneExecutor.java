class SmartPhoneExecutor {

    public static void main(String[] args){

        String brand = SmartPhone.getBrand();
        double price = SmartPhone.getPrice();
        String processor = SmartPhone.getProcessor();
        int ram = SmartPhone.getRam();
        int storage = SmartPhone.getStorage();
        int battery = SmartPhone.getBattery();
        double screen = SmartPhone.getScreenSize();
        int camera = SmartPhone.getCamera();
        boolean fiveg = SmartPhone.get5G();
        String color = SmartPhone.getColor();

        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Processor: " + processor);
        System.out.println("RAM: " + ram);
        System.out.println("Storage: " + storage);
        System.out.println("Battery: " + battery);
        System.out.println("Screen: " + screen);
        System.out.println("Camera: " + camera);
        System.out.println("5G Support: " + fiveg);
        System.out.println("Color: " + color);
    }
}