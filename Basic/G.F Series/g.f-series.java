//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
			
            Solution ob = new Solution();
            ob.gfSeries(N);
            
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static void gfSeries(int N){
        // code here
        long a=0;
        long b=1;
        System.out.print(a+" "+b+" ");
        rCall(N-2,a,b);
    }
    static void rCall(int N,long a,long b){
        if(N==0){
            System.out.println();
            return;
        }
        long c=(a*a)-b;
        System.out.print(c+" ");
        rCall(N-1,b,c);
    }
}