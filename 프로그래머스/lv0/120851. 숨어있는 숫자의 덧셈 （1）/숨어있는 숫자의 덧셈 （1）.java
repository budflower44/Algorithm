class Solution {
    public int solution(String my_string) {
        int answer = 0;
        int sum = 0;
        
        for(int i=0; i<my_string.length(); i++) {
        	if(49<=my_string.charAt(i) && 57>=my_string.charAt(i)) {
        		answer += Integer.parseInt(String.valueOf(my_string.charAt(i)));

        	}
        	
        }
        
        return answer;
    }
}