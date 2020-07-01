public class Rule523 extends Rule {
  // 523 - All digits are wrong
  public boolean matches(int guess1, int guess2, int guess3) {
    return !(guess1 == 5 || guess1 == 2 || guess1 == 3 ||
        guess2 == 5 || guess2 == 2 || guess2 == 3 ||
        guess3 == 5 || guess3 == 2 || guess3 == 3);
  }
}
