class Solution {
    public int[] solution(String s) {
        int zero = 0;
        int count = 0;
        
        while(!s.equals("1")) {
        	int cnt = s.length();
        	String tmp = s.replace("0", "");
        	zero += cnt-tmp.length();
        	s = Integer.toBinaryString(tmp.length());
        	count++;
        }
        
        int[] answer = new int [2];
        
        answer[1] = zero;
        answer[0] = count;
        
        
        return answer;
    }
}