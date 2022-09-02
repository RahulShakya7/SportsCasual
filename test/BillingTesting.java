import org.junit.*;

import controller.BillingDB;


public class BillingTesting {
    BillingDB es ;
    @Before

    public void init(){

        es = new BillingDB();

    }



    @Test

    public void addEqui(){

        int price = 150;


        int result = es.insertIntoBillingDB("soniya", price, "sdf");



        int expectedresult = 1;



        Assert.assertEquals(expectedresult, result);





    }
    
    @Test

    public void addEqui2(){

        int price = 150;


        int result = es.insertIntoBillingDB("fgd", price, "kkk");



        int expectedresult = 0;



        Assert.assertEquals(expectedresult, result);





    }



    @Test

    public void addEqui1(){

        int price = 1500;


        int result = es.insertIntoBillingDB("ds",price,"dfdf");



        int expectedresult =1;



        Assert.assertEquals(expectedresult, result);



    }



    @After

    public void destroyInit(){

        es = null;

    }



   

}

    
