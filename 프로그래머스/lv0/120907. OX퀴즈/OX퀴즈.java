class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String [quiz.length];
        
        for(int i=0; i<quiz.length; i++) {
        	String [] quizarr = quiz[i].split(" ");
        	if(quizarr[1].equals("-")) {
        		if(Integer.parseInt(quizarr[0])-Integer.parseInt(quizarr[2])==Integer.parseInt(quizarr[4])) {
        			answer[i] = "O";
        		}else {
        			answer[i] = "X";
        		}
        	}else if(quizarr[1].equals("+")) {
        		if(Integer.parseInt(quizarr[0])+Integer.parseInt(quizarr[2])==Integer.parseInt(quizarr[4])) {
        			answer[i] = "O";
        		}else {
        			answer[i] = "X";
        		}
        	}
        }
        
        return answer;
    }
}