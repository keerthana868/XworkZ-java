class Telescope {
    int id;
    String name;
    double magnification;
    int lensDiameter;
    String type;
    double weight;
    String agency;
    int launchYear;
    double orbitHeight;
    int discovers;
    String focalLength;
    boolean isSpaceBased;

    Telescope(int id) {
        this.id = id;
        System.out.println("Tele Id: " + id);
    }

    Telescope(String name) {
        this.name = name;
        System.out.println("Name: " + name);
    }

    Telescope(double magnification) {
        this.magnification = magnification;
        System.out.println("Mag: " + magnification);
    }

    Telescope(int lensDiameter, String type) {
        this.lensDiameter = lensDiameter;
        this.type = type;
        System.out.println("Lens: " + lensDiameter);
        System.out.println("Type: " + type);
    }

    Telescope(double weight, String agency, int launchYear) {
        this.weight = weight;
        this.agency = agency;
        this.launchYear = launchYear;
        System.out.println("W: " + weight);
        System.out.println("Agency: " + agency);
        System.out.println("Year: " + launchYear);
    }

    Telescope(double orbitHeight, int discovers) {
        this.orbitHeight = orbitHeight;
        this.discovers = discovers;
        System.out.println("Orbit: " + orbitHeight);
        System.out.println("Finds: " + discovers);
    }

    Telescope(String focalLength, boolean isSpaceBased) {
        this.focalLength = focalLength;
        this.isSpaceBased = isSpaceBased;
        System.out.println("Focal: " + focalLength);
        System.out.println("Space: " + isSpaceBased);
    }
}