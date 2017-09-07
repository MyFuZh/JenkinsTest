import junit.framework.TestCase;  
  
public class HelloWorldTest extends TestCase {  
    public void testSay(){  
        HelloWorld hi = new HelloWorld();  
        assertEquals("Hello,World!", hi.Say());  
    }  
}  