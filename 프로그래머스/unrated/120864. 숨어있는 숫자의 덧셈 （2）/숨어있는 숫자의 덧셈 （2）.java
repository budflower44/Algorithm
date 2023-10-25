class Solution {
    public int solution(String my_string) {
       int answer = 0;
        
       String str = my_string.replaceAll("[^0-9]", "\\!"); 
       String [] arrStr = str.split("\\!");
       
       for(int i=0; i<arrStr.length; i++) {
    	   if(!arrStr[i].isEmpty()) {
    		   answer += Integer.parseInt(arrStr[i]);
    	   }
       }

        return answer;
    }
}