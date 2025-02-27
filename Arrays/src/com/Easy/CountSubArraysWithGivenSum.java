package com.Easy;
import java.util.*;

public class CountSubArraysWithGivenSum 
{
	
	public static  int subarraySum(int[] nums, int k) {
        Map<Integer,Integer>map=new HashMap<>();
        int n=nums.length;
        int count=0;
        int sum=0;
        map.put(0,1);
        for(int i=0;i<nums.length;i++)
        {
             sum+=nums[i];
           // if(sum==k)
            //{
               // count++;
           // }
            int rem=sum-k;
            if(map.containsKey(rem))
            {
                count+=map.get(sum-k);
            }
            // if (!map.containsKey(sum)) {
                //map.put(sum, i);
           // }
           map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
        
    }

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		int k=s.nextInt();
		int res=subarraySum(a,k);
		System.out.println(res);
		

	}

}
