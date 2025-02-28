package com.Easy;
import java.util.*;

public class FourSum 
{
    public static List<List<Integer>> fourSum(int a[], int k)
    {
        Arrays.sort(a);
        List<List<Integer>> res = new ArrayList<>();
        
        for (int i = 0; i < a.length; i++)
        {
            if (i > 0 && a[i] == a[i - 1]) continue; // Skip duplicates for 'i'

            for (int j = i + 1; j < a.length; j++)
            {
                if (j > i + 1 && a[j] == a[j - 1]) continue; // Skip duplicates for 'j'

                int k1 = j + 1;
                int l = a.length - 1;

                while (k1 < l)
                {
                    long sum = (long) a[i] + a[j] + a[k1] + a[l]; // Use long to prevent overflow
                    
                    if (sum < k)
                    {
                        k1++;
                    }
                    else if (sum > k)
                    {
                        l--;
                    }
                    else
                    {
                        res.add(Arrays.asList(a[i], a[j], a[k1], a[l]));
                        k1++;
                        l--;

                        while (k1 < l && a[k1] == a[k1 - 1]) k1++; // Skip duplicates for k1
                        while (k1 < l && a[l] == a[l + 1]) l--; // Fix: Use `l - 1`
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }

        int k = s.nextInt();
        List<List<Integer>> res = fourSum(a, k);
        System.out.println(res);
    }
}
