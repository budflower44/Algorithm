class Solution {
    public int solution(int[] numbers) {
        int answer = 45;
        int an1 = 0;
        
        for(int i=0; i<numbers.length; i++){
        	answer -= numbers[i];
        }
        
        return answer;
    }
}