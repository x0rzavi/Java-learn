public class Movie {
  String title;
  String genre;
  int rating;

  void playIt() {
    System.out.println("Playing the movie");
  }
}

class MovieTestDrive {
  public static void main(String[] args) {
    Movie one = new Movie();
    one.title = "Tenet";
    one.genre = "Sci-fi";
    one.rating = 9;
    Movie two = new Movie();
    two.title = "Interstellar";
    two.genre = "Sci-fi";
    two.rating = 8;
    Movie three = new Movie();
    three.title = "Fight Club";
    three.genre = "Fantasy";
    three.rating = 7;
    three.playIt();
  }
}
