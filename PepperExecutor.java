public class PepperExecutor {
    public static void main(String[] args) {
        Pepper p1 = new Pepper("Bell Pepper", "Green", 0, 3.5, "Mexico", true, "None", 200, "Mature", 10, false, "Loose", 80.4, "Sweet", 50, true, "Loamy", 25.0, 75, "Salad");
        Pepper p2 = new Pepper("Jalapeno", "Green", 5000, 5.0, "Mexico", true, "Medium", 40, "Mature", 14, false, "Plastic Bag", 40.0, "Zesty", 30, true, "Sandy", 28.0, 80, "Pickling");
        Pepper p3 = new Pepper("Habanero", "Orange", 300000, 12.0, "Caribbean", false, "Very Hot", 15, "Ripe", 12, false, "Box", 100.0, "Fruity", 40, true, "Rich Loam", 30.0, 90, "Salsa");
        Pepper p4 = new Pepper("Ghost Pepper", "Red", 1000000, 50.0, "India", true, "Extreme", 10, "Dried", 365, true, "Vacuum Sealed", 20.0, "Smoky", 25, true, "Acidic", 32.0, 120, "Hot Sauce");
        Pepper p5 = new Pepper("Carolina Reaper", "Red", 2200000, 75.0, "USA", true, "Insane", 8, "Ripe", 7, false, "Individual", 10.0, "Sweet-Heat", 20, true, "Well-drained", 30.0, 100, "Challenges");
        Pepper p6 = new Pepper("Cayenne", "Red", 50000, 8.0, "French Guiana", false, "Hot", 20, "Powder", 730, true, "Jar", 5.0, "Pungent", 0, true, "Standard", 25.0, 85, "Seasoning");
        Pepper p7 = new Pepper("Serrano", "Green", 20000, 6.0, "Mexico", true, "Hot", 25, "Mature", 10, false, "Tray", 35.0, "Sharp", 35, true, "Sandy Loam", 27.0, 80, "Cooking");
        Pepper p8 = new Pepper("Thai Bird Eye", "Red", 100000, 15.0, "Thailand", false, "Very Hot", 5, "Ripe", 10, false, "Pouch", 15.0, "Peppery", 15, true, "Tropical", 30.0, 70, "Curry");
        Pepper p9 = new Pepper("Poblano", "Dark Green", 1500, 4.5, "Mexico", true, "Mild", 150, "Mature", 14, false, "Bulk", 60.0, "Earthy", 60, true, "Loamy", 24.0, 85, "Stuffing");
        Pepper p10 = new Pepper("Shishito", "Light Green", 100, 10.0, "Japan", false, "Mostly Mild", 10, "Young", 7, false, "Bag", 20.0, "Grassy", 10, true, "Silt", 22.0, 60, "Appetizer");

        p1.display(); p2.display(); p3.display(); p4.display(); p5.display();
        p6.display(); p7.display(); p8.display(); p9.display(); p10.display();
    }
}