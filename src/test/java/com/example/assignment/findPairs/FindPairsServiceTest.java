package com.example.assignment.findPairs;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

@SpringBootTest
public class FindPairsServiceTest {

    @Autowired
    private FindPairsService findPairsService;

    @Test
    public void testFindPairs_basicCase() {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;

        Pairs result = findPairsService.findPairs(numbers, target);

        List<int[]> pairs = result.pairs();
        assertEquals(1, pairs.size());
        assertArrayEquals(new int[]{0, 1}, pairs.get(0));
    }

    @Test
    public void testFindPairs_noPairs() {
        int[] numbers = {1, 2, 3, 4};
        int target = 10;

        Pairs result = findPairsService.findPairs(numbers, target);

        List<int[]> pairs = result.pairs();
        assertTrue(pairs.isEmpty());
    }

    @Test
    public void testFindPairs_emptyArray() {
        int[] numbers = {};
        int target = 5;

        Pairs result = findPairsService.findPairs(numbers, target);

        List<int[]> pairs = result.pairs();
        assertTrue(pairs.isEmpty());
    }

    @Test
    public void testFindPairs_withDuplicates() {
        int[] numbers = {3, 3, 4, 4};
        int target = 6;

        Pairs result = findPairsService.findPairs(numbers, target);

        List<int[]> pairs = result.pairs();
        assertEquals(1, pairs.size());
        assertArrayEquals(new int[]{0, 1}, pairs.get(0));
    }
}
