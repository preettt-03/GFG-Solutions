//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.nthFibonacci(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

//User function Template for Java
class Solution {
    static int nthFibonacci(int n){
        // code here
        if(n==0) return 0;
        if(n==1) return 1;
        
         int a = 1; 
         int b = 1;
         int mod=1000000007;
        for (int i = 3; i <= n; i++) {
            int next = (a + b)%mod;
            a = b;
            b = next;
        }
        return b;
    }
}