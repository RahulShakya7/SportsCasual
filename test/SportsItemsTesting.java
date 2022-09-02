
import controller.SportsItemsDB;

import org.junit.*;


/**
 *
 * @author ASUS
 */


import controller.SportsItemsDB;


public class SportsItemsTesting {
    SportsItemsDB es;
    @Before

    public void init(){

        es = new SportsItemsDB();

    }
    @Test

    public void addEqui(){

        int price = 1500000000;
        int qty = 50;
        int result =es.insertIntoSportsItemsDB("Toyota","Supramodel 3",price,qty,"very good product","");
        int expectedresult =1;



        Assert.assertEquals(expectedresult, result);



    }
    @Test
    public void addEqui1(){
        int price = 1500000000;
        int qty = 50;
        int result =es.insertIntoSportsItemsDB("Tesla","Tesla model 3",price,qty,"very good product","");

        int expectedresult =1;

        Assert.assertEquals(expectedresult, result);

    }

    @After

    public void destroyInit(){

        es = null;

    }



   

}
    
