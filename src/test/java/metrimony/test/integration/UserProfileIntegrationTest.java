package metrimony.test.integration;

import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import metrimony.MetrimonyApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MetrimonyApplication.class)
public class UserProfileIntegrationTest extends AbstractIntegrationTest {

}
