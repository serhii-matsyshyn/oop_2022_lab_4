package lotr;

import java.util.Random;

public abstract class Noble extends Character {
    private final static Random randGen = new Random();

    public Noble(int min, int max) {
        super(randGen.nextInt(max - min + 1) + min, randGen.nextInt(max - min + 1) + min);
    }
}
