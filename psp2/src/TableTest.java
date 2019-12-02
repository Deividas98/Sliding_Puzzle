import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TableTest {
    @Test
    public void isTableHasGiven() throws Exception{

        Table test = Table.getObjectTable();
        //test.setTableSize()

         int[][] actual = {{0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0} };

        Assert.assertArrayEquals(test.getTable(), actual);
    }
}