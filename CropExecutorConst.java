class CropExecutorConst {
    public static void main(String[] args) {

        Season season = new Season();
        season.name = "Kharif";
        season.duration = "June to October";
        season.temperatureRange = "25-35°C";
        season.rainfall = 800.0;
        season.suitableCrop = "Rice";
        season.region = "India";

        Crop crop = new Crop(1001, season);

        crop.getSeason();
    }
}