import java.util.* ;

class Solution {
    public int[] solution(int n, int[] numlist) {
        int cnt = 0;
    	
    	for(int i=0; i<numlist.length; i++) {
    		if(numlist[i]%n==0){
                cnt++;
    		}
    	}
    	
    	int[] answer = new int [cnt];
        
        List<Integer> li = new ArrayList<Integer>();
        int cnt1 = 0;
        
        for(int i=0; i<numlist.length; i++){
            if(numlist[i]%n==0){
                li.add(cnt1, numlist[i]);
                cnt1++;
            }
        }
        
        for(int i= 0; i<cnt; i++) {
        	answer[i] = li.get(i);
        }
        
        return answer;
    }
}