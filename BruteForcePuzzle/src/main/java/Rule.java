public abstract class Rule {
    public abstract boolean matches(int guess1, int guess2, int guess3);

    public boolean equals(Object obj) {
        Rule other = (Rule) obj;
        for (int guess1 = 1; guess1 <= 9; guess1++) {
            for (int guess2 = 1; guess2 <= 9; guess2++) {
                for (int guess3 = 1; guess3 <= 9; guess3++) {
                    if (matches(guess1, guess2, guess3) != other.matches(guess1, guess2, guess3)) {
                        System.out.println("Mismatch for " + guess1 + " " + guess2 + " " + guess3);
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
