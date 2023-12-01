import java.util.*;
class ArrayMax{
    int arr[][],m;
    
    ArrayMax(int mm){
        m = mm;
        arr = new int[m][m];
    }
    
    void readarray(){
        Scanner as = new Scanner(System.in);
        System.out.println("Enter numbers:");
        for(int i = 0; i<m; i++)
            for(int j = 0; j<m; j++)
                arr[i][j] = as.nextInt();
    }
    
    void large(){
        int lrg = 0;
        
        for(int i = 0; i<m; i++){
            lrg = arr[i][0];
            for(int j = 0; j<m-1; j++){
                if(lrg < arr[i][j+1])
                    lrg = arr[i][j+1];
            }
            System.out.println("Largest element of row " + (i+1) + " = " + lrg);
        }
    }
    
    void display(){
        System.out.println("\nArray in matrix form:");
        
        for(int i=0; i<m; i++){
            for(int j=0; j<m; j++)
                System.out.print(arr[i][j] + " ");
                
            System.out.println();
            }
        
        
    }
    
    static void main(){
        Scanner as = new Scanner(System.in);
        System.out.println("Enter order of matrix:");
        ArrayMax obj = new ArrayMax(as.nextInt());
        
        obj.readarray();
        obj.large();
        obj.display();
    }
}