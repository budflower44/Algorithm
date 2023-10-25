class Solution {
    public int solution(int n) {
        int answer = 0;
        int aw = 1;
        int cnt = 0;
        
        if(n==1) {
        	answer = 1;
        }else {
        	for(int i=1; i<=n; i++) {
        		aw *= i;
        		cnt++;
        		if(aw==n) {
        			answer = cnt;
        			break;
        		}else if(aw>n) {
        			answer = cnt-1;
        			break;
        		}
        	}
        }
        
        return answer;
    }
}