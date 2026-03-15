class Instrument {
    int id;
    String name;
    double weight;
    int stringCount;
    String brand;
    double loudness;
    String material;
    int yearModel;
    double frequency;
    int valves;
    String musician;
    boolean isElectric;

    Instrument(int id) {
        this.id = id;
        System.out.println("Inst Id: " + id);
    }

    Instrument(String name) {
        this.name = name;
        System.out.println("Inst: " + name);
    }

    Instrument(double weight) {
        this.weight = weight;
        System.out.println("W: " + weight);
    }

    Instrument(int stringCount, String brand) {
        this.stringCount = stringCount;
        this.brand = brand;
        System.out.println("Strings: " + stringCount);
        System.out.println("Brand: " + brand);
    }

    Instrument(double loudness, String material, int yearModel) {
        this.loudness = loudness;
        this.material = material;
        this.yearModel = yearModel;
        System.out.println("dB: " + loudness);
        System.out.println("Material: " + material);
        System.out.println("Year: " + yearModel);
    }

    Instrument(double frequency, int valves) {
        this.frequency = frequency;
        this.valves = valves;
        System.out.println("Hz: " + frequency);
        System.out.println("Valves: " + valves);
    }

    Instrument(String musician, boolean isElectric) {
        this.musician = musician;
        this.isElectric = isElectric;
        System.out.println("Artist: " + musician);
        System.out.println("Electric: " + isElectric);
    }
}