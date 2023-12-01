class vampire{
    boolean isPair(int n){
        String s = n + "";
        int l = s.length();
        
        if(l%2 == 0){
            return true;
        }
        else return false;
    }
    
    boolean check0(int m, int n){
        String mm = m + "";
        String nn = n + "";
        
        if(mm.endsWith("0") && nn.endsWith("0")){
            return false;
        }
        else
            return true;
    }
    
    void main(int n){
        String s = n + "";
        int l = s.length();
        int n1F = 0, n2F = 0;
        if(l == 4){
            for(int i = 0; i<l-1; i++){
                String n1 = s.charAt(i) + "" + s.charAt(i+1);
            
                String n2 = s.replace(s.charAt(i) + "","");
                n2 = n2.replace(s.charAt(i+1) + "","");
                
                int nn1 = 0;
                int nn2 = 0;
                int arr[] = new int[2];
                int m = 0, n = 0;
                m = n1.charAt(0);n = n1.charAt(1);
                
                arr = {Integer.valueOf(
                for(int j = 0; j<2; j++){
                    nn1 = permute(n1.charAt(0), n1.charAt(1))[j];
                    for(int k = 0; k<2; k++){
                        nn2 = permute(n2.charAt(0), n2.charAt(1))[k];
                    
                        if(nn1 * nn2 == n && check0(nn1, nn2)){
                            n1F = nn1;
                            n2F = nn2;
                        }
                    }
                }
            }
        
            if(n1F !=0 && n2F !=0 && isPair(n)){
                System.out.println("Vampire number");
            }
            else{
                System.out.println("Not a vampire number");
            }
        }
        else 
            System.out.println("Not a vampire number");
    }
    
    int[] permute(char m, char n){
        int arr[] = new int[2];
        
        int n1 = Integer.valueOf(m + "" + n);
        int n2 = Integer.valueOf(n + "" + m);
        
        arr[0] = n1;
        arr[1] = n2;
        return arr;
    }
}