package metrimony.config;




import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories(basePackages="metrimony.backend.peristence.repositories")
@EntityScan(basePackages="metrimony.backend.peristence.domain.backend")
@EnableTransactionManagement
public class ApplicationConfig {

}
