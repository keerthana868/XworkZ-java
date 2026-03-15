public class LotionExecutor {
    public static void main(String[] args) {
        Lotion l1 = new Lotion("Vaseline", "Cocoa Glow", 5.5, 400.0, "Dry", true, "Cocoa Butter", "Plastic", false, 0, "Unilever", 36, true, "Moderate", 4.5, false, "USA", "Body", true, 400);
        Lotion l2 = new Lotion("Nivea", "Aloe Hydration", 4.0, 200.0, "Normal", true, "Aloe Vera", "Plastic", false, 0, "Beiersdorf", 24, true, "Fast", 4.3, false, "Germany", "Body", true, 600);
        Lotion l3 = new Lotion("Cetaphil", "Moisturizing", 15.0, 500.0, "Sensitive", false, "Glycerin", "Plastic", false, 0, "Galderma", 24, true, "Slow", 4.8, false, "Canada", "Face/Body", true, 200);
        Lotion l4 = new Lotion("Aveeno", "Daily Moisture", 12.0, 350.0, "Dry", false, "Oatmeal", "Plastic", false, 0, "J&J", 30, true, "Fast", 4.7, true, "USA", "Body", true, 150);
        Lotion l5 = new Lotion("Neutrogena", "Hydro Boost", 18.0, 50.0, "Extra Dry", true, "Hyaluronic Acid", "Glass", false, 0, "J&J", 18, true, "Instant", 4.9, false, "France", "Face", true, 100);
        Lotion l6 = new Lotion("Eucerin", "Advanced Repair", 11.5, 500.0, "Flaky", false, "Ceramide-3", "Plastic", false, 0, "Beiersdorf", 36, true, "Slow", 4.6, false, "Mexico", "Body", true, 300);
        Lotion l7 = new Lotion("Banana Boat", "Sunscreen", 9.0, 150.0, "All", true, "Avobenzone", "Tube", true, 50, "Edgewell", 24, true, "Moderate", 4.2, false, "USA", "Body", false, 500);
        Lotion l8 = new Lotion("The Body Shop", "Shea Butter", 20.0, 200.0, "Very Dry", true, "Shea", "Tub", false, 0, "Natura", 12, true, "Slow", 4.4, true, "UK", "Body", true, 90);
        l1.display(); l2.display(); l3.display(); l4.display(); l5.display(); l6.display(); l7.display(); l8.display();
    }
}