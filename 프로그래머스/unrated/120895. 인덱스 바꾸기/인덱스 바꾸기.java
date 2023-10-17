class Solution {
    public String solution(String my_string, int num1, int num2) {
        
    	String tmp1 = my_string.substring(num1, num1+1);
    	String tmp2 = my_string.substring(num2, num2+1);
    	
    	String tmp3 = my_string.substring(0, num1);
    	String tmp4 = my_string.substring(num1+1, num2);
    	String tmp5 = my_string.substring(num2+1);
    	
    	String answer = tmp3.concat(tmp2).concat(tmp4).concat(tmp1).concat(tmp5);
        
        return answer;
    }
}