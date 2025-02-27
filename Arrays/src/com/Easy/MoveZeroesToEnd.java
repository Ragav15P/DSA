package com.Easy;

import java.util.Scanner;

public class MoveZeroesToEnd {

	public static void main(String[] args) 
	{
		
		Scanner s=new Scanner(System.in);
	       int n=s.nextInt();
	       int j=0;
	       int a[]=new int[n];
	       for(int i=0;i<n;i++)
	       {
	    	   a[i]=s.nextInt();
	       }
	       for(int i=0;i<n;i++)
	       {
	    	   if(a[i]==0)
	    	   {
	    		   j=i;
	    		   break;
	    	   }
	       }
	       for(int i=j+1;i<n;i++)
	       {
	    	   if(a[i]!=0)
	    	   {
	    		   int temp=a[i];
	    		   a[i]=a[j];
	    		   a[j]=temp;
	    		   j++;
	    	   }
	       }
	       for(int ele : a)
	       {
	    	   System.out.print(ele+" ");
	       }
	}

}
