import java.util.*;
class sqr_matrix{
    void main(){
        Scanner as = new Scanner(System.in);
        int arr[][] = new int[4][4];
        
        System.out.println("Enter numbers:");
        for(int i=0; i<4; i++)
            for(int j = 0; j<4; j++)
                arr[i][j] = as.nextInt();
                
        System.out.println("\nArray in matrix form:");
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
        
        System.out.print("Sum of diagnol elements:");
        int sum = 0;
        for(int i=0; i<4; i++)
            sum = sum + arr[i][i];
        System.out.println(" = " + sum);
        
        System.out.println("Upper diagnol elements:");
        for(int i=0; i<4; i++){
            for(int j=i+1; j<4; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
        
        System.out.println("Lower diagnol elements:");
        for(int i=1; i<4; i++){
            for(int j=0; j<i; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
        
        System.out.println("Sum of elements row-wise:");
        int sumR = 0;
        for(int i = 0; i<4; i++){
            sumR=0;
            for(int j=0; j<4; j++)
                sumR = sumR + arr[i][j];
            System.out.println("Sum of row-" + (i+1) + " = " + sumR);
        }
        
        System.out.println("Sum of elements column-wise:");
        int sumC=0;
        for(int i=0; i<4; i++){
            sumC=0;
            for(int j=0; j<4; j++){
                sumC = sumC + arr[j][i];
            }
            System.out.println("Sum of column-" + (i+1) + " = " + sumC);
        }
    }
}