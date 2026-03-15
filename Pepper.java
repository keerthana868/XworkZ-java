class Pepper {
    String variety;
    String color;
    int scovilleRating;
    double pricePerKg;
    String originCountry;
    boolean isOrganic;
    String spiceLevel;
    double weightInGrams;
    String growthStage;
    int shelfLifeDays;
    boolean isDried;
    String packagingType;
    double vitaminCContent;
    String flavorProfile;
    int seedCount;
    boolean gmoFree;
    String soilTypeNeeded;
    double optimalTemp;
    int harvestTimeDays;
    String usage;

    Pepper(String variety, String color, int scovilleRating, double pricePerKg, String originCountry, boolean isOrganic, String spiceLevel, double weightInGrams, String growthStage, int shelfLifeDays, boolean isDried, String packagingType, double vitaminCContent, String flavorProfile, int seedCount, boolean gmoFree, String soilTypeNeeded, double optimalTemp, int harvestTimeDays, String usage) {
        this.variety = variety;
        this.color = color;
        this.scovilleRating = scovilleRating;
        this.pricePerKg = pricePerKg;
        this.originCountry = originCountry;
        this.isOrganic = isOrganic;
        this.spiceLevel = spiceLevel;
        this.weightInGrams = weightInGrams;
        this.growthStage = growthStage;
        this.shelfLifeDays = shelfLifeDays;
        this.isDried = isDried;
        this.packagingType = packagingType;
        this.vitaminCContent = vitaminCContent;
        this.flavorProfile = flavorProfile;
        this.seedCount = seedCount;
        this.gmoFree = gmoFree;
        this.soilTypeNeeded = soilTypeNeeded;
        this.optimalTemp = optimalTemp;
        this.harvestTimeDays = harvestTimeDays;
        this.usage = usage;
    }

    void display() {
        System.out.println("Variety: " + variety + ", Scoville: " + scovilleRating + ", Origin: " + originCountry);
        System.out.println("Price: $" + pricePerKg + ", Organic: " + isOrganic + ", Spice Level: " + spiceLevel);
        System.out.println("--------------------------------");
    }
}