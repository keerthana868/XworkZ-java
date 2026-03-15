public class ToxicExecutor {
    public static void main(String[] args) {
        Toxic t1 = new Toxic("Arsenic", "As", 763.0, "Solid", "Grey", false, "Ingestion", "Dimercaprol", 120, 74.92, true, "Class 6.1", "Pesticides", 614.0, 817.0, "Vomiting", true, "Chelation", "ChemCorp", 4);
        Toxic t2 = new Toxic("Cyanide", "CN", 1.0, "Liquid/Gas", "Clear", true, "Inhalation", "Hydroxocobalamin", 24, 27.0, true, "Class 6.1", "Mining", 25.6, -13.4, "Suffocation", false, "Nitrite therapy", "GlobalLab", 5);
        Toxic t3 = new Toxic("Mercury", "Hg", 1.0, "Liquid", "Silver", false, "Skin contact", "DMSA", 240, 200.59, true, "Class 8", "Thermometers", 356.7, -38.8, "Tremors", true, "Ventilation", "MetalExtract", 4);
        Toxic t4 = new Toxic("Lead", "Pb", 450.0, "Solid", "Bluish-white", false, "Ingestion", "EDTA", 600, 207.2, true, "Class 6.1", "Batteries", 1749.0, 327.5, "Brain damage", true, "Lead Abatement", "BatteryInc", 3);
        Toxic t5 = new Toxic("Chlorine", "Cl2", 2.5, "Gas", "Greenish-yellow", true, "Inhalation", "Fresh air/Oxygen", 12, 70.9, true, "Class 2.3", "Water treatment", -34.0, -101.5, "Coughing", false, "Water spray", "CleanWater Co", 4);
        Toxic t6 = new Toxic("Ricin", "C21H30N6O5", 0.001, "Solid", "White", false, "Injection", "None", 6, 60000.0, true, "Select Agent", "Research", 0.0, 0.0, "Organ failure", false, "Heat treatment", "BioSafety", 5);
        Toxic t7 = new Toxic("Carbon Monoxide", "CO", 1.0, "Gas", "Colorless", false, "Inhalation", "Pure Oxygen", 0, 28.0, false, "Class 2.3", "Combustion", -191.5, -205.0, "Headache", false, "Ventilation", "Nature", 2);
        Toxic t8 = new Toxic("Sarin", "C4H10FO2P", 0.01, "Liquid", "Colorless", false, "Nerve contact", "Atropine", 36, 140.0, true, "Schedule 1", "Chemical Warfare", 158.0, -56.0, "Paralysis", false, "Bleach wash", "DefenseLab", 5);
        Toxic t9 = new Toxic("Ammonia", "NH3", 350.0, "Gas", "Colorless", true, "Inhalation", "Water flush", 24, 17.0, true, "Class 2.2", "Fertilizer", -33.3, -77.7, "Burning eyes", false, "Acid wash", "AgriChem", 3);
        Toxic t10 = new Toxic("Formaldehyde", "CH2O", 100.0, "Liquid/Gas", "Clear", true, "Skin/Inhalation", "None", 48, 30.0, true, "Class 8", "Preservation", -19.0, -92.0, "Irritation", false, "Dilution", "MedSupply", 3);

        t1.display(); t2.display(); t3.display(); t4.display(); t5.display();
        t6.display(); t7.display(); t8.display(); t9.display(); t10.display();
    }
}