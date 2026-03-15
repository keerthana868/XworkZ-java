public class GarlicExecutor {
    public static void main(String[] args) {
        Garlic g1 = new Garlic("Softneck", "California", 8.5, 50, "White", true, 500, "Mild", 120, false, "Dry", 4.5, 12, false, "Summer", 60.0, "A", true, 10, "Allium sativum");
        Garlic g2 = new Garlic("Hardneck", "Spain", 10.0, 40, "Purple", false, 450, "Strong", 90, false, "Cool", 5.2, 8, false, "Spring", 55.0, "Premium", true, 5, "Allium sativum");
        Garlic g3 = new Garlic("Elephant", "USA", 15.0, 10, "White", true, 1000, "Very Mild", 60, false, "Ambient", 2.1, 5, false, "Summer", 65.0, "B", false, 2, "Allium ampeloprasum");
        Garlic g4 = new Garlic("Black Garlic", "Japan", 45.0, 20, "Black", true, 300, "Sweet", 180, true, "Refrigerated", 8.0, 10, false, "N/A", 40.0, "A+", true, 1, "Fermented");
        Garlic g5 = new Garlic("Creole", "Mexico", 12.0, 60, "Deep Purple", false, 550, "Piquant", 150, false, "Dry", 6.0, 15, false, "Spring", 50.0, "A", true, 20, "Allium sativum");
        Garlic g6 = new Garlic("Siberian", "Russia", 11.5, 35, "Pinkish", true, 480, "Hot", 100, false, "Cold", 7.1, 7, false, "Winter", 45.0, "Premium", true, 5, "Allium sativum");
        Garlic g7 = new Garlic("Chesnok Red", "Georgia", 13.0, 45, "Red Striped", true, 500, "Sweet Roasted", 110, false, "Dry", 5.5, 9, false, "Fall", 58.0, "A", true, 8, "Allium sativum");
        Garlic g8 = new Garlic("Silverwhite", "Italy", 9.0, 70, "Silver", false, 600, "Classic", 200, false, "Hanging", 4.0, 18, false, "Summer", 62.0, "B", true, 50, "Allium sativum");
        Garlic g9 = new Garlic("Early Purple", "China", 6.5, 100, "Light Purple", false, 1000, "Sulfuric", 45, true, "Industrial", 3.8, 11, true, "Spring", 70.0, "C", false, 100, "Allium sativum");
        Garlic g10 = new Garlic("Persian Star", "Iran", 14.5, 30, "Maroon", true, 400, "Crisp", 130, false, "Dry", 6.2, 10, false, "Summer", 52.0, "A", true, 5, "Allium sativum");

        g1.display(); g2.display(); g3.display(); g4.display(); g5.display();
        g6.display(); g7.display(); g8.display(); g9.display(); g10.display();
    }
}