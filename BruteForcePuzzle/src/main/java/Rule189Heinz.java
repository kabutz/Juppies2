public class Rule189Heinz extends Rule {
    // 189 - One digit is right, and in it's place
    // Either g1 == 1 and neither g2 nor g3 are 8 or 9
    // or g2 == 8 and neither g1 nor g3 are 8 or 9
    // or g2 == 9 and neither g1 nor g2 are 1 or 8
    //

    public boolean matches(int guess1, int guess2, int guess3) {
        int reds = 0;
        if (guess1 == 1) reds++;
        if (guess2 == 8) reds++;
        if (guess3 == 9) reds++;
        if (reds != 1) return false;

        return guess1 != 8 && guess1 != 9 && guess2 != 1 && guess2 != 9 && guess3 != 1 && guess3 != 8;
    }
}
