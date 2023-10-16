//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String s = br.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.is_valid(s);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


class Solution
{
    public int is_valid(String s)
    {
        // code here
        int a=s.length();
        
        if(a==12 && s.startsWith("91")){
        
        if(s.charAt(2)=='7'||s.charAt(2)=='8'||s.charAt(2)=='9'){
            return 1;
        }
        }else  if(a==11 && s.startsWith("0")){
      
        if(s.charAt(1)=='7'||s.charAt(1)=='8'||s.charAt(1)=='9'){
            return 1;
        }
        } else if(a==10){
        if(s.charAt(0)=='7'||s.charAt(0)=='8'||s.charAt(0)=='9'){
            return 1;
        }
        }
        
        return 0;
    }
}