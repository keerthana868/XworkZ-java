class Planet {
    int id;
    String name;
    double distanceSun;
    int moons;
    String galaxy;
    double mass;
    String atmosphere;
    int rotationDays;
    double gravity;
    int ringCount;
    String discoveredBy;
    boolean inhabitable;

    Planet(int id) {
        this.id = id;
        System.out.println("Planet Id: " + id);
    }

    Planet(String name) {
        this.name = name;
        System.out.println("Planet Name: " + name);
    }

    Planet(double distanceSun) {
        this.distanceSun = distanceSun;
        System.out.println("Distance: " + distanceSun);
    }

    Planet(int moons, String galaxy) {
        this.moons = moons;
        this.galaxy = galaxy;
        System.out.println("Moons: " + moons);
        System.out.println("Galaxy: " + galaxy);
    }

    Planet(double mass, String atmosphere, int rotationDays) {
        this.mass = mass;
        this.atmosphere = atmosphere;
        this.rotationDays = rotationDays;
        System.out.println("Mass: " + mass);
        System.out.println("Atmosphere: " + atmosphere);
        System.out.println("Rotation: " + rotationDays);
    }

    Planet(double gravity, int ringCount) {
        this.gravity = gravity;
        this.ringCount = ringCount;
        System.out.println("Gravity: " + gravity);
        System.out.println("Rings: " + ringCount);
    }

    Planet(String discoveredBy, boolean inhabitable) {
        this.discoveredBy = discoveredBy;
        this.inhabitable = inhabitable;
        System.out.println("Found by: " + discoveredBy);
        System.out.println("Life: " + inhabitable);
    }
}