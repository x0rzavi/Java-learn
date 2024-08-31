public class SimpleStartup {
  private int[] locationCells;
  private int numOfHits = 0;

  public void setLocationCells(int[] locs) {
    locationCells = locs;
  }

  public String checkYourself(int guess) {
    String result = "miss";
    for (int cell : locationCells) {
      if (guess == cell) { // BUG: Ignore previously made guesses
        result = "hit";
        numOfHits++;
        break;
      }
    }

    if (numOfHits == locationCells.length) {
      result = "kill";
    }

    System.out.println(result);
    return result;
  }
}
