class Laptop {
    int id;
    String brand;
    double price;
    int ram;
    String processor;
    double weight;
    String os;
    int storage;
    double screenSize;
    int batteryLife;
    String color;
    boolean touchScreen;

    Laptop(int id) {
        this.id = id;
        System.out.println("Laptop Id: " + id);
    }

    Laptop(String brand) {
        this.brand = brand;
        System.out.println("Brand: " + brand);
    }

    Laptop(double price) {
        this.price = price;
        System.out.println("Price: " + price);
    }

    Laptop(int ram, String processor) {
        this.ram = ram;
        this.processor = processor;
        System.out.println("RAM: " + ram);
        System.out.println("CPU: " + processor);
    }

    Laptop(double weight, String os, int storage) {
        this.weight = weight;
        this.os = os;
        this.storage = storage;
        System.out.println("Weight: " + weight);
        System.out.println("OS: " + os);
        System.out.println("SSD: " + storage);
    }

    Laptop(double screenSize, int batteryLife) {
        this.screenSize = screenSize;
        this.batteryLife = batteryLife;
        System.out.println("Display: " + screenSize);
        System.out.println("Battery: " + batteryLife);
    }

    Laptop(String color, boolean touchScreen) {
        this.color = color;
        this.touchScreen = touchScreen;
        System.out.println("Color: " + color);
        System.out.println("Touch: " + touchScreen);
    }
}	