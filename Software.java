class Software {
    int id;
    String name;
    double version;
    int sizeMb;
    String developer;
    double cost;
    String language;
    int licenseYear;
    double rating;
    int downloads;
    String type;
    boolean isOpenSource;

    Software(int id) {
        this.id = id;
        System.out.println("App Id: " + id);
    }

    Software(String name) {
        this.name = name;
        System.out.println("App: " + name);
    }

    Software(double version) {
        this.version = version;
        System.out.println("Ver: " + version);
    }

    Software(int sizeMb, String developer) {
        this.sizeMb = sizeMb;
        this.developer = developer;
        System.out.println("Size: " + sizeMb);
        System.out.println("Dev: " + developer);
    }

    Software(double cost, String language, int licenseYear) {
        this.cost = cost;
        this.language = language;
        this.licenseYear = licenseYear;
        System.out.println("Price: " + cost);
        System.out.println("Lang: " + language);
        System.out.println("Year: " + licenseYear);
    }

    Software(double rating, int downloads) {
        this.rating = rating;
        this.downloads = downloads;
        System.out.println("Stars: " + rating);
        System.out.println("Users: " + downloads);
    }

    Software(String type, boolean isOpenSource) {
        this.type = type;
        this.isOpenSource = isOpenSource;
        System.out.println("Type: " + type);
        System.out.println("OS: " + isOpenSource);
    }
}