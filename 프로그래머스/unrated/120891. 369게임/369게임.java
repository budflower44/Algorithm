class Solution {
    public int solution(int order) {
        int answer = 0;
        
        String [] str = Integer.toString(order).split("");    
        for(int i=0; i<str.length; i++) {
        	if(str[i].contains("3")) {
        		answer++;
        	}else if(str[i].contains("6")) {
        		answer++;
        	}else if(str[i].contains("9")) {
        		answer++;
        	}
        }
         
        return answer;
    }
}