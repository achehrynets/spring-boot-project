package std.simple.project.web.service.service;

import std.simple.project.web.domain.entity.User;

import java.util.List;

public interface UserService {

    User find(String id);
    User save(User user);
    List<User> findAll();
    User update(User user);
    String delete(User user);

}
