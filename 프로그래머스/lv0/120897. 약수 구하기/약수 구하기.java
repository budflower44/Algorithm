import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> al = new ArrayList<>();
        int cnt=0;
        
        for(int j=1; j<=n; j++){
            if(n%j==0){
                al.add(j);
                cnt++;
            }
        }
        
        int[] answer = new int [cnt];
        
        for(int i=0; i<cnt; i++) {
        	answer[i] = al.get(i);
        }
        
        Arrays.sort(answer);
         
        return answer;
    }
}