import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        
        String [] str1 = before.split("");
        String [] str2 = after.split("");
        int cnt=0;
        
        Arrays.sort(str1);
        Arrays.sort(str2);
        
        for(int i=0; i<str1.length; i++) {
        	if(str1[i].equals(str2[i])) {
        		cnt++;
        		if(str1.length==cnt) {
        			answer = 1;
        		}else {
        			answer = 0;
        		}
        	}
        }
        
        return answer;
    }
}