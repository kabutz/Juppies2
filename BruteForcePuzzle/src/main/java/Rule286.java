public class Rule286 extends Rule {
  // 286 - One digit is right, but in the wrong place
  public boolean matches(int guess1, int guess2, int guess3) {
    return guess1 == 8 || guess1 == 6 ||
        guess2 == 2 || guess2 == 6 ||
        guess3 == 2 || guess3 == 8;
  }
}
