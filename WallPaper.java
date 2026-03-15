class WallPaper {
    String brand;
    String patternType;
    String color;
    double price;
    double widthCm;
    double heightCm;
    boolean washable;
    String material;
    boolean peelAndStick;
    int rollLengthMeters;
    String finishType;
    boolean waterproof;
    String roomType;
    double weightKg;
    boolean ecoFriendly;
    String countryOfOrigin;
    int designNumber;
    boolean removable;
    String texture;
    int warrantyYears;

    WallPaper(String brand, String patternType, String color, double price, double widthCm, double heightCm, boolean washable, String material, boolean peelAndStick, int rollLengthMeters, String finishType, boolean waterproof, String roomType, double weightKg, boolean ecoFriendly, String countryOfOrigin, int designNumber, boolean removable, String texture, int warrantyYears) {

        this.brand = brand;
        this.patternType = patternType;
        this.color = color;
        this.price = price;
        this.widthCm = widthCm;
        this.heightCm = heightCm;
        this.washable = washable;
        this.material = material;
        this.peelAndStick = peelAndStick;
        this.rollLengthMeters = rollLengthMeters;
        this.finishType = finishType;
        this.waterproof = waterproof;
        this.roomType = roomType;
        this.weightKg = weightKg;
        this.ecoFriendly = ecoFriendly;
        this.countryOfOrigin = countryOfOrigin;
        this.designNumber = designNumber;
        this.removable = removable;
        this.texture = texture;
        this.warrantyYears = warrantyYears;
    }

    void display() {
        System.out.println("Wallpaper Brand: " + brand + " | Pattern: " + patternType + " | Color: " + color);
        System.out.println("Material: " + material + " | Room: " + roomType + " | Finish: " + finishType);
        System.out.println("--------------------------------");
    }
}