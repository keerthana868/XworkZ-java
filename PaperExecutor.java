public class PaperExecutor {
    public static void main(String[] args) {
        Paper pa1 = new Paper("Copy Paper", "HP", 80, "A4", "White", 5.99, 500, false, "Matte", 90.0, 96.0, "None", true, "Pine", 100, "Low", false, "Printing", "USA", 10);
        Paper pa2 = new Paper("Cardstock", "Canson", 250, "A3", "Black", 15.50, 50, false, "Smooth", 100.0, 0.0, "None", true, "Mixed", 300, "High", false, "Crafts", "France", 5);
        Paper pa3 = new Paper("Glossy Photo", "Canon", 200, "4x6", "White", 12.00, 100, false, "High Gloss", 98.0, 105.0, "Resin", true, "Synthetic", 200, "Medium", true, "Photos", "Japan", 2);
        Paper pa4 = new Paper("Newsprint", "Standard", 45, "Broadsheet", "Greyish", 2.00, 1000, true, "Rough", 80.0, 60.0, "None", false, "Recycled Pulp", 70, "Very Low", false, "Newspaper", "Canada", 50);
        Paper pa5 = new Paper("Tracing Paper", "Gateway", 90, "A2", "Translucent", 20.00, 50, false, "Satin", 20.0, 0.0, "None", true, "Sulfite", 60, "Medium", false, "Architecture", "UK", 1);
        Paper pa6 = new Paper("Parchment", "Reynolds", 60, "Roll", "Tan", 4.50, 1, false, "Waxy", 70.0, 70.0, "Silicone", true, "Wood Pulp", 80, "High", true, "Baking", "USA", 1);
        Paper pa7 = new Paper("Bond Paper", "Hammermill", 90, "Letter", "White", 8.00, 500, false, "Smooth", 92.0, 98.0, "None", true, "Hardwood", 110, "Medium", false, "Legal Docs", "USA", 5);
        Paper pa8 = new Paper("Construction Paper", "Crayola", 120, "9x12", "Assorted", 3.50, 100, true, "Rough", 95.0, 80.0, "None", false, "Mechanical Pulp", 180, "Medium", false, "School Projects", "USA", 20);
        Paper pa9 = new Paper("Vellum", "Strathmore", 100, "A4", "Cream", 18.00, 50, false, "Velvet", 40.0, 85.0, "None", true, "Cotton", 120, "High", false, "Invitations", "USA", 1);
        Paper pa10 = new Paper("Tissue Paper", "Hallmark", 18, "20x20", "Pink", 1.50, 20, true, "Soft", 10.0, 90.0, "None", true, "Softwood", 20, "Very Low", false, "Gift Wrapping", "China", 100);

        pa1.display(); pa2.display(); pa3.display(); pa4.display(); pa5.display();
        pa6.display(); pa7.display(); pa8.display(); pa9.display(); pa10.display();
    }
}