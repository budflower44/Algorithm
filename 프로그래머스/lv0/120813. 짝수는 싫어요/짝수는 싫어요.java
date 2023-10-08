import java.util.*;

class Solution {
    public int[] solution(int n) {
    	int[] answer = new int [(int)(Math.ceil((double)n/2))];
    	List<Integer> li = new ArrayList<Integer>();
    	
    	for(int i=1; i<=n; i++) {
    		if(i%2==1) {
    			li.add(i);
    		}
    	}
    	
    	for(int i=0; i<answer.length; i++) {
    		answer[i] = li.get(i).intValue();
    	}
        
        return answer;
    }
}