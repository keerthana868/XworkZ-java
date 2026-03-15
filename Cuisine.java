class Cuisine {
    int id;
    String name;
    double price;
    int prepTime;
    String region;
    double calories;
    String mainIngredient;
    int spiceLevel;
    double fatContent;
    int servingSize;
    String tasteType;
    boolean isVeg;

    Cuisine(int id) {
        this.id = id;
        System.out.println("Food Id: " + id);
    }

    Cuisine(String name) {
        this.name = name;
        System.out.println("Food: " + name);
    }

    Cuisine(double price) {
        this.price = price;
        System.out.println("Price: " + price);
    }

    Cuisine(int prepTime, String region) {
        this.prepTime = prepTime;
        this.region = region;
        System.out.println("Time: " + prepTime);
        System.out.println("Region: " + region);
    }

    Cuisine(double calories, String mainIngredient, int spiceLevel) {
        this.calories = calories;
        this.mainIngredient = mainIngredient;
        this.spiceLevel = spiceLevel;
        System.out.println("Cals: " + calories);
        System.out.println("Base: " + mainIngredient);
        System.out.println("Spice: " + spiceLevel);
    }

    Cuisine(double fatContent, int servingSize) {
        this.fatContent = fatContent;
        this.servingSize = servingSize;
        System.out.println("Fat: " + fatContent);
        System.out.println("Serves: " + servingSize);
    }

    Cuisine(String tasteType, boolean isVeg) {
        this.tasteType = tasteType;
        this.isVeg = isVeg;
        System.out.println("Taste: " + tasteType);
        System.out.println("Veg: " + isVeg);
    }
}