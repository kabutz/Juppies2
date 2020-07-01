public class PuzzleSolver {
  private final Rule[] rules = {
      new Rule147(),
      new Rule189(),
      new Rule286(),
      new Rule523(),
      new Rule964()
  };

  public void solve() {
    for (int guess1 = 1; guess1 <= 9; guess1++) {
      for (int guess2 = 1; guess2 <= 9; guess2++) {
        for (int guess3 = 1; guess3 <= 9; guess3++) {
          guess(guess1, guess2, guess3);
        }
      }
    }
  }

  private void guess(int guess1, int guess2, int guess3) {
    for (Rule rule : rules) {
      if (!rule.matches(guess1, guess2, guess3)) return;
    }
    System.out.println("Possible match: " +
        guess1 + " " + guess2 + " " + guess3);
  }
}
