import java.util.*;
class multiplication_matrix{
    void main(){
        Scanner as = new Scanner(System.in);
        int a[][] = new int[4][4];
        int b[][] = new int[4][4];
        int m[][] = new int[4][4];
        
        int sum = 0;
        

        System.out.println("Enter values for matrix A:");
        for(int i = 0; i<4; i++){
            System.out.println("Row-" + (i+1) + ":");
            for(int j = 0; j<4; j++)
                a[i][j] = as.nextInt();
        }
        
        System.out.println("\nEnter values for matrix B:");
        for(int i = 0; i<4; i++){
            System.out.println("Row-" + (i+1) + ":");
            for(int j = 0; j<4; j++)
                b[i][j] = as.nextInt();
        }
        
        System.out.println("\nArray A:");
        for(int i = 0; i<4; i++){
            for(int j = 0; j<4; j++)
                System.out.print(a[i][j] + " " );
            System.out.println();
        }
        
        System.out.println("\nArray B:");
        for(int i = 0; i<4; i++){
            for(int j = 0; j<4; j++)
                System.out.print(b[i][j] + " " );
            System.out.println();
        }
        
        
        for(int i = 0; i<4; i++){
            for(int j = 0; j<4; j++){
                sum =0;
                for(int k = 0; k<4; k++){
                    sum += (a[i][k])*(b[k][j]);
                }
                m[i][j] = sum;
            }
        }
        
        System.out.println("\nResulant array:");
        for(int i = 0; i<4; i++){
            for(int j = 0; j<4; j++)
                System.out.print(m[i][j] + " " );
            System.out.println();
        }
    }
}