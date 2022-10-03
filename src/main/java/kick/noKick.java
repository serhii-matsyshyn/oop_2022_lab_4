package kick;

import lotr.Character;

public class noKick implements BasicKick {
    @Override
    public void kick(Character whoKick, Character whoGetKick) {
        System.out.println("No kick");
    }
}
