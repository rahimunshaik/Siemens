Questions:---https://www.interviewbit.com/problems/climbing-stairs/
  Problem Description
 
 

Given an integer array A of length N. Where Ai is the cost of stepping on the ith stair.
From ith stair, you can go to i+1th or i+2th numbered stair.
Initially, you are at 1st stair find the minimum cost to reach Nth stair.


  

public class Solution {
    public int solve(int[] A) {
        int n=A.length;
        int first=A[0];
        int second=first+A[1];
        for(int i=2;i<n;i++)
        {
            int steps=Math.min(first,second)+A[i];
            first=second;
            second=steps;
            
        }
        return second;
    }
}
