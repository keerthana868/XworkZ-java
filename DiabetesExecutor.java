public class DiabetesExecutor {
    public static void main(String[] args) {
        Diabetes db1 = new Diabetes("Type 2", 140.0, "John Doe", 45, false, "Metformin", 7.2, "Thirst", true, "Low Carb", 150.0, "Dexcom G6", 4, "Dr. Smith", true, "City Health", 28.5, "2020-05-10", false, "BlueCross");
        Diabetes db2 = new Diabetes("Type 1", 110.0, "Jane Roe", 22, true, "Humalog", 6.5, "Fatigue", true, "Keto", 50.0, "FreeStyle Libre", 8, "Dr. Adams", false, "Mayo Clinic", 22.1, "2015-11-22", false, "Aetna");
        Diabetes db3 = new Diabetes("Gestational", 130.0, "Sarah Bell", 29, false, "None", 5.8, "Nausea", false, "Balanced", 180.0, "Accu-Chek", 3, "Dr. White", true, "Grace Hospital", 26.0, "2023-01-15", false, "Cigna");
        Diabetes db4 = new Diabetes("Type 2", 200.0, "Mike Ross", 60, true, "Insulin + Metformin", 8.9, "Blurred Vision", false, "No Sugar", 100.0, "OneTouch", 5, "Dr. Green", true, "General Hosp", 32.4, "2018-09-01", true, "Medicare");
        Diabetes db5 = new Diabetes("Type 2", 155.0, "Emma Watson", 52, false, "Jardiance", 7.5, "Frequent Urination", true, "Mediterranean", 140.0, "Dexcom", 2, "Dr. Brown", true, "Unity Med", 29.8, "2021-03-14", false, "UnitedHealth");
        Diabetes db6 = new Diabetes("Type 1", 95.0, "Alice Cooper", 19, true, "Novolog", 6.1, "None", true, "Carb Counting", 200.0, "Omnipod", 10, "Dr. Carter", false, "St. Jude", 21.5, "2022-06-30", false, "Humana");
        Diabetes db7 = new Diabetes("Type 2", 180.0, "Bob Marley", 65, false, "Glipizide", 8.2, "Slow Healing", false, "Low Sodium", 120.0, "Bayer", 3, "Dr. Lee", true, "Hope Center", 30.2, "2010-12-12", true, "Kaiser");
        Diabetes db8 = new Diabetes("Pre-diabetes", 105.0, "Charlie Day", 38, false, "Diet only", 5.6, "None", true, "Plant-based", 250.0, "None", 1, "Dr. Hill", true, "Wellness Clinic", 27.3, "2024-02-01", false, "BCBS");
        Diabetes db9 = new Diabetes("Type 1", 125.0, "David Bowie", 40, true, "Lantus", 7.0, "Weight Loss", true, "Strict", 100.0, "Medtronic Pump", 12, "Dr. Sky", false, "Space Med", 23.9, "1995-07-20", true, "StarCare");
        Diabetes db10 = new Diabetes("Type 2", 160.0, "Frank Castle", 50, false, "Victoza", 7.8, "Dizziness", false, "High Protein", 130.0, "Guardian", 4, "Dr. Russo", false, "Vet Affairs", 31.0, "2019-10-05", false, "VA Health");

        db1.display(); db2.display(); db3.display(); db4.display(); db5.display();
        db6.display(); db7.display(); db8.display(); db9.display(); db10.display();
    }
}