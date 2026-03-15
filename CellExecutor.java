public class CellExecutor {
    public static void main(String[] args) {
        Cell c1 = new Cell("Neuron", "Human", true, 100.0, 15, "Signal Transmission", false, 30000.0, "Double Helix", false, "Glucose", 70.0, true, 46, "None", 7.2, false, "Stellar", 10000, true);
        Cell c2 = new Cell("E. coli", "Bacteria", false, 2.0, 2, "Decomposition", true, 1.0, "Circular", true, "Nutrients", 80.0, true, 1, "Binary Fission", 7.0, true, "Rod", 500, true);
        Cell c3 = new Cell("Muscle Cell", "Animal", true, 50.0, 25, "Contraction", true, 4500.0, "Double Helix", false, "ATP", 75.0, true, 46, "Mitosis", 7.1, false, "Spindle", 8000, true);
        Cell c4 = new Cell("Xylem", "Plant", true, 20.0, 5, "Water Transport", false, 365.0, "Double Helix", true, "None", 10.0, true, 24, "None", 6.5, false, "Tubular", 0, false);
        Cell c5 = new Cell("Red Blood Cell", "Human", false, 8.0, 0, "Oxygen Transport", false, 120.0, "None", false, "Glucose", 65.0, true, 0, "None", 7.4, true, "Biconcave", 0, false);
        Cell c6 = new Cell("Sperm Cell", "Human", true, 50.0, 8, "Fertilization", false, 5.0, "Haploid", false, "Fructose", 60.0, true, 23, "None", 7.2, true, "Flagellated", 200, true);
        Cell c7 = new Cell("Yeast", "Fungi", true, 10.0, 12, "Fermentation", true, 7.0, "Double Helix", true, "Sugar", 75.0, true, 16, "Budding", 6.0, false, "Oval", 3000, true);
        Cell c8 = new Cell("Amoeba", "Protist", true, 500.0, 20, "Predation", true, 30.0, "Linear", false, "Organisms", 90.0, true, 50, "Fission", 7.0, true, "Irregular", 5000, true);
        Cell c9 = new Cell("Skin Cell", "Human", true, 30.0, 10, "Protection", true, 21.0, "Double Helix", false, "Glucose", 70.0, true, 46, "Mitosis", 7.2, false, "Flat", 2000, true);
        Cell c10 = new Cell("Root Hair", "Plant", true, 1500.0, 15, "Absorption", true, 15.0, "Double Helix", true, "Photosynthate", 85.0, true, 20, "Mitosis", 6.8, false, "Long", 4000, true);

        c1.display(); c2.display(); c3.display(); c4.display(); c5.display();
        c6.display(); c7.display(); c8.display(); c9.display(); c10.display();
    }
}