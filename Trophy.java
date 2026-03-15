class Trophy {
    String tournamentName;
    String material; // Gold, Silver, Bronze
    double weightKg;
    double heightCm;
    int yearEstablished;
    String currentHolder;
    double estimatedValue;
    boolean isTeamTrophy;
    String designerName;
    String originCountry;
    int timesAwarded;
    String baseMaterial;
    boolean engravingIncluded;
    String trophyShape;
    double goldPurityKarat;
    boolean isPerpetual;
    String lastWinner;
    int displayCaseCount;
    String cleaningRequirement;
    boolean insured;

    Trophy(String tournamentName, String material, double weightKg, double heightCm, int yearEstablished, String currentHolder, double estimatedValue, boolean isTeamTrophy, String designerName, String originCountry, int timesAwarded, String baseMaterial, boolean engravingIncluded, String trophyShape, double goldPurityKarat, boolean isPerpetual, String lastWinner, int displayCaseCount, String cleaningRequirement, boolean insured) {
        this.tournamentName = tournamentName;
        this.material = material;
        this.weightKg = weightKg;
        this.heightCm = heightCm;
        this.yearEstablished = yearEstablished;
        this.currentHolder = currentHolder;
        this.estimatedValue = estimatedValue;
        this.isTeamTrophy = isTeamTrophy;
        this.designerName = designerName;
        this.originCountry = originCountry;
        this.timesAwarded = timesAwarded;
        this.baseMaterial = baseMaterial;
        this.engravingIncluded = engravingIncluded;
        this.trophyShape = trophyShape;
        this.goldPurityKarat = goldPurityKarat;
        this.isPerpetual = isPerpetual;
        this.lastWinner = lastWinner;
        this.displayCaseCount = displayCaseCount;
        this.cleaningRequirement = cleaningRequirement;
        this.insured = insured;
    }

    void display() {
        System.out.println("Tournament: " + tournamentName + " | Current Holder: " + currentHolder);
        System.out.println("Material: " + material + " | Height: " + heightCm + "cm | Value: $" + estimatedValue);
        System.out.println("Is Team Trophy: " + isTeamTrophy + " | Year: " + yearEstablished);
        System.out.println("--------------------------------");
    }
}