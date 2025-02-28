package com.Easy;
import java.util.*;

public class ThreeSum 
{
	public static List<List<Integer>> threeSum(int a[])
	{
		Arrays.sort(a);
		List<List<Integer>>res=new ArrayList<>();
		for(int i=0;i<a.length;i++)
		{
			if(i>0 && a[i]==a[i-1])
			{
				continue;
			}
			int j=i+1;
			int k=a.length-1;
			while(j<k)
			{
				int sum=a[i]+a[j]+a[k];
				if(sum<0)
				{
					j++;
				}
				else if(sum>0)
				{
					j--;
				}
				else if(sum==0)
				{
					List<Integer>sub=new ArrayList<>();
					sub.add(a[i]);
					sub.add(a[j]);
					sub.add(a[k]);
					res.add(sub);
					j++;
					k--;
					while(j<k && a[j]==a[j-1])
						j++;
					while(j<k && a[k]==a[k+1])
						k--;
				}
			}
		}
		return res;
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
		List<List<Integer>>res=threeSum(a);
		System.out.println(res);
	}

}
