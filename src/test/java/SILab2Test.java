import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {
    private List<Integer> createList(Integer... elems) {
        return new ArrayList<>(Arrays.asList(elems));
    }

    @Test
    public void multipleConditionsTest() {
        List<Time> times = new ArrayList<>(){};
        Time time = new Time(25, 20, 5);
        times.add(time);
        RuntimeException ex;
        ex= assertThrows(RuntimeException.class, () -> SILab2.function(times));
        assertTrue(ex.getMessage().contains("The hours are grater than the maximum"));

    }

    @Test
    public void everyBranchTest(){
        List<Time> times = new ArrayList<>();
        Time time = new Time(20, 12, 8);
        times.add(time);
        List<Integer> expectedResults = new ArrayList<>();
        expectedResults.add(72728);
        assertEquals(expectedResults, SILab2.function(times));
    }
}