class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        String sk = Integer.toString(k);
        
        for(int a=i; a<=j; a++) {
        	String str = Integer.toString(a);
        	String [] arrStr = str.split("");
        	for(int b=0; b<arrStr.length; b++) {
        		if(arrStr[b].contains(sk)) {
        			answer++;
        		}		
        	}
        }

        return answer;
    }
}