import java.util.*;
class Counter{
    char guest[];
    int noe,count;
    
    public void acceptGuestList(){
        Scanner as = new Scanner(System.in);
        System.out.println("Enter number of guests:");
        noe = as.nextInt();
        guest = new char[noe];
        
        System.out.println("Enter guest list:");
        System.out.println(" 'l' = lady \n 'g' = gentleman \n 'c' = child \n");
        
        for(int i=0; i<noe; i++){
            System.out.print("Guest - " + (i + 1) + ": ");
            guest[i] = as.next().charAt(0);
        }
    }
    
    private void incCount(){
        count++;
    }
    private int giveCount(){
        return count;
    }
    
    void displayCount(){
        for(int i = 0; i<noe; i++)
            if(guest[i] == 'l')
                incCount();
        System.out.println("\nNumber of ladies:" + "\n" + giveCount());
        count = 0;
        
        for(int i = 0; i<noe; i++)
            if(guest[i] == 'g')
                incCount();
        System.out.println("\nNumber of gentleman:" + "\n" + giveCount());
        count = 0;
        
        for(int i = 0; i<noe; i++)
            if(guest[i] == 'c')
                incCount();
        System.out.println("\nNumber of children:" + "\n" + giveCount());
        count = 0;
    }
    
    void main(){
        Counter obj = new Counter();
        obj.acceptGuestList();
        obj.displayCount();
    }
}