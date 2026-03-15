public class OrganExecutor {
    public static void main(String[] args) {
        Organ o1 = new Organ("Heart", "Circulatory", 300.0, true, "Pumping Blood", "Chest", false, 250, "Cardiac Muscle", true, 12.0, 100, "Heart Attack", true, 7.4, "Conical", true, 5, "N/A", false);
        Organ o2 = new Organ("Liver", "Digestive", 1500.0, true, "Detoxification", "Abdomen", true, 1500, "Parenchymal", true, 15.0, 50, "Hepatitis", true, 7.2, "Wedge", false, 10, "Glycogen", false);
        Organ o3 = new Organ("Lungs", "Respiratory", 900.0, true, "Gas Exchange", "Chest", false, 5000, "Epithelial", true, 25.0, 80, "Asthma", true, 7.4, "Conical", true, 40, "Air", true);
        Organ o4 = new Organ("Kidney", "Excretory", 150.0, true, "Filtration", "Lower Back", false, 1200, "Renal", true, 11.0, 40, "Stone", true, 6.0, "Bean", false, 20, "Urine", true);
        Organ o5 = new Organ("Brain", "Nervous", 1400.0, true, "Control Center", "Head", false, 750, "Nervous", true, 15.0, 1000000, "Alzheimer's", true, 7.3, "Oval", false, 100, "Data", false);
        Organ o6 = new Organ("Skin", "Integumentary", 4000.0, true, "Protection", "External", true, 400, "Epithelial", false, 200.0, 2000, "Eczema", true, 5.5, "Flat", false, 15, "Lipids", false);
        Organ o7 = new Organ("Stomach", "Digestive", 150.0, false, "Digestion", "Abdomen", false, 150, "Smooth Muscle", false, 25.0, 60, "Gastritis", true, 2.0, "J-shape", true, 8, "Food/Acid", false);
        Organ o8 = new Organ("Pancreas", "Endocrine", 80.0, true, "Insulin Production", "Abdomen", false, 100, "Glandular", true, 15.0, 30, "Diabetes", true, 8.0, "Leaf", false, 5, "Enzymes", false);
        Organ o9 = new Organ("Spleen", "Lymphatic", 170.0, false, "Blood Filtering", "Left Abdomen", false, 150, "Lymphatic", true, 12.0, 25, "Splenomegaly", true, 7.4, "Oval", false, 6, "Blood", false);
        Organ o10 = new Organ("Bladder", "Excretory", 50.0, false, "Urine Storage", "Pelvis", false, 50, "Smooth Muscle", false, 10.0, 20, "Cystitis", true, 6.5, "Balloon", true, 4, "Urine", false);

        o1.display(); o2.display(); o3.display(); o4.display(); o5.display();
        o6.display(); o7.display(); o8.display(); o9.display(); o10.display();
    }
}