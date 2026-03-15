class Athlete {
    int id;
    String name;
    double height;
    int age;
    String sport;
    double weight;
    String country;
    int medals;
    double salary;
    int rank;
    String coach;
    boolean retired;

    Athlete(int id) {
        this.id = id;
        System.out.println("Athlete Id: " + id);
    }

    Athlete(String name) {
        this.name = name;
        System.out.println("Name: " + name);
    }

    Athlete(double height) {
        this.height = height;
        System.out.println("Height: " + height);
    }

    Athlete(int age, String sport) {
        this.age = age;
        this.sport = sport;
        System.out.println("Age: " + age);
        System.out.println("Sport: " + sport);
    }

    Athlete(double weight, String country, int medals) {
        this.weight = weight;
        this.country = country;
        this.medals = medals;
        System.out.println("Weight: " + weight);
        System.out.println("Country: " + country);
        System.out.println("Medals: " + medals);
    }

    Athlete(double salary, int rank) {
        this.salary = salary;
        this.rank = rank;
        System.out.println("Salary: " + salary);
        System.out.println("Rank: " + rank);
    }

    Athlete(String coach, boolean retired) {
        this.coach = coach;
        this.retired = retired;
        System.out.println("Coach: " + coach);
        System.out.println("Retired: " + retired);
    }
}