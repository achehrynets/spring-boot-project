package std.simple.project.web.repository;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import std.simple.project.web.domain.entity.User;
import std.simple.project.web.repository.configuration.RepositoryModuleConfiguration;

import java.util.List;

@DataJpaTest
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = RepositoryModuleConfiguration.class)
class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    void test() {
        User user = new User();
        user.setName("test");
        this.userRepository.save(user);
        List<User> list = this.userRepository.findAll();
        Assert.assertFalse(list.isEmpty());
        Assert.assertEquals(user.getName(), list.get(0).getName());
    }

}