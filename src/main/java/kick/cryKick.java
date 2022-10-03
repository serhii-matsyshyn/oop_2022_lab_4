package kick;

import lotr.Character;

public class cryKick implements BasicKick {
    @Override
    public void kick(Character whoKick, Character whoGetKick) {
        System.out.println("Cry kick");
        toCry();
        whoGetKick.setHp(whoGetKick.getPower() - 1);
    }

    public void toCry() {
        System.out.println("Cry...");
    }
}
