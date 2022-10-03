package lotr;

public class GameManager {
//    methods: void fight(Character c1, Character c2) {
//    to provide fight between to characters and explain via command
//    line what happens during fight, till both of
//    the characters are alive
//}

    void fight(Character c1, Character c2) {
        System.out.println("Fight between " + c1.getClass().getSimpleName() + " and " + c2.getClass().getSimpleName());
        while (c1.isAlive() && c2.isAlive()) {
            System.out.println("! Round !");
            System.out.print(c1.getClass().getSimpleName() + " uses ");
            c1.kick(c2);

            if (c2.isAlive()) {
                System.out.print(c2.getClass().getSimpleName() + " uses ");
                c2.kick(c1);
            }

            System.out.println(c1.getClass().getSimpleName() + " hp: " + c1.getHp());
            System.out.println(c2.getClass().getSimpleName() + " hp: " + c2.getHp());
        }

        System.out.println("! Game over !");
        if (c1.isAlive()) {
            System.out.println(c1.getClass().getSimpleName() + " won");
        } else {
            System.out.println(c2.getClass().getSimpleName() + " won");
        }
    }

    public static void main(String[] args) {
        GameManager gameManager = new GameManager();
        CharacterFactory characterFactory = new CharacterFactory();
        gameManager.fight(characterFactory.createCharacter(), characterFactory.createCharacter());
    }
}
