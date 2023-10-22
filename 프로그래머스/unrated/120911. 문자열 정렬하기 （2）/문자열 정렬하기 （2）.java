import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        char[] ch = new char [my_string.length()];
        
        for(int i=0 ; i<ch.length; i++) {
        	ch[i] = my_string.toLowerCase().charAt(i);
        }
        Arrays.sort(ch);
        
        for(int i= 0; i<ch.length; i++) {
        	answer += ch[i];
        }
        
        return answer;
    }
}