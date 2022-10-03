package lotr;

import lombok.SneakyThrows;
import org.reflections.Reflections;

import java.lang.reflect.Modifier;
import java.util.Random;
import java.util.Set;

public class CharacterFactory {
//    - methods: Character createCharacter() {
//        returns random instance of any existing character
//    }

    Reflections reflections = new Reflections("lotr");
    Set<Class<? extends Character>> subTypes;
    private final static Random randGen = new Random();

    public CharacterFactory() {
        subTypes = reflections.getSubTypesOf(Character.class);
        // remove classes abstract
        subTypes.removeIf(subType -> Modifier.isAbstract(subType.getModifiers()));
    }

    @SneakyThrows
    public Character createCharacter() {
        int random = randGen.nextInt(subTypes.size());

        if (subTypes.size() == 0) {
            throw new Exception("No subclasses of Character found");
        }

        return subTypes.stream().skip(random).findFirst().get().getDeclaredConstructor().newInstance();
    }
}
