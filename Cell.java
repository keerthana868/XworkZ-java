class Cell {
    String type;
    String organism;
    boolean hasNucleus;
    double sizeMicrometers;
    int organelleCount;
    String primaryFunction;
    boolean canDivide;
    double lifeSpanDays;
    String dnaType;
    boolean hasCellWall;
    String energySource;
    double waterContentPercent;
    boolean isMicroscopic;
    int chromosomeCount;
    String reproductionMethod;
    double phInternal;
    boolean isMobile;
    String shape;
    int ribosomeCount;
    boolean respondsToStimuli;

    Cell(String type, String organism, boolean hasNucleus, double sizeMicrometers, int organelleCount, String primaryFunction, boolean canDivide, double lifeSpanDays, String dnaType, boolean hasCellWall, String energySource, double waterContentPercent, boolean isMicroscopic, int chromosomeCount, String reproductionMethod, double phInternal, boolean isMobile, String shape, int ribosomeCount, boolean respondsToStimuli) {
        this.type = type;
        this.organism = organism;
        this.hasNucleus = hasNucleus;
        this.sizeMicrometers = sizeMicrometers;
        this.organelleCount = organelleCount;
        this.primaryFunction = primaryFunction;
        this.canDivide = canDivide;
        this.lifeSpanDays = lifeSpanDays;
        this.dnaType = dnaType;
        this.hasCellWall = hasCellWall;
        this.energySource = energySource;
        this.waterContentPercent = waterContentPercent;
        this.isMicroscopic = isMicroscopic;
        this.chromosomeCount = chromosomeCount;
        this.reproductionMethod = reproductionMethod;
        this.phInternal = phInternal;
        this.isMobile = isMobile;
        this.shape = shape;
        this.ribosomeCount = ribosomeCount;
        this.respondsToStimuli = respondsToStimuli;
    }

    void display() {
        System.out.println("Cell: " + type + " (" + organism + ") | Nucleus: " + hasNucleus);
        System.out.println("Function: " + primaryFunction + " | Energy: " + energySource + " | Shape: " + shape);
        System.out.println("--------------------------------");
    }
}