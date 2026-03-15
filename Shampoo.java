class Shampoo {
    String brand;
    String variant;
    double price;
    double volumeMl;
    String hairType;
    boolean isSulfateFree;
    String mainIngredient;
    String fragrance;
    String color;
    boolean phBalanced;
    String manufacturer;
    int shelfLifeMonths;
    boolean antiDandruff;
    String packagingType;
    double rating;
    boolean organic;
    String countryOfOrigin;
    String targetGender;
    boolean crueltyFree;
    int stockUnits;

    Shampoo(String brand, String variant, double price, double volumeMl, String hairType, boolean isSulfateFree, String mainIngredient, String fragrance, String color, boolean phBalanced, String manufacturer, int shelfLifeMonths, boolean antiDandruff, String packagingType, double rating, boolean organic, String countryOfOrigin, String targetGender, boolean crueltyFree, int stockUnits) {
        this.brand = brand;
        this.variant = variant;
        this.price = price;
        this.volumeMl = volumeMl;
        this.hairType = hairType;
        this.isSulfateFree = isSulfateFree;
        this.mainIngredient = mainIngredient;
        this.fragrance = fragrance;
        this.color = color;
        this.phBalanced = phBalanced;
        this.manufacturer = manufacturer;
        this.shelfLifeMonths = shelfLifeMonths;
        this.antiDandruff = antiDandruff;
        this.packagingType = packagingType;
        this.rating = rating;
        this.organic = organic;
        this.countryOfOrigin = countryOfOrigin;
        this.targetGender = targetGender;
        this.crueltyFree = crueltyFree;
        this.stockUnits = stockUnits;
    }

    void display() {
        System.out.println("Brand: " + brand + " (" + variant + ") | Price: $" + price);
        System.out.println("Hair Type: " + hairType + " | Sulfate-Free: " + isSulfateFree + " | Ingredient: " + mainIngredient);
        System.out.println("--------------------------------");
    }
}