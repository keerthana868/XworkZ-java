public class OfficeExecutor {
    public static void main(String[] args) {
        Office o1 = new Office("HQ", "Silicon Valley", 10, 500, true, 50000.0, "TechNova", true, 20, "Comcast", true, 25000.0, "Modern", true, 600, "Casual", true, "Biometric", 100, true);
        Office o2 = new Office("London Hub", "The City", 2, 80, false, 15000.0, "FinCorp", false, 5, "BT", false, 8000.0, "Classic", true, 100, "Formal", false, "Keycard", 20, true);
        Office o3 = new Office("Bangalore Branch", "Whitefield", 5, 300, true, 8000.0, "SoftSolutions", true, 12, "ACT", true, 15000.0, "Minimalist", true, 350, "Smart Casual", true, "Security Guard", 60, true);
        Office o4 = new Office("Studio", "Brooklyn", 1, 15, true, 4500.0, "ArtVibe", false, 1, "Verizon", false, 2000.0, "Industrial", false, 15, "Casual", true, "Camera", 10, true);
        Office o5 = new Office("Tokyo Sales", "Shinjuku", 25, 1200, false, 100000.0, "GlobalTrade", true, 50, "Softbank", true, 60000.0, "Corporate", true, 1300, "Strict Formal", false, "Full Team", 300, true);
        Office o6 = new Office("Berlin Lab", "Mitte", 3, 50, true, 7000.0, "BioGen", true, 4, "Telekom", true, 6000.0, "Scandi", true, 40, "Casual", true, "Smart Lock", 30, true);
        Office o7 = new Office("Sydney View", "Harbour", 15, 450, true, 40000.0, "SeaConsult", true, 15, "Telstra", true, 20000.0, "Luxury", true, 500, "Business", true, "Concierge", 150, true);
        Office o8 = new Office("Dubai Towers", "Downtown", 50, 2000, false, 200000.0, "OilGroup", true, 100, "Etisalat", true, 100000.0, "Opulent", true, 2200, "Formal", false, "Advanced", 1000, true);
        Office o9 = new Office("Austin Outpost", "East Side", 1, 25, true, 3000.0, "StartupX", false, 2, "Google Fiber", true, 3500.0, "Retro", true, 30, "Casual", true, "App-based", 8, true);
        Office o10 = new Office("Paris Office", "La Defense", 8, 200, true, 25000.0, "ModeFashion", true, 10, "Orange", true, 12000.0, "Chic", true, 250, "Stylish", true, "Keycard", 40, true);

        o1.display(); o2.display(); o3.display(); o4.display(); o5.display();
        o6.display(); o7.display(); o8.display(); o9.display(); o10.display();
    }
}