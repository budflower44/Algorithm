class Solution {
    public int solution(int hp) {
        int answer = 0;
        
        
        if(hp%5==3){
            answer = (hp/5)+(int)(Math.ceil((hp%5)/3));
        }else if(hp>=5 && hp%5!=3){
            answer = (int)(Math.ceil(hp/5))+(int)(Math.ceil((hp%5)/3))+(hp%5)%3;
        }else{
            answer = (hp%5)%3;
        }
        
        return answer;
    }
}