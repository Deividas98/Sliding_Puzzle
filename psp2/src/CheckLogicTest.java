import org.junit.Test;

import static org.junit.Assert.*;

public class CheckLogicTest {

    @Test
    public void isSorted() {
        Table test = Table.getObjectTable();
        int[] generatedArray = {1,5,9,13,2,6,10,14,3,7,11,15,4,8,12,0};
        NumberGeneration.convertArrayTo2dArray(test, generatedArray);
        assertTrue(CheckLogic.sorted(test));
    }
}