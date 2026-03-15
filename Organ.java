class Organ {
    String name;
    String system;
    double weightGrams;
    boolean isVital;
    String primaryFunction;
    String location;
    boolean canRegenerate;
    int bloodSupplyRate; // ml/min
    String tissueType;
    boolean canBeTransplanted;
    double averageLengthCm;
    int nerveSupplyCount;
    String commonDiseases;
    boolean oxygenRequired;
    double phLevel;
    String shape;
    boolean isHollow;
    int cellTypesCount;
    String storageCapacity;
    boolean pairedOrgan;

    Organ(String name, String system, double weightGrams, boolean isVital, String primaryFunction, String location, boolean canRegenerate, int bloodSupplyRate, String tissueType, boolean canBeTransplanted, double averageLengthCm, int nerveSupplyCount, String commonDiseases, boolean oxygenRequired, double phLevel, String shape, boolean isHollow, int cellTypesCount, String storageCapacity, boolean pairedOrgan) {
        this.name = name;
        this.system = system;
        this.weightGrams = weightGrams;
        this.isVital = isVital;
        this.primaryFunction = primaryFunction;
        this.location = location;
        this.canRegenerate = canRegenerate;
        this.bloodSupplyRate = bloodSupplyRate;
        this.tissueType = tissueType;
        this.canBeTransplanted = canBeTransplanted;
        this.averageLengthCm = averageLengthCm;
        this.nerveSupplyCount = nerveSupplyCount;
        this.commonDiseases = commonDiseases;
        this.oxygenRequired = oxygenRequired;
        this.phLevel = phLevel;
        this.shape = shape;
        this.isHollow = isHollow;
        this.cellTypesCount = cellTypesCount;
        this.storageCapacity = storageCapacity;
        this.pairedOrgan = pairedOrgan;
    }

    void display() {
        System.out.println("Organ: " + name + " | System: " + system + " | Vital: " + isVital);
        System.out.println("Function: " + primaryFunction + " | Can Regenerate: " + canRegenerate + " | Shape: " + shape);
        System.out.println("--------------------------------");
    }
}