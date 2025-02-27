package com.Easy;

import java.util.Scanner;

public class RotateArrayByDplaces {

	public static void main(String[] args) 
	{

		Scanner s=new Scanner(System.in);
	       int n=s.nextInt();
	       int d=s.nextInt();
	       int low=0;
	       int high=n-1;
	       int a[]=new int[n];
	       for(int i=0;i<n;i++)
	       {
	    	   a[i]=s.nextInt();
	       }
	      
	       d=d%n;
	       while(low<high)
	       {
	    	   int temp=a[low];
	    	   a[low]=a[high];
	    	   a[high]=temp;
	    	   low++;
	    	   high--;
	       }
	      
	       low=0;
	       high=d-1;
	       while(low<high)
	       {
	    	   int temp=a[low];
	    	   a[low]=a[high];
	    	   a[high]=temp;
	    	   low++;
	    	   high--;
	       }
	       
	       low=d;
	       high=n-1;
	       while(low<high)
	       {
	    	   int temp=a[low];
	    	   a[low]=a[high];
	    	   a[high]=temp;
	    	   low++;
	    	   high--;
	       }
	      
	       for(int ele : a)
	       {
	    	   System.out.print(ele+" ");
	       }
	       
	       
	}

}
