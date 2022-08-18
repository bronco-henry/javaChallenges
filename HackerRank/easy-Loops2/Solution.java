import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            solve();
        }
            
    public static void solve(){
        Scanner input = new Scanner(System.in);
        int q = input.nextInt();   
        for(int i=0;i<q;i++){
            int a = input.nextInt();
            int b = input.nextInt();
            int n = input.nextInt();
            System.out.println(makeOutput(a, b, n));
            }
        }
            
    public static String makeOutput(int a, int b, int n){
        StringBuilder output = new StringBuilder();
        for(int i=0;i<n;i++){
            int x = a + seriesRecursive(b, i);
            output.append(x + " ");
        }
        return output.toString();
    }       
    public static int seriesRecursive(int b, int n){
        if(n == 0){
            return b;
            }
        else{
            int x = (b * powerInt(2, n));
            return( x + seriesRecursive(b, n-1));
        }
    }
    
    public static int powerInt(int a, int b){
        int x = 1;
        for(int i=0;i<b;i++){
            x *= a;
        }
        return x;
    }    

        
}
