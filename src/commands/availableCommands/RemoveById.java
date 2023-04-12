package commands.availableCommands;

import collection.PersonCollection;
import commands.Command;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Command remove_by_id id : remove an item from the collection by its id
 */
public class RemoveById extends Command {
    private static PersonCollection personCollection;

    public RemoveById(PersonCollection personCollection) {
        this.personCollection = personCollection;
    }

    public static void remove_by_id(String arg) {
        try {
            int ID = Integer.parseInt(arg);
            if (personCollection.existID(ID)) {
                personCollection.removePerson(ID);
                System.out.println("Персонаж удален");
            } else {
                System.out.println("Этого персонажа не существует");
            }
        } catch (NumberFormatException e) {
            System.out.println("Вы неправильно ввели ID");
        }
    }

    public static void remove_by_idForScript() {
        try {
            Scanner sc = new Scanner(System.in);
            String a = sc.nextLine();
            int ID = Integer.parseInt(a);
            if (personCollection.existID(ID)) {
                personCollection.removePerson(ID);
                System.out.println("Персонаж удален");
            } else {
                System.out.println("Этого персонажа не существует");
            }
        } catch (NumberFormatException e) {
            System.out.println("Вы неправильно ввели ID");
        }
    }

    @Override
    public void execute(String[] args) {
        if (ExecuteScript.getFlag()) {
            RemoveById.remove_by_idForScript();
        } else if (args.length != 2) {
            System.out.println("Вы неправильно ввели команду");
        } else {
            RemoveById.remove_by_id(args[1]);
        }
    }

}

