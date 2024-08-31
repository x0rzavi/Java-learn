public class ElectricGuitar {
  String brand;
  int numOfPickups;
  boolean rockStarUsesIt;

  String getBrand() {
    return brand;
  }

  void setBrand(String aBrand) {
    brand = aBrand;
  }

  int getNumOfPickups() {
    return numOfPickups;
  }

  void setNumOfPickups(int num) {
    numOfPickups = num;
  }

  boolean getRockStarUsesIt() {
    return rockStarUsesIt;
  }

  void setRockStarUsesIt(boolean yesOrNo) {
    rockStarUsesIt = yesOrNo;
  }
}

class ElectricGuitarTestDrive {
  public static void main(String[] args) {
    ElectricGuitar one = new ElectricGuitar();
    one.setBrand("Yamaha");
    System.out.println(one.getBrand());
    one.setNumOfPickups(10);
    System.out.println(one.getNumOfPickups());
    one.setRockStarUsesIt(true);
    System.out.println(one.getRockStarUsesIt());
    one.setBrand("Casio");
    System.out.println(one.getBrand());
  }
}
