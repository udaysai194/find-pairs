package com.example.assignment.findPairs;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class FindPairsService {
    public Pairs findPairs(int[] numbers, int target) {
        List<int[]> pairs = new ArrayList<>();
        HashMap<Integer, Integer> seenNumbers = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            int currentNumber = numbers[i];
            int complement = target - currentNumber;

            if (seenNumbers.containsKey(complement)) {
                pairs.add(new int[]{seenNumbers.get(complement), i});
            }

            seenNumbers.put(currentNumber, i);
        }

        return new Pairs(pairs);
    }
}
