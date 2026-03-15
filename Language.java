class Language {
    int id;
    String name;
    double complexity;
    int speakerMillions;
    String script;
    double loanWordPercent;
    String countryOrigin;
    int alphabetCount;
    double popularity;
    int wordsInDictionary;
    String family;
    boolean isOfficial;

    Language(int id) {
        this.id = id;
        System.out.println("Lang Id: " + id);
    }

    Language(String name) {
        this.name = name;
        System.out.println("Lang: " + name);
    }

    Language(double complexity) {
        this.complexity = complexity;
        System.out.println("Diff: " + complexity);
    }

    Language(int speakerMillions, String script) {
        this.speakerMillions = speakerMillions;
        this.script = script;
        System.out.println("Speakers: " + speakerMillions);
        System.out.println("Script: " + script);
    }

    Language(double loanWordPercent, String countryOrigin, int alphabetCount) {
        this.loanWordPercent = loanWordPercent;
        this.countryOrigin = countryOrigin;
        this.alphabetCount = alphabetCount;
        System.out.println("Loan%: " + loanWordPercent);
        System.out.println("From: " + countryOrigin);
        System.out.println("Alpha: " + alphabetCount);
    }

    Language(double popularity, int wordsInDictionary) {
        this.popularity = popularity;
        this.wordsInDictionary = wordsInDictionary;
        System.out.println("Rank: " + popularity);
        System.out.println("Words: " + wordsInDictionary);
    }

    Language(String family, boolean isOfficial) {
        this.family = family;
        this.isOfficial = isOfficial;
        System.out.println("Family: " + family);
        System.out.println("Govt: " + isOfficial);
    }
}