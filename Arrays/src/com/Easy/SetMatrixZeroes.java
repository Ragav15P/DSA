package com.Easy;

import java.util.Scanner;

public class SetMatrixZeroes 
{
	public static void setZeroes(int[][] matrix) 
    {
        int rows=matrix.length;
        int cols=matrix[0].length;
        boolean temp[][]=new boolean[rows][cols];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(matrix[i][j]==0)
                {
                    temp[i][j]=true;
                }
            }
        } 
        for(int i=0;i<temp.length;i++)
        {
            for(int j=0;j<temp[0].length;j++)
            {
                if(temp[i][j])
                {
                    for(int c=0;c<cols;c++)
                    {
                        matrix[i][c]=0;
                    }
                    for(int r=0;r<rows;r++)
                    {
                        matrix[r][j]=0;
                    }
                }
            }
        }
     }
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int m=s.nextInt();
		int n=s.nextInt();
		int a[][]=new int[m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		setZeroes(a);
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
