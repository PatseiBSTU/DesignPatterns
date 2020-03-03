package by.patsei.command;

import by.patsei.cdi.decorator.Logger;
import by.patsei.cdi.simple.Service;
import by.patsei.command.actions.Authentication;
import by.patsei.command.actions.UserAction;
import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

public class Demo {
    public static void main(String[] args) {


        Controller controller = new Controller();
        controller.processRequest("abc");
        controller.processRequest("login");
        controller.processRequest("add_user");
        controller.processRequest("delete_user");
        controller.processRequest("logout");

    }
}
