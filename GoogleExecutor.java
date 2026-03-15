public class GoogleExecutor {
    public static void main(String[] args) {
        
        // Initializing 10 instances with unique data
        Google g1 = new Google("Mountain View", "Sundar Pichai", 182000, 142.50, "Chrome", 24, true, 282.8, "GCP", 50000000, "Pixel 8", true, 14, "Gemini", 11.0, 2000, "Earth Day", true, 70, "google.com");
        Google g2 = new Google("Dublin", "Sundar Pichai", 10000, 140.20, "Chrome", 5, true, 50.5, "GCP", 1000000, "Pixel 7", true, 13, "PaLM 2", 10.5, 1500, "International Women's Day", true, 10, "google.ie");
        Google g3 = new Google("London", "Sundar Pichai", 8000, 141.10, "Chrome", 3, true, 30.2, "GCP", 800000, "Pixel Fold", true, 14, "LaMDA", 10.8, 1200, "Cricket World Cup", false, 5, "google.co.uk");
        Google g4 = new Google("Zurich", "Sundar Pichai", 5000, 139.90, "Chrome", 2, true, 25.1, "GCP", 400000, "Pixel 7a", true, 14, "Gemini Pro", 10.2, 900, "Science History", true, 2, "google.ch");
        Google g5 = new Google("Tokyo", "Sundar Pichai", 3000, 143.00, "Chrome", 4, true, 15.8, "GCP", 2000000, "Pixel 8 Pro", true, 14, "Gemini Ultra", 11.5, 850, "Cherry Blossom", true, 4, "google.co.jp");
        Google g6 = new Google("Bangalore", "Sundar Pichai", 15000, 142.00, "Chrome", 6, true, 40.0, "GCP", 15000000, "Pixel 6", true, 12, "BERT", 10.0, 3000, "Diwali", true, 8, "google.co.in");
        Google g7 = new Google("New York", "Sundar Pichai", 12000, 144.50, "Chrome", 2, true, 60.0, "GCP", 9000000, "Pixel 8", true, 14, "Gemini", 12.0, 1100, "New Year", true, 3, "google.com");
        Google g8 = new Google("Singapore", "Sundar Pichai", 4000, 141.80, "Chrome", 3, true, 18.0, "GCP", 1200000, "Pixel Watch 2", true, 14, "Gemini Nano", 10.9, 500, "National Day", true, 2, "google.com.sg");
        Google g9 = new Google("Sydney", "Sundar Pichai", 2500, 140.50, "Chrome", 1, true, 10.2, "GCP", 500000, "Pixel Tablet", true, 14, "MUM", 9.8, 400, "Great Barrier Reef", false, 2, "google.com.au");
        Google g10 = new Google("Berlin", "Sundar Pichai", 2000, 142.10, "Chrome", 2, true, 12.5, "GCP", 300000, "Pixel 7 Pro", true, 13, "Med-PaLM", 10.1, 350, "Bauhaus Centenary", true, 1, "google.de");

        g1.display();
        g2.display();
        g3.display();
        g4.display();
        g5.display();
        g6.display();
        g7.display();
        g8.display();
        g9.display();
        g10.display();
    }
}