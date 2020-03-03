package by.patsei.command.commandfactory;

import by.patsei.command.actions.Authentication;
import by.patsei.command.actions.UserAction;
import by.patsei.command.commands.*;

import javax.inject.Inject;


public class CommandFactory {

    static Authentication auth = new Authentication();
    static  UserAction useract = new UserAction();

    public static ICommand create(String command) throws IllegalArgumentException{
        command = command.toUpperCase();
        System.out.println(command + " command");
        CommandType commandEnum = CommandType.lookup(command);
        ICommand resultCommand;
        switch (commandEnum) {
            case DELETE_USER: {
               resultCommand = new DeleteUserCommand();
                ((DeleteUserCommand)resultCommand).setUserAction(useract);
               break;
            }
            case ADD_USER: {
                resultCommand = new AddUserCommand();
                ((AddUserCommand)resultCommand).setUserAction(useract);
                break;
            }
            case LOGIN: {
                resultCommand = new LoginCommand();
                ((LoginCommand)resultCommand).setAuthentication(auth);
                break;
            }
            case LOGOUT: {
                resultCommand = new LogoutCommand();
                ((LogoutCommand)resultCommand).setAuthentication(auth);
                break;
            }
            default: {
                throw new IllegalArgumentException("Invalid command " + commandEnum);
            }
        }
        return resultCommand;
    }
}
