public class MapExecutor {
    public static void main(String[] args) {
        Map m1 = new Map("World Atlas", "Global", "Mercator", 1000000, 2023, "NatGeo", false, "Hardcover", 40, 60, true, "English", 50, true, "Multi", 55.0, "Annual", false, "Paper", 1);
        Map m2 = new Map("City Route", "New York", "Flat", 5000, 2024, "Google", true, "App", 0, 0, false, "English", 200, true, "Dynamic", 0.0, "Real-time", false, "Pixels", 20);
        Map m3 = new Map("Mountain Trail", "Alps", "Contour", 25000, 2022, "SwissTopo", false, "Folded", 80, 100, true, "German", 30, false, "Earth Tones", 15.0, "5 years", true, "Tyvek", 1);
        Map m4 = new Map("History Map", "Ancient Rome", "Cylindrical", 500000, 2010, "Oxford", false, "Sheet", 50, 50, false, "Latin/English", 15, true, "Sepia", 25.0, "None", true, "Parchment", 1);
        Map m5 = new Map("Star Chart", "Milky Way", "Spherical", 0.0, 2023, "NASA", true, "PDF", 0, 0, false, "Scientific", 100, true, "Dark Mode", 0.0, "Monthly", false, "Digital", 10);
        Map m6 = new Map("Subway Map", "London", "Diagram", 1.0, 2024, "TfL", false, "Pocket", 15, 10, false, "English", 12, true, "Iconic Lines", 0.0, "Variable", true, "Glossy Paper", 1);
        Map m7 = new Map("Ocean Floor", "Pacific", "Bathymetric", 2000000, 2018, "NOAA", true, "Database", 0, 0, true, "English", 40, true, "Blues", 0.0, "Decadal", false, "Digital", 15);
        Map m8 = new Map("State Road", "Texas", "Conic", 150000, 2023, "Rand McNally", false, "Spiral Bound", 30, 40, false, "English", 80, true, "Standard", 12.0, "Annual", false, "Paper", 1);
        Map m9 = new Map("Zelda Map", "Hyrule", "Game Projection", 1000, 2023, "Nintendo", true, "In-game", 0, 0, true, "Hylian", 50, true, "Vibrant", 60.0, "None", false, "Pixels", 5);
        Map m10 = new Map("Moon Surface", "Lunar", "Orthographic", 1000000, 1969, "NASA", false, "Poster", 100, 100, true, "English", 20, false, "B&W", 30.0, "Historical", false, "Paper", 1);

        m1.display(); m2.display(); m3.display(); m4.display(); m5.display();
        m6.display(); m7.display(); m8.display(); m9.display(); m10.display();
    }
}