class Toxic {
    String substanceName;
    String chemicalFormula;
    double toxicityLevel; // LD50 mg/kg
    String stateOfMatter;
    String color;
    boolean isOdorous;
    String exposureRoute;
    String antidote;
    int shelfLifeMonths;
    double molecularWeight;
    boolean regulatedByLaw;
    String hazardClass;
    String commonUsage;
    double boilingPoint;
    double meltingPoint;
    String symptomOfExposure;
    boolean bioaccumulative;
    String decontaminationMethod;
    String manufacturer;
    int safetyProtocolLevel;

    Toxic(String substanceName, String chemicalFormula, double toxicityLevel, String stateOfMatter, String color, boolean isOdorous, String exposureRoute, String antidote, int shelfLifeMonths, double molecularWeight, boolean regulatedByLaw, String hazardClass, String commonUsage, double boilingPoint, double meltingPoint, String symptomOfExposure, boolean bioaccumulative, String decontaminationMethod, String manufacturer, int safetyProtocolLevel) {
        this.substanceName = substanceName;
        this.chemicalFormula = chemicalFormula;
        this.toxicityLevel = toxicityLevel;
        this.stateOfMatter = stateOfMatter;
        this.color = color;
        this.isOdorous = isOdorous;
        this.exposureRoute = exposureRoute;
        this.antidote = antidote;
        this.shelfLifeMonths = shelfLifeMonths;
        this.molecularWeight = molecularWeight;
        this.regulatedByLaw = regulatedByLaw;
        this.hazardClass = hazardClass;
        this.commonUsage = commonUsage;
        this.boilingPoint = boilingPoint;
        this.meltingPoint = meltingPoint;
        this.symptomOfExposure = symptomOfExposure;
        this.bioaccumulative = bioaccumulative;
        this.decontaminationMethod = decontaminationMethod;
        this.manufacturer = manufacturer;
        this.safetyProtocolLevel = safetyProtocolLevel;
    }

    void display() {
        System.out.println("Substance: " + substanceName + " [" + chemicalFormula + "]");
        System.out.println("Hazard Class: " + hazardClass + " | Toxicity (LD50): " + toxicityLevel);
        System.out.println("Symptoms: " + symptomOfExposure + " | Antidote: " + antidote);
        System.out.println("--------------------------------");
    }
}