package be.pxl.ja.oefening75;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LargeListTest {

    @Test
    void sumLargest() {
        List<List<Integer>> lists = Arrays.asList(
                Arrays.asList(1, 7, 5, 3),
                Arrays.asList(20,7,16),
                Arrays.asList(6, 9)
        );
        assertEquals(36, LargeList.sumLargest(lists));
    }
}