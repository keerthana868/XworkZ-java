class Mountain {
    int id;
    String name;
    double height;
    int climbTime;
    String range;
    double temperature;
    String country;
    int baseCampCount;
    double longitude;
    int firstClimbed;
    String difficulty;
    boolean hasSnow;

    Mountain(int id) {
        this.id = id;
        System.out.println("Mtn Id: " + id);
    }

    Mountain(String name) {
        this.name = name;
        System.out.println("Mtn: " + name);
    }

    Mountain(double height) {
        this.height = height;
        System.out.println("Elev: " + height);
    }

    Mountain(int climbTime, String range) {
        this.climbTime = climbTime;
        this.range = range;
        System.out.println("Time: " + climbTime);
        System.out.println("Range: " + range);
    }

    Mountain(double temperature, String country, int baseCampCount) {
        this.temperature = temperature;
        this.country = country;
        this.baseCampCount = baseCampCount;
        System.out.println("Temp: " + temperature);
        System.out.println("In: " + country);
        System.out.println("Camps: " + baseCampCount);
    }

    Mountain(double longitude, int firstClimbed) {
        this.longitude = longitude;
        this.firstClimbed = firstClimbed;
        System.out.println("Long: " + longitude);
        System.out.println("Year: " + firstClimbed);
    }

    Mountain(String difficulty, boolean hasSnow) {
        this.difficulty = difficulty;
        this.hasSnow = hasSnow;
        System.out.println("Diff: " + difficulty);
        System.out.println("Snow: " + hasSnow);
    }
}