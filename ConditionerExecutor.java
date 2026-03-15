public class ConditionerExecutor {
    public static void main(String[] args) {
        Conditioner c1 = new Conditioner("Tresemme", "Keratin", 7.5, 400.0, "Frizzy", true, "Floral", 8, true, "Unilever", 24, "Creamy", true, 5.5, "Smoothness", false, "Argan", 3, true, 200);
        Conditioner c2 = new Conditioner("Ogx", "Coconut Milk", 11.0, 385.0, "Dry", true, "Tropical", 9, true, "Vogue", 36, "Thick", true, 5.0, "Hydration", true, "Coconut", 4, true, 150);
        Conditioner c3 = new Conditioner("Pantene", "Aqua Light", 5.0, 200.0, "Fine", false, "Fresh", 5, false, "P&G", 24, "Gel-like", true, 6.0, "Volume", false, "Castor", 2, false, 300);
        Conditioner c4 = new Conditioner("Shea Moisture", "Raw Shea", 13.0, 384.0, "Curly", true, "Nutty", 10, true, "Sundial", 18, "Heavy", false, 4.5, "Damage Repair", true, "Shea Butter", 1, true, 80);
        Conditioner c5 = new Conditioner("Garnier", "Whole Blends", 6.0, 370.0, "Normal", true, "Honey", 7, true, "L'Oreal", 24, "Creamy", true, 5.2, "Softness", false, "Honey", 3, true, 400);
        Conditioner c6 = new Conditioner("Moroccanoil", "Hydrating", 26.0, 250.0, "All", true, "Spicy", 9, true, "Moroccanoil", 12, "Smooth", true, 5.8, "Manageability", true, "Argan", 2, true, 50);
        Conditioner c7 = new Conditioner("L'Oreal", "Elvive", 4.5, 300.0, "Color Treated", false, "Sweet", 6, true, "L'Oreal", 36, "Liquid", true, 5.5, "Color Lock", false, "Linseed", 3, false, 500);
        Conditioner c8 = new Conditioner("Redken", "All Soft", 24.0, 300.0, "Brittle", true, "Mild", 9, true, "L'Oreal", 24, "Rich", true, 5.0, "Moisture", false, "Olive", 2, true, 60);
        Conditioner c9 = new Conditioner("Aveda", "Damage Remedy", 32.0, 200.0, "Broken", true, "Earthy", 8, true, "Estee Lauder", 12, "Paste", true, 4.8, "Strengthening", true, "Quinoa", 1, true, 40);
        Conditioner c10 = new Conditioner("Dove", "Daily Care", 5.5, 250.0, "Normal", true, "Clean", 6, false, "Unilever", 36, "Cream", true, 6.0, "Daily Use", false, "Sunflower", 7, true, 600);

        c1.display(); c2.display(); c3.display(); c4.display(); c5.display();
        c6.display(); c7.display(); c8.display(); c9.display(); c10.display();
    }
}