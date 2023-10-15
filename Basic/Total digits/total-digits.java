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
            long n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.totalDigits(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    static long totalDigits(long n){
        // code here
        int v=0;
        for(int i=0;i<=n;i++){
            int num=i;
        while(num>0){
            v++;
            num=num/10;
        }
        }
        return v;
    }
}