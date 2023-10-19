import java.util.*;
class Rotate{
    int a[][],b[][],r,c;
    
    Rotate(int x, int y){
        r=x;
        c=y;
        a = new int[r][c];
        b = new int[r][c];
    }
    
    public void fillArray(){
        Scanner as = new Scanner(System.in);
        for(int i =0; i<r; i++)
            for(int j=0; j<c; j++)
                a[i][j] = as.nextInt();
        
        System.out.println("Array in matrix form");
        for(int i =0; i<r; i++){
            for(int j=0; j<c; j++)
                System.out.print(a[i][j]);
            System.out.println();
        }
    }
    
    public void rotate90DegClock(){
        for(int i = 0; i<r; i++){
            for(int j = 0; j<c; j++)
                b[i][j] = a[j][3-i];
        }
        
        //Printing the array
        for(int i = 0; i<c; i++){
            for(int j=0; j<r; j++)
                System.out.print(b[i][j] + " ");
            System.out.println();
        }
    }
    
    public void rotate90DegAntiClock(){
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                b[i][j] = a[3-j][i];
            }
        }
        
        //Printing the array
        for(int i = 0; i<c; i++){
            for(int j=0; j<r; j++)
                System.out.print(b[i][j] + " ");
            System.out.println();
        }
    }
    
    void dsplayOriginalArray(){
        
    }
}
