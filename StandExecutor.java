public class StandExecutor {
    public static void main(String[] args) {
        Stand s1 = new Stand("Steel", "Music", 120.5, 5.0, "Black", 25.0, "Yamaha", true, true, 3, "Matte", 40.0, false, "None", 12, 1.5, "Rubber", false, "Japan", 500);
        Stand s2 = new Stand("Aluminum", "Laptop", 20.0, 10.0, "Silver", 45.0, "Logitech", true, true, 1, "Anodized", 15.0, false, "Screw-in", 24, 0.8, "Silicone", false, "China", 1200);
        Stand s3 = new Stand("Wood", "Plant", 60.0, 20.0, "Oak", 35.0, "HomeDecor", false, false, 4, "Varnish", 30.0, false, "Pre-assembled", 6, 3.0, "None", true, "Vietnam", 300);
        Stand s4 = new Stand("Plastic", "Display", 15.0, 1.0, "Clear", 10.0, "Generic", true, false, 1, "Glossy", 10.0, false, "None", 0, 0.2, "None", true, "China", 5000);
        Stand s5 = new Stand("Iron", "Speaker", 180.0, 50.0, "Black", 80.0, "Bose", false, true, 3, "Powder Coated", 50.0, false, "Bolt", 36, 12.0, "Steel", false, "USA", 150);
        Stand s6 = new Stand("Carbon Fiber", "Tripod", 160.0, 8.0, "Grey", 250.0, "Manfrotto", true, true, 3, "Raw", 12.0, false, "None", 60, 1.2, "Foam", true, "Italy", 80);
        Stand s7 = new Stand("Bamboo", "Monitor", 10.0, 15.0, "Natural", 30.0, "EcoDesk", false, false, 4, "Oil", 40.0, false, "None", 12, 2.5, "Cork", false, "Thailand", 250);
        Stand s8 = new Stand("Steel", "Microphone", 150.0, 2.0, "Chrome", 55.0, "Shure", true, true, 1, "Polished", 25.0, false, "Twist-lock", 24, 4.0, "Rubber", false, "Mexico", 400);
        Stand s9 = new Stand("Plastic", "Phone", 5.0, 0.5, "Blue", 5.0, "Ugreen", true, true, 1, "Matte", 8.0, false, "None", 3, 0.1, "Silicone", true, "China", 10000);
        Stand s10 = new Stand("Steel", "TV", 200.0, 100.0, "Black", 150.0, "Mount-It", false, true, 4, "Powder Coated", 80.0, true, "Major", 120, 25.0, "Steel", false, "USA", 60);

        s1.display(); s2.display(); s3.display(); s4.display(); s5.display();
        s6.display(); s7.display(); s8.display(); s9.display(); s10.display();
    }
}