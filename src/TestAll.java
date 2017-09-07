import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.textui.TestRunner;  
  
public class TestAll extends TestCase {  
    public static Test suite()  
    {  
        TestSuite suite = new TestSuite();  
        suite.addTestSuite(CalculatorTest.class); //加入你所想测试的测试类  
        suite.addTestSuite(HelloWorldTest.class); //加入你所想测试的测试类   
        return suite;  
    }  
    public static void main(String[] args){  
    TestRunner.run(suite());  
    }  
  
}  