class Country {
    int id;
    String name;
    double gdp;
    int population;
    String capital;
    double area;
    String continent;
    int states;
    double literacyRate;
    int callingCode;
    String currency;
    boolean isIsland;

    Country(int id) {
        this.id = id;
        System.out.println("Country Id: " + id);
    }

    Country(String name) {
        this.name = name;
        System.out.println("Country: " + name);
    }

    Country(double gdp) {
        this.gdp = gdp;
        System.out.println("GDP: " + gdp);
    }

    Country(int population, String capital) {
        this.population = population;
        this.capital = capital;
        System.out.println("Pop: " + population);
        System.out.println("Cap: " + capital);
    }

    Country(double area, String continent, int states) {
        this.area = area;
        this.continent = continent;
        this.states = states;
        System.out.println("Area: " + area);
        System.out.println("Cont: " + continent);
        System.out.println("States: " + states);
    }

    Country(double literacyRate, int callingCode) {
        this.literacyRate = literacyRate;
        this.callingCode = callingCode;
        System.out.println("Literacy: " + literacyRate);
        System.out.println("Code: " + callingCode);
    }

    Country(String currency, boolean isIsland) {
        this.currency = currency;
        this.isIsland = isIsland;
        System.out.println("Money: " + currency);
        System.out.println("Island: " + isIsland);
    }
}