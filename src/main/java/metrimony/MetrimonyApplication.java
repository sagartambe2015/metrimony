package metrimony;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import metrimony.backend.service.PlanService;
import metrimony.backend.service.UserService;

/**
 * 
 * @author sagart
 *
 */
@SpringBootApplication
public class MetrimonyApplication implements CommandLineRunner {

	/** The application logger */
	private static final Logger LOG = LoggerFactory.getLogger(MetrimonyApplication.class);

	@Autowired
	private UserService userService;

	@Autowired
	private PlanService planService;

	@Value("${webmaster.username}")
	private String webmasterUsername;

	@Value("${webmaster.password}")
	private String webmasterPassword;

	@Value("${webmaster.email}")
	private String webmasterEmail;

	public static void main(String[] args) {

		SpringApplication.run(MetrimonyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		LOG.info("Creating Basic and Pro plans in the database... ");

		/*
		 * userService.cleanAllUsersAndRoles(); planService.cleanAllPlan();
		 * planService.createPlan(PlansEnum.BASIC.getId());
		 * planService.createPlan(PlansEnum.PRO.getId());
		 * 
		 * User user = UserUtils.createBasicUser(webmasterUsername, webmasterEmail);
		 * user.setPassword(webmasterPassword); Set<UserRole> userRoles = new
		 * HashSet<>(); userRoles.add(new UserRole(user, new Role(RolesEnum.ADMIN)));
		 * LOG.debug("Creating user with username {}", user.getUsername());
		 * userService.createUser(user, PlansEnum.PRO, userRoles);
		 * LOG.info("User {} created", user.getUsername());
		 */
	}
}
