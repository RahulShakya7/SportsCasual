import database.DbConnection;
import org.junit.*;


public class DbConnectionTesting {
    DbConnection es ;
    
    @Before
    public void init(){
        es= new DbConnection();
    }
    @Test
    public void checklogin(){
        boolean result =es.signer("rahul","rahul");
      
        
        boolean expectedResult=true;
        Assert.assertEquals(expectedResult,result);
        
    }
    
    @Test 
    public void checklogin1(){
        boolean result =es.signer("rahul","admin");
      
        
        boolean expectedResult=true;
        Assert.assertEquals(expectedResult,result);
        
    }
    @After

    public void destroyInit(){

        es = null;

    }
    

}
