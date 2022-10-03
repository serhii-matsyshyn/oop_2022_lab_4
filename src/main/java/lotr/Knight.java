package lotr;

import kick.nobleKick;

public class Knight extends lotr.Noble {
//       - attributes: int power=from 2 to 12, int hp=from 2 to 12
//       - methods: void kick(Character c) { like King }

    public Knight() {
        super(2, 12);
        setKickMain(new nobleKick());
    }
}
