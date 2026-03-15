class Map {
    String title;
    String region;
    String projectionType;
    double scale;
    int yearPublished;
    String publisher;
    boolean isDigital;
    String format;
    double widthCm;
    double heightCm;
    boolean topographical;
    String primaryLanguage;
    int legendItemsCount;
    boolean includesIndex;
    String colorScheme;
    double price;
    String updateFrequency;
    boolean isFoldable;
    String material;
    int zoomLevels;

    Map(String title, String region, String projectionType, double scale, int yearPublished, String publisher, boolean isDigital, String format, double widthCm, double heightCm, boolean topographical, String primaryLanguage, int legendItemsCount, boolean includesIndex, String colorScheme, double price, String updateFrequency, boolean isFoldable, String material, int zoomLevels) {
        this.title = title;
        this.region = region;
        this.projectionType = projectionType;
        this.scale = scale;
        this.yearPublished = yearPublished;
        this.publisher = publisher;
        this.isDigital = isDigital;
        this.format = format;
        this.widthCm = widthCm;
        this.heightCm = heightCm;
        this.topographical = topographical;
        this.primaryLanguage = primaryLanguage;
        this.legendItemsCount = legendItemsCount;
        this.includesIndex = includesIndex;
        this.colorScheme = colorScheme;
        this.price = price;
        this.updateFrequency = updateFrequency;
        this.isFoldable = isFoldable;
        this.material = material;
        this.zoomLevels = zoomLevels;
    }

    void display() {
        System.out.println("Title: " + title + " | Region: " + region + " | Scale: 1:" + scale);
        System.out.println("Year: " + yearPublished + " | Digital: " + isDigital + " | Price: $" + price);
        System.out.println("--------------------------------");
    }
}