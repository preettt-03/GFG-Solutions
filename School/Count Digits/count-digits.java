//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.evenlyDivides(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Solution{
    static int evenlyDivides(int N){
        // code here
        // if(N==0){
        //     return 0;
        // }
        // int c=0;
        // int p=N;
        // while(N!=0){
        //     int a=N%10;
        //     if(p%a==0 && a!=0){
        //         c++;
        //     }
        //     N=N/10;
        // }
        // return c;
        
        int m=N,ct=0;
        while(N>0){
            int d=N%10;
            if(d!=0&&m%d==0){  //in case d==0 then runtime error occurs so we use d!=0.
                ct++;
            }
            N/=10;
        }
        return ct;
    }
}