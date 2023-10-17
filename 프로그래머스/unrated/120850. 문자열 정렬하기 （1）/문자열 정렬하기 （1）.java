import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        
        ArrayList<Integer> al = new ArrayList<>();
    	int cnt=0;
        for(int i=0; i<my_string.length(); i++) {
        	char tmp = my_string.charAt(i);
        	if(tmp>=48 && tmp<=57) {
        		cnt++;
        		al.add((int)(tmp)-'0');
        	}
        	
        }
        
        int[] answer = new int [cnt];
        
        int[] arr1 = new int[al.size()];
        for (int i = 0 ; i < al.size() ; i++) {
        answer[i] = al.get(i).intValue();
        }
        Arrays.sort(answer);
        
        return answer;
    }
}