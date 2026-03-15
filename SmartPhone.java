class SmartPhone {
    int id;
    String brand;
    double price;
    int storage;
    String model;
    double battery;
    String os;
    int ram;
    double screen;
    int year;
    String color;
    boolean is5G;

    SmartPhone(int id) {
        this.id = id;
        System.out.println("SmartPhone Id: " + id);
    }

    SmartPhone(String brand) {
        this.brand = brand;
        System.out.println("Brand: " + brand);
    }

    SmartPhone(double price) {
        this.price = price;
        System.out.println("Price: " + price);
    }

    SmartPhone(int storage, String model) {
        this.storage = storage;
        this.model = model;
        System.out.println("Storage: " + storage);
        System.out.println("Model: " + model);
    }

    SmartPhone(double battery, String os, int ram) {
        this.battery = battery;
        this.os = os;
        this.ram = ram;
        System.out.println("Battery: " + battery);
        System.out.println("OS: " + os);
        System.out.println("RAM: " + ram);
    }

    SmartPhone(double screen, int year) {
        this.screen = screen;
        this.year = year;
        System.out.println("Screen: " + screen);
        System.out.println("Year: " + year);
    }

    SmartPhone(String color, boolean is5G) {
        this.color = color;
        this.is5G = is5G;
        System.out.println("Color: " + color);
        System.out.println("Is 5G: " + is5G);
    }
}