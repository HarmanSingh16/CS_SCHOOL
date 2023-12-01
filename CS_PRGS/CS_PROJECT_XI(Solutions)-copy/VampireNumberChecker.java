import java.util.Arrays;

public class VampireNumberChecker {

    public static void main(String[] args) {
        long number = 102510;
        if (isVampireNumber(number)) {
            System.out.println(number + " is a vampire number!");
        } else {
            System.out.println(number + " is not a vampire number.");
        }
    }

    public static boolean isVampireNumber(long number) {
        String numStr = Long.toString(number);
        int length = numStr.length();

        if (length % 2 != 0) {
            return false;
        }

        char[] numArray = numStr.toCharArray();
        Arrays.sort(numArray);

        for (long i = 10; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                String factor1 = Long.toString(i);
                String factor2 = Long.toString(number / i);

                // Concatenate the factors
                String candidate = factor1 + factor2;

                char[] candidateArray = candidate.toCharArray();
                Arrays.sort(candidateArray);
                
                if (Arrays.equals(numArray, candidateArray)) {
                    return true;
                }
            }
        }
        return false;
    }
}