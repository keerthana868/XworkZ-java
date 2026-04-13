class Crop {
    int cropId;
    Season season;

    Crop() {}

    Crop(int cropId, Season season) {
        System.out.println("Constructor is started");
        this.cropId = cropId;
        this.season = season;
        System.out.println("Constructor is ended");
    }

    public boolean addSeason(Season season) {
        boolean isSeasonSaved = false;
        System.out.println("Add Season Method started:");
        this.season = season;
        isSeasonSaved = true;
        System.out.println("Add Season Method ended:");
        return isSeasonSaved;
    }

    public void getSeason() {
        System.out.println("Season info:");
        System.out.println("Season Name: " + season.name);
        System.out.println("Duration: " + season.duration);
        System.out.println("Temperature Range: " + season.temperatureRange);
        System.out.println("Rainfall: " + season.rainfall);
        System.out.println("Suitable Crop: " + season.suitableCrop);
        System.out.println("Region: " + season.region);
    }
}