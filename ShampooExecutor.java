public class ShampooExecutor {
    public static void main(String[] args) {
        Shampoo s1 = new Shampoo("Head & Shoulders", "Cool Menthol", 5.99, 400.0, "All", false, "Zinc Pyrithione", "Menthol", "Blue", true, "P&G", 36, true, "Bottle", 4.5, false, "USA", "Unisex", false, 500);
        Shampoo s2 = new Shampoo("Pantene", "Pro-V Repair", 6.50, 375.0, "Damaged", false, "Pro-Vitamin", "Floral", "White", true, "P&G", 24, false, "Bottle", 4.2, false, "USA", "Female", false, 300);
        Shampoo s3 = new Shampoo("Dove", "Daily Shine", 4.99, 250.0, "Dry", true, "Serum", "Fresh", "White", true, "Unilever", 36, false, "Bottle", 4.4, false, "UK", "Female", true, 450);
        Shampoo s4 = new Shampoo("L'Oreal", "Total Repair", 7.25, 400.0, "Frizzy", false, "Ceramide", "Fruit", "Yellow", true, "L'Oreal", 24, false, "Pump", 4.6, false, "France", "Female", true, 150);
        Shampoo s5 = new Shampoo("Tresemme", "Keratin Smooth", 8.00, 500.0, "Frizzy", true, "Keratin", "Sweet", "Red", true, "Unilever", 24, false, "Bottle", 4.3, false, "USA", "Unisex", true, 250);
        Shampoo s6 = new Shampoo("Mamaearth", "Onion Hair Fall", 9.99, 250.0, "Thinning", true, "Onion Oil", "Herbal", "Cream", true, "Honasa", 18, false, "Pump", 4.1, true, "India", "Unisex", true, 100);
        Shampoo s7 = new Shampoo("Johnson's", "Baby Shampoo", 3.50, 200.0, "Baby", true, "Mild Cleansers", "Classic", "Yellow", true, "J&J", 36, false, "Bottle", 4.8, false, "USA", "Baby", true, 600);
        Shampoo s8 = new Shampoo("Matrix", "Biolage", 18.00, 400.0, "Colored", true, "Aloe Vera", "Nature", "Clear", true, "Matrix", 24, false, "Bottle", 4.7, true, "USA", "Female", true, 80);
        Shampoo s9 = new Shampoo("The Body Shop", "Ginger", 15.00, 250.0, "Flaky Scalp", true, "Ginger Extract", "Spicy", "Brown", true, "Natura", 12, true, "Bottle", 4.5, true, "UK", "Unisex", true, 120);
        Shampoo s10 = new Shampoo("Ogx", "Coconut Milk", 11.50, 385.0, "Dry", true, "Coconut Milk", "Tropical", "White", true, "Vogue", 24, false, "Bottle", 4.2, false, "USA", "Unisex", true, 200);

        s1.display(); s2.display(); s3.display(); s4.display(); s5.display();
        s6.display(); s7.display(); s8.display(); s9.display(); s10.display();
    }
}