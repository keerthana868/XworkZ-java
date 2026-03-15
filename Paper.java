class Paper {
    String type;
    String brand;
    int gsm;
    String size;
    String color;
    double pricePerReam;
    int sheetsPerPack;
    boolean isRecycled;
    String finish;
    double opacity;
    double brightness;
    String coating;
    boolean acidFree;
    String sourceWood;
    int thicknessMicrons;
    String tearResistance;
    boolean waterResistant;
    String intendedUse;
    String countryManufactured;
    int bulkOrderMin;

    Paper(String type, String brand, int gsm, String size, String color, double pricePerReam, int sheetsPerPack, boolean isRecycled, String finish, double opacity, double brightness, String coating, boolean acidFree, String sourceWood, int thicknessMicrons, String tearResistance, boolean waterResistant, String intendedUse, String countryManufactured, int bulkOrderMin) {
        this.type = type;
        this.brand = brand;
        this.gsm = gsm;
        this.size = size;
        this.color = color;
        this.pricePerReam = pricePerReam;
        this.sheetsPerPack = sheetsPerPack;
        this.isRecycled = isRecycled;
        this.finish = finish;
        this.opacity = opacity;
        this.brightness = brightness;
        this.coating = coating;
        this.acidFree = acidFree;
        this.sourceWood = sourceWood;
        this.thicknessMicrons = thicknessMicrons;
        this.tearResistance = tearResistance;
        this.waterResistant = waterResistant;
        this.intendedUse = intendedUse;
        this.countryManufactured = countryManufactured;
        this.bulkOrderMin = bulkOrderMin;
    }

    void display() {
        System.out.println("Type: " + type + ", Brand: " + brand + ", GSM: " + gsm);
        System.out.println("Size: " + size + ", Price: $" + pricePerReam + ", Recycled: " + isRecycled);
        System.out.println("--------------------------------");
    }
}