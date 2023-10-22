class Solution {
    public int solution(int n) {
    	int slice = 6;
    	
    	for(int i=1; ; i++) {
    		if((i*slice)%n==0) {
    			return i;
    		}
    	}
    }
}