package lotr;

import kick.cryKick;

public class Hobbit extends Character {
//  - attributes: int power=0, int hp=3
//  - methods: void kick(lotr.Character c) { toCry() }

    public Hobbit(int power, int hp) {
        super(power, hp);
        setKickMain(new cryKick());
    }

    public Hobbit() {
        super(0, 3);
        setKickMain(new cryKick());
    }
}
