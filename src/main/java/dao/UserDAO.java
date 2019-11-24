package dao;

import model.User;

public interface  UserDAO {
    User getUserByCredentials(String userId, String password);

}
