//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        while(t-- > 0){
            String S = sc.nextLine();
            Solution ob = new Solution();
            List<String> ans = ob.splitString(S);
            for (String val: ans) 
                if(val == "")
                    System.out.println(-1); 
                else    
                    System.out.println(val); 
        }
    } 
} 


// } Driver Code Ends


//User function Template for Java

class Solution 
{ 
    static List<String> splitString(String S) 
    { 
        // code here 
        ArrayList<String> a=new ArrayList<>();
        String alp="";
        String num="";
        String sym="";
        
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)>='A'&&S.charAt(i)<='Z'||S.charAt(i)>='a'&&S.charAt(i)<='z'){
                alp+=S.charAt(i);
            }else if(S.charAt(i)>='0'&&S.charAt(i)<='9'){
                num+=S.charAt(i);
            }else{
                sym+=S.charAt(i);
            }
        }
        a.add(alp);
        a.add(num);
        a.add(sym);
        return a;
    }
} 
