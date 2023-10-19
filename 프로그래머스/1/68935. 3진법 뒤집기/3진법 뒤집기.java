import java.util.*;

class Solution {
    public int solution(int n) {
        ArrayList<Integer> al = new ArrayList<>();
    	
    	int num = 0;
    	while(n>0) {
            al.add(n%3);
    		n/=3;
    	}

    	int answer = 0;
        int a = al.size();
    	
    	for(int tmp : al) {
    		answer+=(int)(Math.pow(3, a-1))*tmp;
            a--;
    	}
    	
    	
        
        return answer;
    }
}