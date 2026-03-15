class Education {
    String level;
    String institutionName;
    String major;
    int durationYears;
    double tuitionFee;
    boolean isOnline;
    String country;
    int studentCount;
    String degreeAwarded;
    boolean scholarshipAvailable;
    String accreditation;
    int teacherCount;
    String primaryLanguage;
    boolean researchFocused;
    double averageGpa;
    String affiliation;
    int libraryCount;
    boolean placementSupport;
    String campusType;
    int establishedYear;

    Education(String level, String institutionName, String major, int durationYears, double tuitionFee, boolean isOnline, String country, int studentCount, String degreeAwarded, boolean scholarshipAvailable, String accreditation, int teacherCount, String primaryLanguage, boolean researchFocused, double averageGpa, String affiliation, int libraryCount, boolean placementSupport, String campusType, int establishedYear) {
        this.level = level;
        this.institutionName = institutionName;
        this.major = major;
        this.durationYears = durationYears;
        this.tuitionFee = tuitionFee;
        this.isOnline = isOnline;
        this.country = country;
        this.studentCount = studentCount;
        this.degreeAwarded = degreeAwarded;
        this.scholarshipAvailable = scholarshipAvailable;
        this.accreditation = accreditation;
        this.teacherCount = teacherCount;
        this.primaryLanguage = primaryLanguage;
        this.researchFocused = researchFocused;
        this.averageGpa = averageGpa;
        this.affiliation = affiliation;
        this.libraryCount = libraryCount;
        this.placementSupport = placementSupport;
        this.campusType = campusType;
        this.establishedYear = establishedYear;
    }

    void display() {
        System.out.println("Institution: " + institutionName + " [" + degreeAwarded + "]");
        System.out.println("Major: " + major + " | Fee: $" + tuitionFee + " | Online: " + isOnline);
        System.out.println("--------------------------------");
    }
}