package lotr;

import kick.nobleKick;

public class King extends lotr.Noble {
//       - attributes: int power=from 5 to 15, int hp=from 5 to 15
//       - methods: void kick(Character c) {
//        decrease number of hp of the enemy by random
//        number which will be in the range of his power
//}

    public King() {
        super(5, 15);
        setKickMain(new nobleKick());
    }

}

