import java.util.*;
class DateOfSubmission
{
    static int month[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
    boolean isValid(int dd, int mm, int yy)
    {
        if(yy>999 && yy <10000)
        {
            if(yy%4 == 0 && yy%100 !=0 || yy%400 == 0)
                month[2] = 29;

            if(mm > 0 && mm <=12)
                if(dd>0 && dd<= month[mm])
                    return true;
        }
        return false;
    }

    int dateToNum(int dd, int mm)
    {
        int num = 0;
        for(int i = 0; i<=mm-1; i++){
            num += month[i];
        }
        num += dd;
        return num;
    }

    int[] numToDate(int n)
    {
        int sum = 0;
        int i;
        for( i = 1; i<=12; ++i)
        {
            if(sum < n - 28)
                sum += month[i];
            else   
                break;
        }
        int date[] = {(n-sum), (i)};
        return date;
    }

    public static void main(String args[])
    {
        Scanner as = new Scanner(System.in);
        System.out.println("Enter date in format dd/mm/yyyy");
        int dd = as.nextInt();
        int mm = as.nextInt();
        int yy = as.nextInt();

        DateOfSubmission obj = new DateOfSubmission();

        if(!obj.isValid(dd,mm,yy))
        {
            System.out.println("Invalid input");
        }
        else{
            System.out.println("Date of submission: " + dd + "/" + mm + "/" + yy);
            int n = obj.dateToNum(dd,mm) - 70;
            if(n < 0)
            {
                yy = yy-1;
                if(month[2] == 29)
                    n = 366 - Math.abs(n);
                else
                    n = 365 - Math.abs(n);
            }
            int date[] = obj.numToDate(n);
            dd = date[0];
            mm = date[1];

            System.out.println("Date give:" + dd + "/" + mm + "/" + yy);
         }
        }
}
