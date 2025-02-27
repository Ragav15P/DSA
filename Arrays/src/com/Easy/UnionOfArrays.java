package com.Easy;

import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class UnionOfArrays {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }

        int m = s.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = s.nextInt();
        }

        // Sort both arrays
        Arrays.sort(a);
        Arrays.sort(b);

        List<Integer> union = new ArrayList<>();

        int low = 0, high = 0;
        
        // Merge two sorted arrays into union list
        while (low < n && high < m) {
            if (a[low] < b[high]) {
                if (union.isEmpty() || union.get(union.size() - 1) != a[low]) {
                    union.add(a[low]);
                }
                low++;
            } else if (a[low] > b[high]) {
                if (union.isEmpty() || union.get(union.size() - 1) != b[high]) {
                    union.add(b[high]);
                }
                high++;
            } else { // Both are equal
                if (union.isEmpty() || union.get(union.size() - 1) != a[low]) {
                    union.add(a[low]);
                }
                low++;
                high++;
            }
        }

        // Add remaining elements from array `a`
        while (low < n) {
            if (union.isEmpty() || union.get(union.size() - 1) != a[low]) {
                union.add(a[low]);
            }
            low++;
        }

        // Add remaining elements from array `b`
        while (high < m) {
            if (union.isEmpty() || union.get(union.size() - 1) != b[high]) {
                union.add(b[high]);
            }
            high++;
        }

        // Print the union of two arrays
        for (int num : union) {
            System.out.print(num + " ");
        }

        s.close(); // Close Scanner
    }
}
