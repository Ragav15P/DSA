package com.Easy;

import java.util.Scanner;

public class CountInversions {
    static long count;

    public static void mergeSort(int[] a, int[] temp, int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;
            mergeSort(a, temp, low, mid); 
            mergeSort(a, temp, mid + 1, high); 
            merge(a, temp, low, mid, high); 
        }
    }

    public static void merge(int[] a, int[] temp, int low, int mid, int high) {
        int left = low, right = mid + 1, k = low;

        while (left <= mid && right <= high) {
            if (a[left] <= a[right]) {
                temp[k++] = a[left++];
            } else {
                temp[k++] = a[right++];
                count += (mid - left + 1); 
            }
        }


        while (left <= mid) {
            temp[k++] = a[left++];
        }


        while (right <= high) {
            temp[k++] = a[right++];
        }


        for (int i = low; i <= high; i++) {
            a[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt(); 

        for (int i = 0; i < T; i++) {
            int n = s.nextInt(); 
            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = s.nextInt(); 
            }

            count = 0; 
            int[] temp = new int[n]; 
            mergeSort(a, temp, 0, n - 1); 
            System.out.println(count); 
        }

        s.close();
    }
}