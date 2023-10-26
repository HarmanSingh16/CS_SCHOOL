import java.util.*;
class fascinating_number{
    boolean isFascinating(int n){
        String val = n + "" + (n*2) + "" + (n*3);
        for(char i = 49; i<=57; i++){
            if(val.indexOf(i) != -1)
                if(val.lastIndexOf(i) != val.indexOf(i))
                    return false;
        }
        return true;
    }
    
    void main(){
        Scanner as = new Scanner(System.in);
        System.out.println("Enter a number:");
        int nn = as.nextInt();
        
        String msg = "";
        if(isFascinating(nn))
            msg = "Fascinating number";
        else
            msg = "Not fascinating number";
            
        System.out.println(msg);
    }
}