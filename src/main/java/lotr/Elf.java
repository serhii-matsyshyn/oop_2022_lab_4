package lotr;

import kick.superKick;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Elf extends Character {
//    - attributes: int power=10, int hp=10
//            - methods: void kick(lotr.Character c) {
//        kill everybody weaker than him,
//                otherwise decrease the power of character by 1
//    }

    public Elf(int power, int hp) {
        super(power, hp);
        setKickMain(new superKick());
    }

    public Elf() {
        super(10, 10);
        setKickMain(new superKick());
    }
}
