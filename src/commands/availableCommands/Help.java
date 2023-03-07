package commands.availableCommands;

import collection.PersonCollection;
import commands.Command;

/**
 * help : print help for available commands
 */
public class Help extends Command {
    @Override
    public void execute(String[] args) {
        if (args.length > 1) {
            System.out.println("Вы неправильно ввели команду");
        } else {
            PersonCollection.help();
        }
    }
}
