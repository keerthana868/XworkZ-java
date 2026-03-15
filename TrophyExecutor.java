public class TrophyExecutor {
    public static void main(String[] args) {
        Trophy tr1 = new Trophy("FIFA World Cup", "18K Gold", 6.1, 36.5, 1974, "Argentina", 20000000.0, true, "Silvio Gazzaniga", "Italy", 13, "Malachite", true, "Globe", 18.0, true, "France", 1, "Professional", true);
        Trophy tr2 = new Trophy("Wimbledon Men", "Silver Gilt", 3.5, 47.0, 1887, "Carlos Alcaraz", 15000.0, false, "Unknown", "UK", 136, "Silver", true, "Cup", 0.0, true, "Novak Djokovic", 1, "Polishing", true);
        Trophy tr3 = new Trophy("ICC Cricket World Cup", "Gold and Silver", 11.0, 60.0, 1999, "Australia", 30000.0, true, "Garrard & Co", "UK", 7, "Silver", true, "Globe/Stumps", 24.0, true, "England", 1, "Silver Clean", true);
        Trophy tr4 = new Trophy("Champions League", "Silver", 7.5, 74.0, 1967, "Real Madrid", 10000.0, true, "Jurg Stadelmann", "Switzerland", 57, "Silver", true, "Jar/Handles", 0.0, true, "Man City", 1, "Polishing", true);
        Trophy tr5 = new Trophy("NBA Larry O'Brien", "24K Gold Plated", 7.0, 61.0, 1977, "Denver Nuggets", 13500.0, true, "Tiffany & Co", "USA", 46, "Silver", true, "Basketball", 24.0, false, "Warriors", 1, "Gold Cloth", true);
        Trophy tr6 = new Trophy("Oscar", "Gold Plated Bronze", 3.8, 34.0, 1929, "Christopher Nolan", 400.0, false, "Cedric Gibbons", "USA", 3000, "Black Marble", true, "Knight", 24.0, false, "Various", 1, "Dry Cloth", false);
        Trophy tr7 = new Trophy("Stanley Cup", "Silver and Nickel", 15.5, 89.5, 1892, "Vegas Golden Knights", 650000.0, true, "Lord Stanley", "Canada", 100, "Silver", true, "Bowl", 0.0, true, "Colorado Avalanche", 1, "Hand Wash", true);
        Trophy tr8 = new Trophy("The Ashes", "Terracotta", 0.2, 11.0, 1882, "Australia", 0.0, true, "Unknown", "UK", 73, "Wood", false, "Urn", 0.0, true, "England", 1, "Dusting", true);
        Trophy tr9 = new Trophy("Super Bowl Vince Lombardi", "Sterling Silver", 3.2, 56.0, 1967, "Kansas City Chiefs", 50000.0, true, "Tiffany & Co", "USA", 57, "Silver", true, "Football", 0.0, false, "Rams", 1, "Professional", true);
        Trophy tr10 = new Trophy("Ballon d'Or", "Gold Plated Brass", 12.0, 31.0, 1956, "Lionel Messi", 3000.0, false, "Mellerio", "France", 67, "Pyrite", true, "Football", 18.0, false, "Karim Benzema", 1, "Polishing", true);

        tr1.display(); tr2.display(); tr3.display(); tr4.display(); tr5.display();
        tr6.display(); tr7.display(); tr8.display(); tr9.display(); tr10.display();
    }
}