import java.util.Arrays;
import java.util.Scanner;
public class VampireNumber {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check it as vampire number??");
        long number = scanner.nextLong();
        if (isVampireNumber(number)) {
            System.out.println(number + " is a vampire number!");
        } else {
            System.out.println(number + " is not a vampire number.");
        }
        scanner.close();
    }
    
    public static boolean isVampireNumber(long number) {
        String numStr = Long.toString(number);
        int length = numStr.length();

        // Check if the number has an even number of digits
        //These lines check if the number has an even number of digits. 
        //If not, it immediately returns false because vampire numbers must have an even number of digits.
        if (length % 2 != 0) {
            return false;
        }

        //These lines convert the string representation of the number to a character array and then sort it. 
        //This sorted array will be used later for comparison.
        char[] numArray = numStr.toCharArray();
        Arrays.sort(numArray);
   
        // This line starts a loop that iterates from 10 up to the square root of the given number. 
        //We begin from 10 because vampire numbers are formed by factors, 
        //and we want to ensure that both factors have at least one digit.
        for (long i = 10; i <= Math.sqrt(number); i++) {
            
            //This line checks if i is a factor of the given number.
             if (number % i == 0) {
                String factor1 = Long.toString(i);
                String factor2 = Long.toString(number / i);
                
                // Skip if factors don't have correct length
                if ((factor1.length() != length / 2) || (factor2.length() != length / 2)) {
                    continue;  
                }

                // Concatenate the factors and Check if the candidate is a permutation of the original number
                String candidate = factor1 + factor2; 
                char[] candidateArray = candidate.toCharArray();
                Arrays.sort(candidateArray);

                //This line checks if the sorted arrays of the original number and the candidate are equal.
                //If they are, it means the candidate is a permutation of the original number,
                //and the method returns true.
                if (Arrays.equals(numArray, candidateArray) && (!factor1.endsWith("0") || !factor2.endsWith("0"))) {
                    return true;
                }
            }
        }
        return false;
    }
}
