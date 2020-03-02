package by.patsei.command.service;



import by.patsei.command.exception.ServiceException;
import by.patsei.factory.model.User;

import java.util.Optional;

public class UserService {

    public Optional<User> login(String login, byte[] password) throws ServiceException {

            throw new ServiceException("Not implemented");

    }


    public Integer save(User user) throws ServiceException {

            throw new ServiceException("Not implemented");

    }
}
