public class DumbBellExecutor {
    public static void main(String[] args) {
        DumbBell d1 = new DumbBell(5.0, "Cast Iron", "Knurled", "Bowflex", "Black", false, 28.0, "Hex", 20.0, 12, true, "USA", "Rubber", 25.0, true, "Home", 100, true, "No", 12.0);
        DumbBell d2 = new DumbBell(10.0, "Steel", "Smooth", "Rogue", "Silver", true, 30.0, "Round", 150.0, 24, true, "USA", "Chrome", 35.0, false, "Commercial", 50, false, "No", 14.0);
        DumbBell d3 = new DumbBell(2.5, "Iron", "Soft", "AmazonBasics", "Pink", false, 25.0, "Round", 10.0, 6, false, "China", "Neoprene", 15.0, true, "Home", 500, true, "No", 10.0);
        DumbBell d4 = new DumbBell(24.0, "Steel", "Knurled", "PowerBlock", "Black", true, 32.0, "Square", 400.0, 60, true, "USA", "Urethane", 40.0, true, "Commercial", 20, true, "Yes", 13.0);
        DumbBell d5 = new DumbBell(20.0, "Cast Iron", "Knurled", "Decathlon", "Black", false, 28.0, "Hex", 45.0, 24, true, "China", "None", 30.0, false, "Home", 200, true, "No", 12.5);
        DumbBell d6 = new DumbBell(1.0, "Iron", "Smooth", "Nike", "Blue", false, 20.0, "Round", 15.0, 12, false, "Vietnam", "Vinyl", 12.0, true, "Home", 300, true, "No", 9.0);
        DumbBell d7 = new DumbBell(50.0, "Steel", "Knurled", "Eleiko", "Black", false, 35.0, "Round", 300.0, 120, true, "Sweden", "Rubber", 45.0, false, "Commercial", 10, false, "No", 15.0);
        DumbBell d8 = new DumbBell(15.0, "Cast Iron", "Knurled", "Cap Barbell", "Grey", false, 28.0, "Hex", 30.0, 12, false, "China", "Enamel", 28.0, false, "Home", 150, true, "No", 12.0);
        DumbBell d9 = new DumbBell(7.5, "Steel", "Textured", "Reebok", "Grey", false, 27.0, "Round", 40.0, 12, true, "UK", "Rubber", 22.0, true, "Commercial", 80, false, "No", 11.5);
        DumbBell d10 = new DumbBell(12.5, "Iron", "Knurled", "Titan", "Black", false, 30.0, "Hex", 55.0, 12, true, "USA", "Urethane", 32.0, true, "Home", 60, true, "No", 13.0);

        d1.display(); d2.display(); d3.display(); d4.display(); d5.display();
        d6.display(); d7.display(); d8.display(); d9.display(); d10.display();
    }
}