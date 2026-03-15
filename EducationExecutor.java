public class EducationExecutor {
    public static void main(String[] args) {
        Education e1 = new Education("Higher", "Harvard", "Law", 4, 60000.0, false, "USA", 20000, "J.D.", true, "Ivy League", 2000, "English", true, 3.9, "Global", 10, true, "Urban", 1636);
        Education e2 = new Education("Secondary", "Doon School", "Science", 2, 10000.0, false, "India", 1000, "HSC", true, "CBSE", 100, "English", false, 3.5, "National", 1, true, "Residential", 1935);
        Education e3 = new Education("Higher", "MIT", "Computer Science", 4, 55000.0, false, "USA", 11000, "B.S.", true, "NECHE", 1500, "English", true, 4.0, "Global", 5, true, "Urban", 1861);
        Education e4 = new Education("Vocational", "Udacity", "Data Science", 1, 2000.0, true, "Online", 50000, "Nanodegree", false, "Industry", 200, "English", false, 0.0, "Tech", 0, true, "Virtual", 2011);
        Education e5 = new Education("Higher", "Oxford", "Philosophy", 3, 45000.0, false, "UK", 24000, "B.A.", true, "Royal Charter", 3000, "English", true, 3.8, "Global", 100, true, "Historic", 1096);
        Education e6 = new Education("Primary", "Little Buds", "General", 5, 3000.0, false, "Australia", 500, "Certificate", false, "State", 40, "English", false, 0.0, "Local", 1, false, "Suburban", 1990);
        Education e7 = new Education("Higher", "IIT Delhi", "Engineering", 4, 2500.0, false, "India", 10000, "B.Tech", true, "NAAC", 800, "English", true, 3.7, "National", 2, true, "Urban", 1961);
        Education e8 = new Education("Higher", "Stanford", "Business", 2, 75000.0, false, "USA", 16000, "MBA", true, "WASC", 2200, "English", true, 3.9, "Global", 7, true, "Campus", 1885);
        e1.display(); e2.display(); e3.display(); e4.display(); e5.display(); e6.display(); e7.display(); e8.display();
    }
}