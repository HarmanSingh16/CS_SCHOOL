import java.util.*;
class PrimePalinGen{
    int start,end;
    
    PrimePalinGen(int a, int b){
        start = a;
        end = b;
    }
    
    int isPrime(int i){
        int c = 0;
        
        for(int j = 1; j<=i; j++)
            if(i%j == 0)
                c++;
    
        return (c==2) ? 1:0;
    }
    
    int isPalin(int i){
        int temp = i;
        int num = 0;
        while(temp !=0){
            num = num*10 + temp%10;
            temp/=10;
        }
        
        return (num == i) ? 1:0;
    }
    
    void generate(){
        System.out.println("Prime Palindrome numbers are:");
        for(int i = start; i<end; i++){
            if(isPrime(i)*isPalin(i) == 1)
                System.out.print(i + ",");
        }
    }
    
    static void main(){
        Scanner as  = new Scanner(System.in);
        System.out.println("Enter the range");
        PrimePalinGen obj = new PrimePalinGen(as.nextInt(),as.nextInt());
        
        obj.generate();
    }
}