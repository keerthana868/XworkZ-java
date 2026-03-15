class Watch {
    int id;
    String brand;
    double price;
    int batteryLifeDays;
    String model;
    double weight;
    String material;
    int waterResistance;
    double screenSize;
    int sensors;
    String strapColor;
    boolean isSmart;

    Watch(int id) {
        this.id = id;
        System.out.println("Watch Id: " + id);
    }

    Watch(String brand) {
        this.brand = brand;
        System.out.println("Brand: " + brand);
    }

    Watch(double price) {
        this.price = price;
        System.out.println("Price: " + price);
    }

    Watch(int batteryLifeDays, String model) {
        this.batteryLifeDays = batteryLifeDays;
        this.model = model;
        System.out.println("Days: " + batteryLifeDays);
        System.out.println("Model: " + model);
    }

    Watch(double weight, String material, int waterResistance) {
        this.weight = weight;
        this.material = material;
        this.waterResistance = waterResistance;
        System.out.println("W: " + weight);
        System.out.println("Material: " + material);
        System.out.println("WaterRes: " + waterResistance);
    }

    Watch(double screenSize, int sensors) {
        this.screenSize = screenSize;
        this.sensors = sensors;
        System.out.println("Size: " + screenSize);
        System.out.println("Sensors: " + sensors);
    }

    Watch(String strapColor, boolean isSmart) {
        this.strapColor = strapColor;
        this.isSmart = isSmart;
        System.out.println("Color: " + strapColor);
        System.out.println("Smart: " + isSmart);
    }
}