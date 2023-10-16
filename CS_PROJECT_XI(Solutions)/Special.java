import java.util.*;
class Special{
    int n;
    
    Special(){
        n = 0;
    }
    
    void read(){
        Scanner as = new Scanner(System.in);
        System.out.println("Enter a number:");
        n = as.nextInt();
    }
    
    int factorial(int x){
        int f = 1;
        for(int i=1; i<=x; i++)
            f*=i;
        
        return f;
    }
    
    boolean isSpecial(){
        int temp = n;
        int sumF = 0;
        
        while(temp!=0){
            sumF = sumF + factorial(temp%10);
            temp/=10;
        }
        
        return (n == sumF) ? (true):(false);
    }
    
    void display(){
        String msg = (isSpecial()) ? "Special Number" : "Not Special number";
        System.out.println(msg);
    }
    
    void main(){
        Special obj = new Special();
        
        obj.read();
        obj.display();
    }
}