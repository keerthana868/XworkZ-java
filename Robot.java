class Robot {
    int id;
    String name;
    double price;
    int batteryCapacity;
    String version;
    double weight;
    String os;
    int sensors;
    double speed;
    int joints;
    String language;
    boolean isAiPowered;

    Robot(int id) {
        this.id = id;
        System.out.println("Bot Id: " + id);
    }

    Robot(String name) {
        this.name = name;
        System.out.println("Bot: " + name);
    }

    Robot(double price) {
        this.price = price;
        System.out.println("Price: " + price);
    }

    Robot(int batteryCapacity, String version) {
        this.batteryCapacity = batteryCapacity;
        this.version = version;
        System.out.println("Batt: " + batteryCapacity);
        System.out.println("Ver: " + version);
    }

    Robot(double weight, String os, int sensors) {
        this.weight = weight;
        this.os = os;
        this.sensors = sensors;
        System.out.println("W: " + weight);
        System.out.println("OS: " + os);
        System.out.println("Sensors: " + sensors);
    }

    Robot(double speed, int joints) {
        this.speed = speed;
        this.joints = joints;
        System.out.println("Speed: " + speed);
        System.out.println("Joints: " + joints);
    }

    Robot(String language, boolean isAiPowered) {
        this.language = language;
        this.isAiPowered = isAiPowered;
        System.out.println("Lang: " + language);
        System.out.println("AI: " + isAiPowered);
    }
}