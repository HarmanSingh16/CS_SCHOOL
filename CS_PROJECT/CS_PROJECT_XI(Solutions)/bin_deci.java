import java.util.*;
class bin_deci{
    void main(){
        Scanner as = new Scanner(System.in);
        
        System.out.println("Enter array element (1's and 0's):");
        int a[][] = new int[4][4];
        for(int i = 0; i<4; i++)
            for(int j=0; j<4; j++)
                a[i][j] = as.nextInt();
        
        System.out.println("Original array:");
        for(int i = 0; i<4; i++){
            for(int j = 0; j<4; j++)
                System.out.print(a[i][j] + " ");
            System.out.println();
        }
        
        System.out.println("\nDecimal to Binary:");
        int cnvC=0, cnvR=0;
        for(int i =0; i<4; i++){
            for(int j =0; j<4; j++){
                cnvC = cnvC + (int)Math.pow(2,3-j)*a[j][i];
                cnvR = cnvR + (int)Math.pow(2,3-j)*a[i][j];
            }
            System.out.println("Row - " + (i + 1) + " = " + cnvR);
            System.out.println("Column - " + (i+1) + " = " + cnvC);
            
            cnvR = cnvC = 0;
        }
    }
}