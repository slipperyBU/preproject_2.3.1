package web.service;

import web.models.User;

import java.util.List;

public interface UserService {
    List<User> index();
    void save(User user);
}
