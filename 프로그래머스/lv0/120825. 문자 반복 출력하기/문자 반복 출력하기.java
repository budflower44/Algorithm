import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

class Solution {
    public String solution(String my_string, int n) {
        List<String> li = new ArrayList<String>();
        
        for(int i=0; i<my_string.length(); i++) {
        	for(int j=1; j<=n; j++) {
        		li.add(String.valueOf(my_string.charAt(i)));
        	}    	
        }
        
        String answer = "";
        StringBuilder stringBuilder = new StringBuilder();
        
        for(int i=0; i<li.size(); i++) {
        	stringBuilder.append(li.get(i));        	
        }
        answer = stringBuilder.toString();
        

        return answer;
    }
}