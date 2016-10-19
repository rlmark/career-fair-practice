import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

public class InterviewPracticeSpec {

    @Test
    public void testSorter() {
        Integer[] testArray = {1,9,3};

        Integer[] expectedResult = {1,3,9};

        Sorters sorterThing = new Sorters();
        Comparable[] result = sorterThing.happySort(testArray);

        assertTrue(Arrays.equals(result, expectedResult));
    }

    @Test
    public void testRandomPredicateFalse() {
        Integer[] testInteger = {2,16,10,22,13,25};
        Integer maxDiffBtValues = 3;
        Integer maxDiffBtIndices = 1;

        Boolean expectedValue = false;

        Question2 q2 = new Question2();
        Boolean result = q2.randomPredicate(testInteger, maxDiffBtValues, maxDiffBtIndices);

        assertTrue(result == expectedValue);
    }

    @Test
    public void testRandomPredicateTrue() {
        Integer[] testInteger = {2,16,10,22,13,25};
        Integer maxDiffBtValues = 3;
        Integer maxDiffBtIndices = 2;

        Boolean expectedValue = true;

        Question2 q2 = new Question2();
        Boolean result = q2.randomPredicate(testInteger, maxDiffBtValues, maxDiffBtIndices);

        assertTrue(result == expectedValue);
    }

}
