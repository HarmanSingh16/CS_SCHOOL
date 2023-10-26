import java.util.*;
class Composite{
    int arr[][],m,n;
    
    Composite(int mm, int nn){
        m = mm;
        n = nn;
        
        arr = new int[m][n];
    }
    
    int isComposite(int p){
        int c = 0;
        for(int i=1; i<=p; i++){
            if(p%i == 0)
                c++;
        }
        return (c==2) ? (0) : (1);
    }
    
    void fill(){
        int elm = m*n;
        int p = 1;
        
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                while(isComposite(p) != 1){
                    p++;
                }
                arr[i][j] = p;
                p++;
            }
        }
    }

    void display(){
        System.out.println("\nThe array is:");
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
    
    static void main(){
        Scanner as = new Scanner(System.in);
        System.out.println("Enter size of array:");
        Composite obj = new Composite(as.nextInt(), as.nextInt());
        obj.fill();
        obj.display();
    }
}