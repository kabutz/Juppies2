public class Rule964John extends Rule {
    // 964 - Two digits are correct, but both are in the wrong place
    public boolean matches(int guess1, int guess2, int guess3) {
        int matches = 0;
        if ((guess1 == 4 || guess1 == 6) && guess1 != 9) matches++;
        if ((guess2 == 9 || guess2 == 4) && guess2 != 6) matches++;
        if ((guess3 == 9 || guess3 == 6) && guess3 != 4) matches++;
        return matches == 2;
    }
}
