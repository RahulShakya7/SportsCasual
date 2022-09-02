
import org.junit.*;

/**
 *
 * @author ASUS
 */



import controller.EquipmentsDB;

public class EquipmentsTesting {

    EquipmentsDB es ;

    @Before
    public void init(){
        es = new EquipmentsDB();
    }

    @Test
    public void addEqui(){
        int price = 1500000000;
        int qty = 50;
        int result = es.insertIntoEquipmentsDB("Tesla","Tesla model 3",price,qty,"very good product","");

        int expectedresult =1;

        Assert.assertEquals(expectedresult, result);



    }

    @Test
    public void addEqui1(){
        int price = 1500000000;
        int qty = 50;
        int result = es.insertIntoEquipmentsDB("Tesla","Tesla model 3",price,qty,"very good product","");

        int expectedresult =1;

        Assert.assertEquals(expectedresult, result);

    }

    @After
    public void destroyInit(){
        es = null;
    }

    
}