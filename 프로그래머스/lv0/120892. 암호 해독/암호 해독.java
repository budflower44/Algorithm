class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        StringBuilder stringBuilder = new StringBuilder();
        
        for(int i=1; i<=(cipher.length()/code); i++) {
        	answer = stringBuilder.append(cipher.substring(code*i-1, code*i)).toString();        	
        }
        
        
        return answer;
    }
}