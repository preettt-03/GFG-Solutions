//{ Driver Code Starts
import java.util.*;

class GFG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Solution ob = new Solution();

        int T = sc.nextInt();

        while (T != 0) {
            long n = sc.nextLong();
            if (ob.fascinating(n))
                System.out.println("Fascinating");
            else
                System.out.println("Not Fascinating");
            T--;
        }
    }
}
// } Driver Code Ends


class Solution {
    boolean fascinating(long n) {
        // code here
        // char c[]={'1','2','3','4','5','6','7','8','9'};
        String result=n+""+(n*2)+""+(n*3);
        // char[] ch = new char[s.length()];
        
        //  for (int i = 0; i < str.length(); i++) {
        //     ch[i] = str.charAt(i);
        // }
        // if()
        // return false;
        
        if(result.length() == 9){
            for(int i = 1; i<=9; i++){
                if(!result.contains(String.valueOf(i)))
                    return false;
            }
            return true;
        }
        return false;
    }
}