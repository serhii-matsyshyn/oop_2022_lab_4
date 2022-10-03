package lotr;

import kick.BasicKick;
import kick.cryKick;
import kick.noKick;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Character {
//  - attributes: int power, in hp
//  - methods: void kick(lotr.Character c), boolean isAlive()

    private int power;
    private int hp;

    private BasicKick kickMain = new noKick();

    public Character(int power, int hp) {
        this.power = power;
        this.hp = hp;
    }

    public boolean isAlive() {
        return getHp() > 0;
    }

    public void setHp(int hp) {
        this.hp = Math.max(hp, 0);
    }

    public void kick(Character c) {
        kickMain.kick(this, c);
    }

    public String toString() {
        return getClass().getCanonicalName() + "{" +
                "hp=" + hp +
                ", power=" + power +
                '}';
    }
}
