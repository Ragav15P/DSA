package com.Easy;
import java.util.*;


public class SortArraysOfColors 
{
	public static void sortColors(int[] a)
    {
       int low=0;
       int mid=0;
       int high=a.length-1;
       while(mid<=high)
       {
           if(a[mid]==0)
           {
               int temp=a[low];
               a[low]=a[mid];
               a[mid]=temp;
               low++;
           mid++;
           }
           
          else if(a[mid]==1)
           {
               mid++;
           }
           else
           {
               int temp=a[mid];
               a[mid]=a[high];
               a[high]=temp;
                high--;
           }
          
       }
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
		sortColors(a);
		for(int ele : a)
		{
			System.out.print(ele+" ");
		}
	}

}
