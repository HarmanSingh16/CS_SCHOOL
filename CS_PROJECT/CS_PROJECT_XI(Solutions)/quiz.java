import java.util.*;
class quiz{
    void main(){
        Scanner as = new Scanner(System.in);
        char ansKey[] = new char[5];

        System.out.println("Enter numer of participants:");
        int N = as.nextInt();
        
        char ptAns[][] = new char[N][5];

        System.out.println("\nEnter answer key:");
        for(int i = 0; i<5; i++){
            System.out.println("Answer-" + (i+1));
            ansKey[i] = as.next().charAt(0);
        }

        System.out.println("\nEnter answer of participants");
        for(int i = 0; i<N; i++){
            System.out.println("Participant-" + (i+1) + ":");
            for(int j = 0; j<5; j++)
                ptAns[i][j] = as.next().charAt(0);
        }
        
        int max_indx,sum,temp;
        max_indx = sum = temp = 0;
        for(int i = 0; i<N; i++){
            sum = 0;
            for(int j = 0; j<5; j++)
                if(ansKey[j] == ptAns[i][j])
                    sum += 1;
            
            System.out.println("Participant-" + (i+1) + " = " + sum);
            if(sum > temp){
                max_indx = i;
                temp = sum;
            }
        }
        System.out.println("Highest Score: Particpant-" + (max_indx+1));  
    }
}
