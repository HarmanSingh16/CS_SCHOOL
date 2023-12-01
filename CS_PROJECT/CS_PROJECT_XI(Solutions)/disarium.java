import java.util.*;
class disarium{
    void main(){
        Scanner as = new Scanner(System.in);
        
        System.out.println("Enter a number:");
        int n = as.nextInt();
        String s = n + "";
        
        int len = s.length();
        int fnl = 0;
        
        for(int i = 0; i<len; i++){
            int a = Integer.parseInt(String.valueOf(s.charAt(i)));
            fnl = fnl + (int)Math.pow(a,i+1);
        }
        
        if(fnl == n){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}