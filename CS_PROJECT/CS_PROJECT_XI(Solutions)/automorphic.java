import java.util.*;
class automorphic{
    void main(){
        Scanner as = new Scanner(System.in);
        
        System.out.println("Enter a number:");
        int n = as.nextInt();
        
        String s = n + "";
        String sq = (int)Math.pow(n,2) + "";
        String msg = sq.endsWith(s) ? "Automorphic" : "Not automorphic";
        System.out.println(msg);
    }
}