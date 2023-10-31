class Solution {
    public int solution(int n) {
        int answer = 0;
        
        a: for(int i=1; ; i++){
            if(n%i==1){
                answer = i;
                break a;
            }
        }
        
        
        return answer;
    }
}