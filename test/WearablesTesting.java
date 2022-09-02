
import org.junit.*;


import controller.WearablesDB;


public class WearablesTesting {
    WearablesDB es ;
    @Before

    public void init(){

        es = new WearablesDB();

    }



    @Test

    public void addEqui(){

        int price = 150;
        int qty= 50;

        int result = es.insertIntoWearablesDB("Mustang","Supramodel 4",price,qty,"better product","");



        int expectedresult =1;



        Assert.assertEquals(expectedresult, result);





    }



    @Test

    public void addEqui1(){

        int price = 1500000000;
        int qty = 50;


        int result = es.insertIntoWearablesDB("Mustang","Supramodel 4",price,qty,"better product","");


        int expectedresult =1;

        Assert.assertEquals(expectedresult, result);



    }



    @After

    public void destroyInit(){

        es = null;

    }



   

}