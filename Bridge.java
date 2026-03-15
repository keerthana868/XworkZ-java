class Bridge {
    int id;
    String name;
    double length;
    int capacity;
    String location;
    double height;
    String material;
    int yearOpen;
    double tollCost;
    int supportPillars;
    String architect;
    boolean isSymmetric;

    Bridge(int id) {
        this.id = id;
        System.out.println("Bridge Id: " + id);
    }

    Bridge(String name) {
        this.name = name;
        System.out.println("Name: " + name);
    }

    Bridge(double length) {
        this.length = length;
        System.out.println("Len: " + length);
    }

    Bridge(int capacity, String location) {
        this.capacity = capacity;
        this.location = location;
        System.out.println("Cap: " + capacity);
        System.out.println("Loc: " + location);
    }

    Bridge(double height, String material, int yearOpen) {
        this.height = height;
        this.material = material;
        this.yearOpen = yearOpen;
        System.out.println("H: " + height);
        System.out.println("Made of: " + material);
        System.out.println("Est: " + yearOpen);
    }

    Bridge(double tollCost, int supportPillars) {
        this.tollCost = tollCost;
        this.supportPillars = supportPillars;
        System.out.println("Toll: " + tollCost);
        System.out.println("Pillars: " + supportPillars);
    }

    Bridge(String architect, boolean isSymmetric) {
        this.architect = architect;
        this.isSymmetric = isSymmetric;
        System.out.println("By: " + architect);
        System.out.println("Symm: " + isSymmetric);
    }
}