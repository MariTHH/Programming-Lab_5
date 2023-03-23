package commands.availableCommands;

import collection.PersonCollection;
import commands.Command;

import java.util.Scanner;

/**
 * Command remove_greater {element} : remove all elements from the collection that exceed the specified
 */
public class RemoveGreater extends Command {
    private final PersonCollection personCollection;

    public RemoveGreater(PersonCollection personCollection) {
        this.personCollection = personCollection;
    }

    @Override
    public void execute(String[] args) {
        if (args.length > 1) {
            System.out.println("Вы неправильно ввели команду");
        } else {
            Scanner sc = new Scanner(System.in);
            personCollection.removeGreater(sc);
        }
    }
}
