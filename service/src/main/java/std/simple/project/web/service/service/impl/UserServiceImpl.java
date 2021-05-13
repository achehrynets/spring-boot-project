package std.simple.project.web.service.service.impl;

import org.springframework.stereotype.Service;
import std.simple.project.web.domain.entity.User;
import std.simple.project.web.repository.UserRepository;
import std.simple.project.web.service.service.UserService;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User save(User user) {
        return this.userRepository.save(user);
    }

    @Override
    public User update(User user) {
        return this.userRepository.save(user);
    }

    @Override
    public User find(String id) {
        return this.userRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("User with " + id + " id does not exist"));
    }

    @Override
    public List<User> findAll() {
        return this.userRepository.findAll();
    }

    @Override
    public String delete(User user) {
        this.userRepository.delete(user);
        return user.getId();
    }

}
