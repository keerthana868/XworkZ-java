class Animal {
    int id;
    String species;
    double weight;
    int lifespan;
    String habitat;
    double speed;
    String diet;
    int population;
    double length;
    int heartRate;
    String family;
    boolean isExtinct;

    Animal(int id) {
        this.id = id;
        System.out.println("Animal Id: " + id);
    }

    Animal(String species) {
        this.species = species;
        System.out.println("Species: " + species);
    }

    Animal(double weight) {
        this.weight = weight;
        System.out.println("Weight: " + weight);
    }

    Animal(int lifespan, String habitat) {
        this.lifespan = lifespan;
        this.habitat = habitat;
        System.out.println("Life: " + lifespan);
        System.out.println("Home: " + habitat);
    }

    Animal(double speed, String diet, int population) {
        this.speed = speed;
        this.diet = diet;
        this.population = population;
        System.out.println("Speed: " + speed);
        System.out.println("Eat: " + diet);
        System.out.println("Total: " + population);
    }

    Animal(double length, int heartRate) {
        this.length = length;
        this.heartRate = heartRate;
        System.out.println("Length: " + length);
        System.out.println("BPM: " + heartRate);
    }

    Animal(String family, boolean isExtinct) {
        this.family = family;
        this.isExtinct = isExtinct;
        System.out.println("Family: " + family);
        System.out.println("Extinct: " + isExtinct);
    }
}