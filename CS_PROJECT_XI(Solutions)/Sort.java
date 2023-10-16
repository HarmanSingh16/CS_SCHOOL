import java.util.*;
class Sort{
    int arr[],len;
    
    void read(int n){
        Scanner as = new Scanner(System.in);
        len = n;
        arr = new int[n];
        
        System.out.println("Enter numbers");
        for(int i = 0; i<n; i++){
            arr[i] = as.nextInt();
        }
    }
    
    void arrange(){
        for(int i = 0;i<len-1; i++){
            int min = i;
            for(int j = i+1; j<len; j++)
                if(arr[j] < arr[min])
                    min = j;
                
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
    
    void display(){
        for(int i = 0; i<len; i++){
            System.out.print(arr[i] + " ,");
        }
    }
    
    void main(){
        Scanner as = new Scanner(System.in);
        Sort obj = new Sort();
        System.out.println("Enter size of array");
        
        obj.read(as.nextInt());
        obj.arrange();
        obj.display();
        
    }
}