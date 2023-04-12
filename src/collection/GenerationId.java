package collection;

import java.util.*;

/**
 * A class that creates a unique id for each character
 */
public class GenerationId {

    private static final HashSet<Integer> arg = new HashSet<>();
    private static final Random random = new Random();
    /**
     * generates a unique id greater than zero
     *
     * @return id (int)
     */
    public static int generateID() {
        int id = random.nextInt(Integer.MAX_VALUE);
        while (arg.contains(id)) {
            id = random.nextInt(Integer.MAX_VALUE);
        }
        arg.add(id);
        return id;
    }
}
