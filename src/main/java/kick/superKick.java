package kick;

import lotr.Character;

public class superKick implements BasicKick {
    @Override
    public void kick(Character whoKick, Character whoGetKick) {
        System.out.println("Super kick");
        if (whoGetKick.getPower() < whoKick.getPower()) {
            whoGetKick.setHp(0);
        } else {
            whoGetKick.setHp(whoGetKick.getPower() - 1);
        }
    }
}
