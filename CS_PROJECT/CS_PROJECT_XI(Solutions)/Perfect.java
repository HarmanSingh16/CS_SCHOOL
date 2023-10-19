import java.util.*;
class Perfect{
    int num;
    
    Perfect(int nn){
        num = nn;
    }
    
    int sum =0;
    int f = 1;
    int sum_of_factors(int i){
        if(i%f == 0)
            sum = sum + f;
        f++;
        if(f<i)
            sum_of_factors(i);
        return sum;
    }
    
    void check(){
        String msg = (num == sum_of_factors(num)) ? "Perfect number" : "Not a perfect number";
        System.out.println(msg);
    }
    
    static void main(){
        Scanner as = new Scanner(System.in);
        System.out.println("Enter a number:");
        
        Perfect obj = new Perfect(as.nextInt());
        obj.check();
    }
}