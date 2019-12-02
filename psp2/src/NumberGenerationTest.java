import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberGenerationTest {
    @Test
    public void isGeneratedNotInOrder() {
        Table test = Table.getObjectTable();
        int [] result = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        Assert.assertNotEquals(result, NumberGeneration.generateRandomNumberIntoArray(test));
    }
}