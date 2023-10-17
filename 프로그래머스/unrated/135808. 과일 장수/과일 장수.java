import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        int[] score2 = new int [score.length];
        Arrays.sort(score);
        
        for(int i=0; i<score.length; i++){
            score2[i] = score[score.length-i-1];
        }
        int index = 1;
        int a = score2.length;
        while(a >=m){
            answer += m*score2[(m*index)-1];
            a -= m;
            index++;
        }
        
        
        return answer;
    }
}