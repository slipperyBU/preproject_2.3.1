package web.dao;

import org.springframework.stereotype.Component;
import web.models.User;

import java.util.List;

public interface UserDAO {
    List<User> index();

    void save(User user);

    User show(int id);

    void update(int id, User updatedUser);

    void delete(int id);
}
