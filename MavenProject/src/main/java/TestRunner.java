import com.beust.jcommander.internal.Lists;
import org.testng.TestNG;

import java.util.List;

public class TestRunner {

    public static void main(String[] args) {
        TestNG testng = new TestNG();
        List<String> s =  Lists.newArrayList();
        s.add("testng.xml");
        testng.setTestSuites(s);
        testng.run();
    }
}
