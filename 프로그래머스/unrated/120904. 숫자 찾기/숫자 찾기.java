class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        
        String str = num+"";
        
        a: for(int i=0; i<str.length(); i++){
            if(str.charAt(i)-48==k){
                answer = i+1;
                break a;
            }else{
            	answer = -1;
            }
        }
        
        
        return answer;
    }
}