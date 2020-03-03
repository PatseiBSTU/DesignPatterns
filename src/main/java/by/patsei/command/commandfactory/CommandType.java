package by.patsei.command.commandfactory;

public enum CommandType {
        LOGIN("login"),
        LOGOUT("logout"),
        ADD_USER ("add_user"),
        DELETE_USER("delete_user"),
        NOT_A_COMMAND("error");

        private String command;
        private CommandType(String command) {

            this.command = command;
        }
    public static CommandType lookup(String id) {
        try {
            return CommandType.valueOf(id);
        } catch (IllegalArgumentException e) {
            return CommandType.NOT_A_COMMAND;
        }
    }
    }


