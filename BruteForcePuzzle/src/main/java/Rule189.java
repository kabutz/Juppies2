public class Rule189 extends Rule {
  // 189 - One digit is right, and in it's place
  public boolean matches(int guess1, int guess2, int guess3) {
    int reds = 0;
    if (guess1 == 1) reds++;
    if (guess2 == 8) reds++;
    if (guess3 == 9) reds++;
    if (reds != 1) return false;

    return guess1 != 8 && guess1 != 9 && guess2 != 1 && guess2 != 9 && guess3 != 1 && guess3 != 8;
  }
}
