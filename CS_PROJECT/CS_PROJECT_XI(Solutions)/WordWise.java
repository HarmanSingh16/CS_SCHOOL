import java.util.*;
class WordWise{
    String str;
    
    WordWise(){
        str = "";
    }
    
    void readsent(){
        Scanner as = new Scanner(System.in);
        System.out.println("Enter a sentence");
        str = as.nextLine();
    }
    
    int freq_vowel(String w){
        int freq = 0,len = w.length();
        String vow = "aeiou";
        
        for(int i = 0;i<len; i++){
            if(vow.indexOf(w.charAt(i)) != -1)
                freq++;
        }
        return freq;
    }
    
    void arrange(){
        StringTokenizer tknz = new StringTokenizer(str," ,;?!.");
        String token = "";
        System.out.println("Word \t Vowel Frequency");
        while(tknz.hasMoreTokens()){
            token = tknz.nextToken();
            System.out.println(token +"\t"+ freq_vowel(token));
        }
    }
    
    void main(){
        WordWise obj = new WordWise();
        obj.readsent();
        obj.arrange();
    }
}