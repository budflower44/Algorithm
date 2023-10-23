import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        String str [] = my_string.split("");
        ArrayList<String> al = new ArrayList<>();
        
        for(String a : str){
            if(!al.contains(a)){
                al.add(a);
            }
        }
        
        
        for(int i=0; i<al.size(); i++) {
        	answer += al.get(i);      	
        }
        
        return answer;
    }
}