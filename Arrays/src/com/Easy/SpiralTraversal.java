package com.Easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SpiralTraversal 
{
	public static List<Integer> spiralOrder(int[][] matrix) 
    {
        List<Integer>al=new ArrayList<>();
        int left=0;
        int top=0;
        int bottom=matrix.length-1;
        int right=matrix[0].length-1;
        while(left<=right && top<=bottom)
        {
            for(int i=left;i<=right;i++)
            {
                al.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++)
            {
                al.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom)
            {
                for(int i=right;i>=left;i--)
                {
                    al.add(matrix[bottom][i]);
                }
            
            bottom--;
            }
            if(left<=right)
            {
                for(int i=bottom;i>=top;i--)
                {
                    al.add(matrix[i][left]);
                }
            
            left++;
            }
        }
        return al;
    }

	public static void main(String[] args) 
	{
Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		int a[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		List<Integer>al=new ArrayList<>();
		al=spiralOrder(a);
		System.out.println(al);
		

	}

}
