class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        int max = Math.max(sides[0], (Math.max(sides[1], sides[2])));
        int min = Math.min(sides[0], (Math.min(sides[1], sides[2])));
        int middle = 0;
        
        middle = (sides[0]+sides[1]+sides[2])-max-min;
        
        if(max < (min+middle)) {
        	answer = 1;
        }else if(max > (min+middle)) {
        	answer = 2;
        }else if(max == (min+middle)) {
            answer = 2;
        }
        
        return answer;
    }
}