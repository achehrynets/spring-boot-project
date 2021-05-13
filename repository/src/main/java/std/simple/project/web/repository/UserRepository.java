package std.simple.project.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import std.simple.project.web.domain.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

}
