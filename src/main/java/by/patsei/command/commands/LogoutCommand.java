package by.patsei.command.commands;

import by.patsei.command.actions.Authentication;


public class LogoutCommand implements ICommand {

    private Authentication authentication;

    public void setAuthentication(Authentication authentication) {

        this.authentication = authentication;
    }

    @Override
    public void execute() {
     authentication.logout();
    }
}
