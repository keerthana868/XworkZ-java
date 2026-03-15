public class PVRExecutor {
    public static void main(String[] args) {
        PVR p1 = new PVR("Forum Mall", "Bangalore", 11, true, false, 450.0, 1200, "Avatar 3", true, 50000.0, "Gold Class", 50, true, 110.0, "Laser 4K", true, 60, "Caramel, Cheese", true, "pvr.com");
        PVR p2 = new PVR("CyberHub", "Gurgaon", 7, false, true, 350.0, 800, "Inception 2", true, 30000.0, "IMAX", 35, true, 105.0, "Digital", true, 40, "Salted", true, "pvr.com");
        PVR p3 = new PVR("Phoenix Mall", "Mumbai", 15, true, true, 600.0, 2000, "Avengers 5", true, 120000.0, "Director's Cut", 80, true, 115.0, "Dual Laser", true, 80, "Peri Peri", true, "pvr.com");
        PVR p4 = new PVR("Central Square", "Chennai", 5, false, false, 180.0, 600, "Leo", true, 15000.0, "Standard", 25, false, 95.0, "Standard", false, 25, "Butter", true, "pvr.com");
        PVR p5 = new PVR("GVK One", "Hyderabad", 6, false, false, 300.0, 900, "Pushpa 2", true, 40000.0, "Lux", 40, true, 102.0, "4K Digital", true, 36, "Caramel", true, "pvr.com");
        PVR p6 = new PVR("Select City", "Delhi", 8, true, false, 550.0, 1000, "The Batman", true, 45000.0, "PVR Heritage", 60, true, 108.0, "IMAX Laser", true, 48, "Cheese", true, "pvr.com");
        PVR p7 = new PVR("Lulu Mall", "Kochi", 12, false, true, 250.0, 1500, "Malik", true, 25000.0, "Standard", 45, true, 100.0, "Digital", false, 50, "Plain", true, "pvr.com");
        PVR p8 = new PVR("Mall of India", "Noida", 10, true, true, 400.0, 1100, "Spiderman", true, 60000.0, "Superplex", 55, true, 112.0, "Laser", true, 55, "Mixed", true, "pvr.com");
        PVR p9 = new PVR("South City", "Kolkata", 6, false, false, 220.0, 850, "Tiger 3", true, 20000.0, "Standard", 30, true, 98.0, "Standard", true, 30, "Caramel", true, "pvr.com");
        PVR p10 = new PVR("Amanora", "Pune", 9, false, true, 280.0, 1050, "Dune 2", true, 35000.0, "4DX", 42, true, 107.0, "Digital", false, 45, "Cheese", true, "pvr.com");

        p1.display(); p2.display(); p3.display(); p4.display(); p5.display();
        p6.display(); p7.display(); p8.display(); p9.display(); p10.display();
    }
}