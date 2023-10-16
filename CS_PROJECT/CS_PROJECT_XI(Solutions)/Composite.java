import java.util.*;
class Composite{
    int arr[][],m,n;
    
    Composite(int mm, int nn){
        m = mm;
        n = nn;
        
        arr = new int[m][n];
    }
    
    int isComposite(int p){
        int c = 0;
        for(int i=0; i<p; i++){
            if(p%i == 0)
                c++;
        }
        return (c>2) ? (1) : (0);
    }
    
    void fill(){
        int elm = m*n;
        
        for(int i = 0; i<4; i++){
            for(int j = 0; j<4; j++)
                
        }
    }
}