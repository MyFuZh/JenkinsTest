import junit.framework.Assert;
import junit.framework.TestCase;  
  
public class CalculatorTest extends TestCase {  
    /** *//** 
     * ��Junit3.8�У����Է�����������ԭ�� 
     * 1)public 
     * 2)void  
     * 3)�޷������� 
     * 4������Ҫ�ķ������Ʊ�����test��ͷ 
     */  
    private Calculator cal;  
      
    //��ִ��ÿ��test֮ǰ����ִ��setUp��  
    public void setUp(){  
         cal = new Calculator();  
    }  

      
    //��ִ��ÿ��test֮�󣬶�Ҫִ��tearDown  
    public void tearDown(){  
    }  
    
    public void testAdd()  
    {  
        Calculator cal = new Calculator();  
        int result = cal.add(1, 2);  
        //����assert  
        Assert.assertEquals(3, result);  
    }   
      
    public void testMinus()  
    {  
        Calculator cal = new Calculator();  
        int result = cal.minus(5, 2);  
        Assert.assertEquals(3, result);  
    }  
     
    public void testMultiply()  
    {  
        Calculator cal = new Calculator();  
        int result = cal.multiply(4, 2);  
        Assert.assertEquals(8,result);  
    }  
      
    public void testDivide()  
    {  
        Calculator cal = new Calculator();  
        int result = 0;  
        try {  
            result = cal.divide(10,5);  
        } catch (Exception e) {  
            e.printStackTrace();  
            //��������result = cal.divide(10,5);����ִ�У�������뵽catch��˵��ʧ�ܣ�  
            //�������Ǽ���fail��  
            Assert.fail();//�������û��ִ�С�˵���ⲿ����ȷ��  
        }  
        Assert.assertEquals(2,result);  
    }  
     
    		  
    public void testDivide2()  
    {  
        Throwable tx = null;   
        try   
        {  
            // Calculator cal = new Calculator();  
            cal.divide(10,0);  
            //��������cal.divide(10,0);v�Ѿ��׳��쳣��֮��Ĵ��벻�ᱻִ�С�  
            //����Ҳ�����������ġ�����˵��������Assert.fail();ִ���ˡ�  
            //�ҵĵĲ��Ծ�ʧ���ˡ�  
            Assert.fail();//��ִ�е��������ʧ�ܣ�����Ĵ��뽫����ִ�С�  
        } catch (Exception e) {  
            tx = e;  
        }   
        Assert.assertNotNull(tx);      //����tx��Ϊ�ա�Ҳ����˵�϶����쳣��  
        Assert.assertEquals(Exception.class,tx.getClass());//����tx������ΪException����  
        Assert.assertEquals("��������Ϊ��", tx.getMessage());  
    }  
}  