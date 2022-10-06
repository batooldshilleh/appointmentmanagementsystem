package pak.proj;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features ="feature file",
                 plugin = {"html:target/cucumber/wikipedia.html"},
                 monochrome = true,
                 snippets =SnippetType.CAMELCASE,
                 glue = {"pak.proj"})
public class teat {

}
