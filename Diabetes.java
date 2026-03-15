class Diabetes {
    String type; // Type 1, Type 2, Gestational
    double glucoseLevel;
    String patientName;
    int patientAge;
    boolean insulinDependent;
    String medicationName;
    double hbA1c;
    String symptoms;
    boolean exerciseRoutine;
    String dietPlan;
    double dailyCarbLimit;
    String monitoringDevice;
    int checkFrequencyPerDay;
    String doctorName;
    boolean familyHistory;
    String hospitalAffiliation;
    double bodyMassIndex;
    String diagnosisDate;
    boolean complicationPresent;
    String insuranceProvider;

    Diabetes(String type, double glucoseLevel, String patientName, int patientAge, boolean insulinDependent, String medicationName, double hbA1c, String symptoms, boolean exerciseRoutine, String dietPlan, double dailyCarbLimit, String monitoringDevice, int checkFrequencyPerDay, String doctorName, boolean familyHistory, String hospitalAffiliation, double bodyMassIndex, String diagnosisDate, boolean complicationPresent, String insuranceProvider) {
        this.type = type;
        this.glucoseLevel = glucoseLevel;
        this.patientName = patientName;
        this.patientAge = patientAge;
        this.insulinDependent = insulinDependent;
        this.medicationName = medicationName;
        this.hbA1c = hbA1c;
        this.symptoms = symptoms;
        this.exerciseRoutine = exerciseRoutine;
        this.dietPlan = dietPlan;
        this.dailyCarbLimit = dailyCarbLimit;
        this.monitoringDevice = monitoringDevice;
        this.checkFrequencyPerDay = checkFrequencyPerDay;
        this.doctorName = doctorName;
        this.familyHistory = familyHistory;
        this.hospitalAffiliation = hospitalAffiliation;
        this.bodyMassIndex = bodyMassIndex;
        this.diagnosisDate = diagnosisDate;
        this.complicationPresent = complicationPresent;
        this.insuranceProvider = insuranceProvider;
    }

    void display() {
        System.out.println("Patient: " + patientName + " | Type: " + type + " | Glucose: " + glucoseLevel);
        System.out.println("A1c: " + hbA1c + "% | Medication: " + medicationName + " | Doctor: " + doctorName);
        System.out.println("--------------------------------");
    }
}