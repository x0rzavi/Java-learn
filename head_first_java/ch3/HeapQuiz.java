class HeapQuiz {
  int id = 0;

  public static void main (String[] args) {
    int x = 0;
    HeapQuiz[] hq = new HeapQuiz[5];
    while (x < 3) {
      hq[x] = new HeapQuiz();
      hq[x].id = x;
      x = x + 1;
    }

    hq[3] = hq[1];
  }
}
