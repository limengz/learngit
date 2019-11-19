package runner;
import com.intuit.karate.junit4.Karate;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Karate.class)
//运行1个feature
//@CucumberOptions(features = "classpath:feature/test.feature")
//运行多个feature
 @CucumberOptions(features = {"classpath:feature/test.feature","classpath:feature/testoct.feature"})
//运行features 在classpath:feature路径下的,且tag非@ignore的
//@CucumberOptions(features ="classpath:feature" ,tags = "~@ignore")

public class testrunner {

}
