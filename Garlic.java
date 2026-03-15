class Garlic {
    String variety;
    String origin;
    double pricePerKg;
    int bulbCount;
    String skinColor;
    boolean isOrganic;
    double weightInGrams;
    String tasteProfile;
    int shelfLifeDays;
    boolean isPeeled;
    String storageType;
    double alicinContent;
    int clovesPerBulb;
    boolean isSprouting;
    String harvestSeason;
    double moistureLevel;
    String grade;
    boolean exportQuality;
    int wholesaleMinOrder;
    String botanicalName;

    Garlic(String variety, String origin, double pricePerKg, int bulbCount, String skinColor, boolean isOrganic, double weightInGrams, String tasteProfile, int shelfLifeDays, boolean isPeeled, String storageType, double alicinContent, int clovesPerBulb, boolean isSprouting, String harvestSeason, double moistureLevel, String grade, boolean exportQuality, int wholesaleMinOrder, String botanicalName) {
        this.variety = variety;
        this.origin = origin;
        this.pricePerKg = pricePerKg;
        this.bulbCount = bulbCount;
        this.skinColor = skinColor;
        this.isOrganic = isOrganic;
        this.weightInGrams = weightInGrams;
        this.tasteProfile = tasteProfile;
        this.shelfLifeDays = shelfLifeDays;
        this.isPeeled = isPeeled;
        this.storageType = storageType;
        this.alicinContent = alicinContent;
        this.clovesPerBulb = clovesPerBulb;
        this.isSprouting = isSprouting;
        this.harvestSeason = harvestSeason;
        this.moistureLevel = moistureLevel;
        this.grade = grade;
        this.exportQuality = exportQuality;
        this.wholesaleMinOrder = wholesaleMinOrder;
        this.botanicalName = botanicalName;
    }

    void display() {
        System.out.println("Variety: " + variety + " | Origin: " + origin + " | Price: " + pricePerKg);
        System.out.println("Is Organic: " + isOrganic + " | Shelf Life: " + shelfLifeDays + " days");
        System.out.println("--------------------------------");
    }
}