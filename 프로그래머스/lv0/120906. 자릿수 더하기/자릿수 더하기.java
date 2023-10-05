class Solution {
    public int solution(int n) {
        int answer = 0;
		
		String a = String.valueOf(n);
		String [] str = new String [a.length()];
		
		str = a.split("");
		
		for(int i=0; i<a.length(); i++) {
			answer += Integer.parseInt(str[i]);
		}
        
        
        return answer;
    }
}