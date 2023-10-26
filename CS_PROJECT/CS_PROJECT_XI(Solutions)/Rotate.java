import java.util.*;
class Rotate{
    int a[][],bClock[][],bAntiClock[][],r,c;
    
    Rotate(int x, int y){
        r=x;
        c=y;
        a = new int[r][c];
        bClock = new int[r][c];
        bAntiClock = new int [r][c];
    }
    
    public void fillArray(){
        Scanner as = new Scanner(System.in);
        for(int i =0; i<r; i++)
            for(int j=0; j<c; j++)
                a[i][j] = as.nextInt();
    }
    
    public void rotate90DegClock(){
        for(int i = 0; i<r; i++){
            for(int j = 0; j<c; j++)
                bClock[i][j] = a[r-j-1][i];
        }
    }
    
    public void rotate90DegAntiClock(){
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                bAntiClock[i][j] = a[j][c-i-1];
            }
        }
    }
    
    void displayOriginalArray(){
        System.out.println("\nArray in matrix form");
        for(int i =0; i<r; i++){
            for(int j=0; j<c; j++)
                System.out.print(a[i][j] + " ");
            System.out.println();
        }
    }
    
    void displayRotatedArray(){
        System.out.println("\nArray rotated 90 degree clockwise:");
        rotate90DegClock();
        //Printing the array
        for(int i = 0; i<c; i++){
            for(int j=0; j<r; j++)
                System.out.print(bClock[i][j] + " ");
            System.out.println();
        }
        
        System.out.println("\nArray rotated 90 degree anti-clockwise:");
        rotate90DegAntiClock();
        //Printing the array
        for(int i = 0; i<c; i++){
            for(int j=0; j<r; j++)
                System.out.print(bAntiClock[i][j] + " ");
            System.out.println();
        }
    }
    
    static void main(){
        Scanner as = new Scanner(System.in);
        System.out.println("Enter size of array");
        int rr = as.nextInt();
        int cc = as.nextInt();
        
        if(rr == cc){
            Rotate obj = new Rotate(rr, cc);
                   
            System.out.println("\nEnter array elements:");
            obj.fillArray();
        
            obj.displayOriginalArray();
            obj.displayRotatedArray();
        }
        else{
            System.out.println("Not possible");
        }
 
    }
}
