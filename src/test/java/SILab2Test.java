import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    private List<Item> create(Item... items){
        return new ArrayList<Item>(Arrays.asList(items));
    }

    @Test
    void checkEveryBranch() {
        RuntimeException ex;
        ex=assertThrows(RuntimeException.class, ()-> SILab2.checkCart(null,0));
        assertTrue(ex.getMessage().contains("allItems list can't be null!"));

        assertTrue(SILab2.checkCart(new ArrayList<Item>(), 0));

        assertFalse(SILab2.checkCart(new ArrayList<Item>(), -100));

        ex=assertThrows(RuntimeException.class, ()-> SILab2.checkCart(create(new Item(null,null,299,0.1f)),0));
        assertTrue(ex.getMessage().contains("No barcode!"));

        assertFalse(SILab2.checkCart(create(new Item(null,"01234",5000,0.1f)),0));

        ex=assertThrows(RuntimeException.class, ()-> SILab2.checkCart(create(new Item("testets","0000testes",5000,0.1f)),0));
        assertTrue(ex.getMessage().contains("Invalid character in item barcode!"));

        assertFalse(SILab2.checkCart(create(new Item("teste","01234",299,-0.1f)),0));

    }

    @Test
    void checkMultipleCondition() {

        assertTrue(SILab2.checkCart(create(new Item("teste","0123",5000,0.1f)),10000));

        assertFalse(SILab2.checkCart(create(new Item("testee","12345",5000,0.1f)),2));

        assertFalse(SILab2.checkCart(create(new Item("teset","0123",5000,-1f)),2));

        assertFalse(SILab2.checkCart(create(new Item("teste","12345",299,0.1f)),2));

    }
}
