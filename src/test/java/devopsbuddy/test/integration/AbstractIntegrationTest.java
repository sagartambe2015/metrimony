package devopsbuddy.test.integration;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ch.qos.logback.core.net.SyslogOutputStream;
import devopsbuddy.DeviosbuddyApplication;
import devopsbuddy.backend.peristence.domain.backend.Plan;
import devopsbuddy.backend.peristence.domain.backend.Role;
import devopsbuddy.backend.peristence.domain.backend.User;
import devopsbuddy.backend.peristence.domain.backend.UserRole;
import devopsbuddy.backend.peristence.repositories.PlanRepository;
import devopsbuddy.backend.peristence.repositories.RoleRepository;
import devopsbuddy.backend.peristence.repositories.UserRepository;
import devopsbuddy.enums.PlansEnum;
import devopsbuddy.enums.RolesEnum;
import devopsbuddy.utils.UserUtils;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DeviosbuddyApplication.class)
public class AbstractIntegrationTest {
	@Autowired
    protected PlanRepository planRepository;

    @Autowired
    protected RoleRepository roleRepository;

    @Autowired
    protected UserRepository userRepository;
    
    @Before
    public void init() {
        Assert.assertNotNull(planRepository);
        Assert.assertNotNull(roleRepository);
        Assert.assertNotNull(userRepository);
    }
    
    @Test
    public void createPlan() {
    	Plan plan = new Plan(PlansEnum.BASIC);
    	Assert.assertNotNull(plan);
        
    }

    @Test
    public void createRole() {
    	Role role = new Role(RolesEnum.ADMIN);
    	Assert.assertNotNull(role);
    }
    
   @Test
    public void createUser() {
	   String username="sagar";
	   String email="tambe.sagar@gmail.com";
	   Plan plan = new Plan(PlansEnum.BASIC);
        planRepository.save(plan);

        User basicUser = UserUtils.createBasicUser(username, email);
        basicUser.setPlan(plan);

        Role role = new Role(RolesEnum.ADMIN);
        roleRepository.save(role);

        Set<UserRole> userRoles = new HashSet();
        UserRole userRole = new UserRole(basicUser, role);
        userRoles.add(userRole);

        basicUser.getUserRoles().addAll(userRoles);
        basicUser = userRepository.save(basicUser);
        
        Iterable<User> users = userRepository.findAll();
        System.out.println("Users = "+users.spliterator().estimateSize());
        Assert.assertNotNull(users);
    }
   
   @Test
   public void deleteAllUser() {
	   userRepository.deleteAll();
   }
    
    /*protected User createUser(TestName testName) {
        return createUser(testName.getMethodName(), testName.getMethodName() + "@devopsbuddy.com");
    }*/
    
}
