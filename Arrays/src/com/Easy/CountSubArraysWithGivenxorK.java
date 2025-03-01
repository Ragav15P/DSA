package com.Easy;

import java.util.HashMap;
import java.util.Map;

public class CountSubArraysWithGivenxorK {

    public static int countSubarraysWithXorK(int[] A, int K) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // Initialize map with XOR = 0 having 1 occurrence
        int xor = 0;

        for (int i = 0; i < A.length; i++) {
            xor ^= A[i];  // Compute prefix XOR
            int left = xor ^ K; // Find the required prefix XOR

            // If this prefix XOR exists, it contributes to valid subarrays
            if (map.containsKey(left)) {
                count += map.get(left);
            }

            // Store the prefix XOR in the map
            map.put(xor, map.getOrDefault(xor, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] A = {4, 2, 2, 6, 4};
        int K = 6;
        
        System.out.println("Count of subarrays with XOR " + K + ": " + countSubarraysWithXorK(A, K));
    }
}
