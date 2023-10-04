import java.time.LocalDate;

class Solution {
    
    public int solution(int age) {
        int answer = 0;
        
        LocalDate now = LocalDate.now();
		
		int year = now.getYear();
		
        answer = year-age;
        return answer;
    }
}