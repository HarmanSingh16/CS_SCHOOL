import java.util.*;
class unique{
    void main(){
        Scanner as = new Scanner(System.in);
        
        System.out.println("Enter a number:");
        int n = as.nextInt();
        
        int c = 0;
        int flag = 0;
        
        for(int i = 9; i>=0; i--){
            c =0;
            int nn = n;
            
            while(nn!=0){
                int d =nn%10;
                if(d == i)
                    c++;
                nn /= 10;
            }
            
            if(c>1){
                flag =1;
                break;
            }
        }
        
        if(flag == 1)
            System.out.println("Not unique number");
        else 
            System.out.println("Unique number");
    }
}