package commands.availableCommands;

import commands.Command;

/**
 * exit : terminate the program (without saving to a file)
 */
public class Exit extends Command {
    @Override
    public void execute(String[] args){
        if (args.length>1){
            System.out.println("Вы неправильно ввели команду");
        } else {
            System.out.println("Удачи");
            System.exit(0);

        }
    }
}
