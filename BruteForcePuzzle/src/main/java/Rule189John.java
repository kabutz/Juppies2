public class Rule189John extends Rule {
    // 189 - One digit is right, and in it's place
    public boolean matches(int guess1, int guess2, int guess3) {
        int wrongs = 0;
        if (guess1 == 8 || guess1 == 9) wrongs++;
        if (guess2 == 1 || guess2 == 9) wrongs++;
        if (guess3 == 1 || guess3 == 8) wrongs++;
        if (wrongs > 0) return false;

        int rights = 0;
        if (guess1 == 1) rights++;
        if (guess2 == 8) rights++;
        if (guess3 == 9) rights++;
        return rights == 1;
    }
}
