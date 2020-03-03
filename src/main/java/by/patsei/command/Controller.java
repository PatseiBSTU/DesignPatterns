package by.patsei.command;


import by.patsei.command.commandfactory.CommandFactory;
import by.patsei.command.commands.ICommand;

import java.beans.JavaBean;

@JavaBean
public class Controller {
   public void  processRequest (String command) {
       try{
        ICommand action = CommandFactory.create(command);
           action.execute();
          }
        catch (IllegalArgumentException e) {
            System.out.println(command + " is not a command");
        }

   }
 }
