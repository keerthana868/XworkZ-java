class Movie {
    int id;
    String title;
    double budget;
    int duration;
    String director;
    double rating;
    String genre;
    int releaseYear;
    double collection;
    int castCount;
    String language;
    boolean isHit;

    Movie(int id) {
        this.id = id;
        System.out.println("Movie Id: " + id);
    }

    Movie(String title) {
        this.title = title;
        System.out.println("Title: " + title);
    }

    Movie(double budget) {
        this.budget = budget;
        System.out.println("Budget: " + budget);
    }

    Movie(int duration, String director) {
        this.duration = duration;
        this.director = director;
        System.out.println("Length: " + duration);
        System.out.println("Dir: " + director);
    }

    Movie(double rating, String genre, int releaseYear) {
        this.rating = rating;
        this.genre = genre;
        this.releaseYear = releaseYear;
        System.out.println("Stars: " + rating);
        System.out.println("Genre: " + genre);
        System.out.println("Year: " + releaseYear);
    }

    Movie(double collection, int castCount) {
        this.collection = collection;
        this.castCount = castCount;
        System.out.println("Profit: " + collection);
        System.out.println("Cast: " + castCount);
    }

    Movie(String language, boolean isHit) {
        this.language = language;
        this.isHit = isHit;
        System.out.println("Lang: " + language);
        System.out.println("Hit: " + isHit);
    }
}