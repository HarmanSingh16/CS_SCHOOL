import java.util.*;
class Perfect{
    int num;
    
    Perfect(int nn){
        num = nn;
    }
    
    
    int sum_of_factors(int i, int j){
        if(j<i){
            if(i%j == 0)
                return j + sum_of_factors(i, ++j);
            else if(i%j !=0){
                return 0 + sum_of_factors(i,++j);
            }
        }
        return 0;
    }
    
    void check(){
        String msg = (num == sum_of_factors(num,1)) ? "Perfect number" : "Not a perfect number";
        System.out.println(msg);
    }
    
    static void main(){
        Scanner as = new Scanner(System.in);
        System.out.println("Enter a number:");
        
        Perfect obj = new Perfect(as.nextInt());
        obj.check();
    }
}