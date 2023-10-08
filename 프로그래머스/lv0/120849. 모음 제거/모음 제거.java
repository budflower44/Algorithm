import java.util.ArrayList;
import java.util.List;

class Solution {
    public String solution(String my_string) {
        String[] al = my_string.split("");
        List<String> li = new ArrayList<String>();
        StringBuilder stringBuilder = new StringBuilder();
        
        for(int i=0; i<al.length; i++) {
        	if(al[i].equals("a")) {
        		al[i] = null;
        	}else if(al[i].equals("e")) {
        		al[i] = null;
        	}else if(al[i].equals("i")) {
        		al[i] = null;
        	}else if(al[i].equals("o")) {
        		al[i] = null;
        	}else if(al[i].equals("u")) {
        		al[i] = null;
        	}else {
        		li.add(al[i]);
        	}
        }
        
        String answer = "";
        
        for(int i=0; i<li.size(); i++) {
        	stringBuilder.append(li.get(i));        	
        }
        answer = stringBuilder.toString();
        
        
        return answer;
    }
}