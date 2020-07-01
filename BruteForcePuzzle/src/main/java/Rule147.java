public class Rule147 extends Rule {
  // 147 - One digit is right, but in the wrong place
  public boolean matches(int guess1, int guess2, int guess3) {
    int whites = 0;
    if (guess1 == 1 || guess1 == 4 || guess1 == 7) whites++;
    if (guess2 == 1 || guess2 == 4 || guess2 == 7) whites++;
    if (guess3 == 1 || guess3 == 4 || guess3 == 7) whites++;
    if (whites != 1) return false;

    return ((guess1 == 4 || guess1 == 7) || guess2 == 1 || guess2 == 7 || guess3 == 1 || guess3 ==4 )
        && guess1 != 1 && guess2 != 4 && guess3 != 7;
  }
}
