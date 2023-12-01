import java.util.*;
class time{
    void words(int h, int m){

        String nums[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty", "twenty one", "twenty two", "twenty three", "twenty four", "twenty five", "twenty six", "twenty seven", "twenty eight", "twenty nine", "thirty"};
        System.out.println("\nTime in words:");
        if(m == 0)
            System.out.println(nums[h] + " O' clock");
        else if(m == 1)
            System.out.println("one minute past " + nums[(h%12)]);
        else if(m == 59)
            System.out.println("one minute to " + nums[(h%12)+1]);
        else if(m == 15)
            System.out.println("quarter past " + nums[h]);
        else if(m==45)
            System.out.println("quarter to " + nums[(h%12) + 1]);
        else if(m == 30)
            System.out.println("half past " + nums[h]);
        else if(m<30)
            System.out.println(nums[m] + " minutes past " + nums[h]);
        else if(m>30)
            System.out.println(nums[m] + " minutes to " + nums[(h%12)+1]);
    }

    void main(){
        Scanner as = new Scanner(System.in);

        System.out.println("\nEnter hours:");
        int hh = as.nextInt();
        System.out.println("Enter minutes:");
        int mm = as.nextInt();

        if(mm >= 0 && mm<= 60 && hh <=12 && hh>=0)
            words(hh,mm);
        else
            System.out.println("Invalid format");
    }
}