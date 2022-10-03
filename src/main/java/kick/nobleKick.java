package kick;

import lotr.Character;

import java.util.Random;

public class nobleKick implements BasicKick {
    @Override
    public void kick(Character whoKick, Character whoGetKick) {
        System.out.println("Noble kick");
        whoGetKick.setHp(whoGetKick.getHp() - new Random().nextInt(whoKick.getPower() + 1));
    }
}
