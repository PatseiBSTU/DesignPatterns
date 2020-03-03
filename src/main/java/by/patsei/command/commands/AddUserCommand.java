package by.patsei.command.commands;

import by.patsei.command.actions.UserAction;

import javax.inject.Inject;
import java.beans.JavaBean;

public class AddUserCommand implements ICommand {

   private UserAction userAction;

    public void setUserAction(UserAction userAction) {
        this.userAction = userAction;
    }

    @Override
    public void execute() {
        userAction.addUser();
    }
}
