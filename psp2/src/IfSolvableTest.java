import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class IfSolvableTest {

    @Test
    public void isNotSolvableCorrect() {
        Table test = Table.getObjectTable();

        IfSolvable tester = new IfSolvable();
        int[] generatedArray = {3,14,13,2,9,11,0,7,1,4,10,8,15,6,12,5};
        NumberGeneration.convertArrayTo2dArray(test, generatedArray);

        assertFalse("Not Solvable",IfSolvable.isSolvable(test));
    }

   /* @Test
    public void isInvCountCorrect() {
        Table test1 = Table.getObjectTable();

        //IfSolvable tester = new IfSolvable();
        //int[] generatedArray1 = {6,8,15,14,13,9,2,3,7,11,12,1,10,0,5,4};
        int[] generatedArray1 = {3,14,13,2,9,11,0,7,1,4,10,8,15,6,12,5};
        NumberGeneration.convertArrayTo2dArray(test1, generatedArray1);
        assertEquals(31,IfSolvable.getInvCount(test1));
    }*/
}