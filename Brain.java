class Brain {
    String species;
    double weightGrams;
    int neuronCountBillions;
    double oxygenConsumptionPercent;
    boolean isConscious;
    String primaryFunction;
    int lobeCount;
    double glialCellRatio;
    String memoryCapacity;
    boolean sleepRequired;
    double processingSpeedHz;
    String dominantHemisphere;
    double cerebrospinalFluidVolume;
    boolean neuroplasticityEnabled;
    String sensoryPriority;
    int cranialNerveCount;
    double glucoseUsageDaily;
    String structureType; // Complex, Simple
    boolean emotionsEnabled;
    String currentActivity;

    Brain(String species, double weightGrams, int neuronCountBillions, double oxygenConsumptionPercent, boolean isConscious, String primaryFunction, int lobeCount, double glialCellRatio, String memoryCapacity, boolean sleepRequired, double processingSpeedHz, String dominantHemisphere, double cerebrospinalFluidVolume, boolean neuroplasticityEnabled, String sensoryPriority, int cranialNerveCount, double glucoseUsageDaily, String structureType, boolean emotionsEnabled, String currentActivity) {
        this.species = species;
        this.weightGrams = weightGrams;
        this.neuronCountBillions = neuronCountBillions;
        this.oxygenConsumptionPercent = oxygenConsumptionPercent;
        this.isConscious = isConscious;
        this.primaryFunction = primaryFunction;
        this.lobeCount = lobeCount;
        this.glialCellRatio = glialCellRatio;
        this.memoryCapacity = memoryCapacity;
        this.sleepRequired = sleepRequired;
        this.processingSpeedHz = processingSpeedHz;
        this.dominantHemisphere = dominantHemisphere;
        this.cerebrospinalFluidVolume = cerebrospinalFluidVolume;
        this.neuroplasticityEnabled = neuroplasticityEnabled;
        this.sensoryPriority = sensoryPriority;
        this.cranialNerveCount = cranialNerveCount;
        this.glucoseUsageDaily = glucoseUsageDaily;
        this.structureType = structureType;
        this.emotionsEnabled = emotionsEnabled;
        this.currentActivity = currentActivity;
    }

    void display() {
        System.out.println("Species: " + species + " | Neurons: " + neuronCountBillions + "B | Weight: " + weightGrams + "g");
        System.out.println("Dominant Side: " + dominantHemisphere + " | Function: " + primaryFunction + " | Activity: " + currentActivity);
        System.out.println("--------------------------------");
    }
}