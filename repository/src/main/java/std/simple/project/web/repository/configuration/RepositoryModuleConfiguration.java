package std.simple.project.web.repository.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@Import({HibernateConfig.class})
@EnableJpaRepositories(basePackages = "std.simple.project.web.repository")
public class RepositoryModuleConfiguration {

}
