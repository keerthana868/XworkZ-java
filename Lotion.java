class Lotion {
    String brand;
    String variant;
    double price;
    double volumeMl;
    String skinType;
    boolean isScented;
    String primaryIngredient;
    String bottleMaterial;
    boolean sunscreenIncluded;
    int spfLevel;
    String manufacturer;
    int shelfLifeMonths;
    boolean isDermatologicallyTested;
    String absorptionSpeed;
    double rating;
    boolean organic;
    String countryOfOrigin;
    String targetBodyPart;
    boolean parabenFree;
    int stockUnits;

    Lotion(String brand, String variant, double price, double volumeMl, String skinType, boolean isScented, String primaryIngredient, String bottleMaterial, boolean sunscreenIncluded, int spfLevel, String manufacturer, int shelfLifeMonths, boolean isDermatologicallyTested, String absorptionSpeed, double rating, boolean organic, String countryOfOrigin, String targetBodyPart, boolean parabenFree, int stockUnits) {
        this.brand = brand;
        this.variant = variant;
        this.price = price;
        this.volumeMl = volumeMl;
        this.skinType = skinType;
        this.isScented = isScented;
        this.primaryIngredient = primaryIngredient;
        this.bottleMaterial = bottleMaterial;
        this.sunscreenIncluded = sunscreenIncluded;
        this.spfLevel = spfLevel;
        this.manufacturer = manufacturer;
        this.shelfLifeMonths = shelfLifeMonths;
        this.isDermatologicallyTested = isDermatologicallyTested;
        this.absorptionSpeed = absorptionSpeed;
        this.rating = rating;
        this.organic = organic;
        this.countryOfOrigin = countryOfOrigin;
        this.targetBodyPart = targetBodyPart;
        this.parabenFree = parabenFree;
        this.stockUnits = stockUnits;
    }

    void display() {
        System.out.println("Lotion: " + brand + " (" + variant + ") | Price: $" + price);
        System.out.println("Skin: " + skinType + " | SPF: " + (sunscreenIncluded ? spfLevel : "None") + " | Ingredient: " + primaryIngredient);
        System.out.println("--------------------------------");
    }
}