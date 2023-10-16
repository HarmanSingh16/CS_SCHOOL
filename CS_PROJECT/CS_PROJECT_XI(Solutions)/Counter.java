import java.util.*;
class Counter{
    char guest[];
    int noe,count;
    
    public void accepGuestList(){
        Scanner as = new Scanner(System.in);
        System.out.println("Enter number of guests:");
        noe = as.nextInt();
        
        System.out.println("Enter guest list:");
        System.out.println(" \n 'l' = lady \n 'g' = gentleman \n 'c' = child ");
        
        for(int i=0; i<noe; i++)
            guest[i] = as.next().charAt(0);
    }
    
    
}