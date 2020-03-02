package by.patsei.command.authorithation;

import by.patsei.command.Command;
import by.patsei.command.CommandResult;
import by.patsei.command.exception.ServiceException;
import by.patsei.command.session.SessionAttribute;
import by.patsei.command.util.pages.Page;
import by.patsei.factory.exception.IncorrectDataException;
import org.apache.log4j.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SingOutCommand implements Command {

    private static final Logger LOGGER = Logger.getLogger(SingOutCommand.class.getName());

    @Override
    public CommandResult execute(HttpServletRequest request, HttpServletResponse response) throws ServiceException, IncorrectDataException {
            HttpSession session = request.getSession();
            String username  = (String)session.getAttribute(SessionAttribute.NAME);
            LOGGER.info("user was above: name:" + username);
            session.removeAttribute(SessionAttribute.NAME);
            return new CommandResult(Page.LOGIN_PAGE.getPage(), false);
        }
}
