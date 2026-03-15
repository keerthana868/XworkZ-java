public class OrganizerExecutor {
    public static void main(String[] args) {
        Organizer o1 = new Organizer("IKEA", "Closet", 25.0, 6, "Fabric", "Grey", false, 1.2, "30x30x120", false, "IKEA", 12, false, "Modern", 10.0, false, "Sweden", "Hanging", true, 100);
        Organizer o2 = new Organizer("Rubbermaid", "Desk", 15.0, 4, "Plastic", "Black", true, 0.5, "20x15x10", true, "Newell", 24, false, "Functional", 2.0, true, "USA", "Freestanding", false, 250);
        Organizer o3 = new Organizer("Honey-Can-Do", "Shoes", 40.0, 24, "Metal/Mesh", "Silver", false, 3.5, "50x30x100", false, "HCD", 6, true, "Industrial", 20.0, false, "China", "Floor", false, 120);
        Organizer o4 = new Organizer("Simple Houseware", "Kitchen", 22.0, 3, "Steel", "Chrome", true, 1.8, "40x25x15", true, "SHW", 12, false, "Sleek", 15.0, false, "China", "Cabinet", false, 300);
        Organizer o5 = new Organizer("Command", "Wall", 10.0, 1, "Plastic", "White", false, 0.1, "10x5x5", true, "3M", 0, false, "Simple", 1.0, false, "USA", "Adhesive", false, 1000);
        Organizer o6 = new Organizer("Muji", "Stationery", 12.0, 5, "Acrylic", "Clear", false, 0.4, "15x15x10", false, "Muji", 0, false, "Minimalist", 3.0, true, "Japan", "Desktop", false, 500);
        Organizer o7 = new Organizer("Sterilite", "Underbed", 18.0, 1, "Plastic", "Clear/Blue", false, 2.0, "90x45x15", true, "Sterilite", 12, false, "Utility", 25.0, true, "USA", "Floor/Wheels", false, 400);
        Organizer o8 = new Organizer("Songmics", "Jewelry", 55.0, 50, "Wood/Velvet", "White", false, 4.0, "30x20x25", false, "Songmics", 24, false, "Classic", 5.0, false, "Germany", "Desktop", true, 75);
        o1.display(); o2.display(); o3.display(); o4.display(); o5.display(); o6.display(); o7.display(); o8.display();
    }
}