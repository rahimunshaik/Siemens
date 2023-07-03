Problem Description
 
 

Given a string A, consisting of comma-separated positive integers.
Extract the given integers from the string and return an integer array consisting of the integers present in the string.

Note: All given integers will fit in a 32-bit signed integer.

  

public class Solution {
    public int[] solve(String A) {
        String[] number=A.split(",");
        int[] result=new int[number.length];
        
        for(int i=0;i<number.length;i++)
        {
            result[i]=Integer.parseInt(number[i].trim());
        }
        return result;
    }
    
}
