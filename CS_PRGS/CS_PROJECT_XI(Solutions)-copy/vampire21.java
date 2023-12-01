class vampire21{
    void main(int n){
        int f1 = 0, f2 = 0;
        outer:
        for(int i = 1; i<= (int)Math.sqrt(n); i++){
            inner1:
            for(int j = (int)Math.sqrt(n) + 1; j<=100; j++){
                if(i*j == n && (i%10 == 0 || j%10 == 0)){
                    String check = i + "" + j;
                    String checker = n + "";
                    inner2:
                    for(int k = 0; k<4; k++){
                       if(checker.indexOf(check.charAt(k)) == -1){
                            continue outer;
                    }
                    }
                    System.out.println("Fangs are: " + i + " & " + j);
                    f1 = i; f2 = j;
                }
            }
        }
        
        if(f1 != 0 && f2 != 0){
            System.out.println("Vampire number");
        }
        else{
            System.out.println("Not a vampire number");
        }
    }
}