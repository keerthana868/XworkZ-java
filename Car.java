class Car {
    int id;
    String brand;
    double price;
    int horsePower;
    String model;
    double engineSize;
    String transmission;
    int year;
    double topSpeed;
    int doors;
    String fuelType;
    boolean isElectric;

    Car(int id) {
        this.id = id;
        System.out.println("Car Id: " + id);
    }

    Car(String brand) {
        this.brand = brand;
        System.out.println("Brand: " + brand);
    }

    Car(double price) {
        this.price = price;
        System.out.println("Price: " + price);
    }

    Car(int horsePower, String model) {
        this.horsePower = horsePower;
        this.model = model;
        System.out.println("HP: " + horsePower);
        System.out.println("Model: " + model);
    }

    Car(double engineSize, String transmission, int year) {
        this.engineSize = engineSize;
        this.transmission = transmission;
        this.year = year;
        System.out.println("Engine: " + engineSize);
        System.out.println("Gearbox: " + transmission);
        System.out.println("Year: " + year);
    }

    Car(double topSpeed, int doors) {
        this.topSpeed = topSpeed;
        this.doors = doors;
        System.out.println("Speed: " + topSpeed);
        System.out.println("Doors: " + doors);
    }

    Car(String fuelType, boolean isElectric) {
        this.fuelType = fuelType;
        this.isElectric = isElectric;
        System.out.println("Fuel: " + fuelType);
        System.out.println("Electric: " + isElectric);
    }
}