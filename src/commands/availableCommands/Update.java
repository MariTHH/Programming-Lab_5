package commands.availableCommands;

import client.ClientManager;
import collection.PersonCollection;
import commands.Command;

import java.util.Scanner;

/**
 * Command update id {element} : update the value of the collection item whose id is equal to the given one
 */
public class Update extends Command {

    @Override
    public void execute(String[] args) {
        if (args.length != 2) {
            System.out.println("Вы неправильно ввели команду");
        } else {
            Scanner sc = new Scanner(System.in);
            update(args[1], sc);
        }
    }

    public void update(String arg, Scanner sc) {
        try {
            int ID = Integer.parseInt(arg);
            if (PersonCollection.existID(ID)) {
                PersonCollection.updateElement(ClientManager.getNewPerson(sc), ID);
                System.out.println("ID человека обновлено");
            } else {
                System.out.println("Человека с таким ID не существует");
            }
        } catch (NumberFormatException e) {
            System.out.println("ID введен неверно");
        }
    }
}

