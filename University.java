class University {
    int id;
    String name;
    double yearlyFee;
    int studentCount;
    String location;
    double campusArea;
    String mascot;
    int rank;
    double literacyImpact;
    int coursesOffered;
    String viceChancellor;
    boolean providesHostel;

    University(int id) {
        this.id = id;
        System.out.println("Uni Id: " + id);
    }

    University(String name) {
        this.name = name;
        System.out.println("Uni: " + name);
    }

    University(double yearlyFee) {
        this.yearlyFee = yearlyFee;
        System.out.println("Fee: " + yearlyFee);
    }

    University(int studentCount, String location) {
        this.studentCount = studentCount;
        this.location = location;
        System.out.println("Count: " + studentCount);
        System.out.println("City: " + location);
    }

    University(double campusArea, String mascot, int rank) {
        this.campusArea = campusArea;
        this.mascot = mascot;
        this.rank = rank;
        System.out.println("Area: " + campusArea);
        System.out.println("Mascot: " + mascot);
        System.out.println("Rank: " + rank);
    }

    University(double literacyImpact, int coursesOffered) {
        this.literacyImpact = literacyImpact;
        this.coursesOffered = coursesOffered;
        System.out.println("Impact: " + literacyImpact);
        System.out.println("Courses: " + coursesOffered);
    }

    University(String viceChancellor, boolean providesHostel) {
        this.viceChancellor = viceChancellor;
        this.providesHostel = providesHostel;
        System.out.println("VC: " + viceChancellor);
        System.out.println("Hostel: " + providesHostel);
    }
}