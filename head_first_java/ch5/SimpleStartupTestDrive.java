public class SimpleStartupTestDrive {
  public static void main(String[] args) {
    SimpleStartup one = new SimpleStartup();

    int[] locations = {2, 3, 4};
    one.setLocationCells(locations);

    int userGuess = 3;
    String result = one.checkYourself(userGuess);

    String testResult = "failed";
    if (result.equals("hit")) {
      testResult = "passed";
    }

    System.out.println(testResult);
  }
}
