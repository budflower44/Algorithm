import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
		
		//terms : "약관종류 유효기간"
		//privacies : "날짜 약관종류"
		ArrayList<String> termsKinds = new ArrayList<String>();
		ArrayList<String> termsDate = new ArrayList<String>();
		ArrayList<String> privaciesDate = new ArrayList<String>();
		ArrayList<String> privaciesKinds = new ArrayList<String>();
		
		
        for(int i=0; i<terms.length; i++) {
        	termsKinds.add(terms[i].split(" ")[0]);
        	termsDate.add(terms[i].split(" ")[1]);
        }
        
        for(int i=0; i<privacies.length; i++) {
        	privaciesDate.add(privacies[i].split(" ")[0]);
        	privaciesKinds.add(privacies[i].split(" ")[1]);
        }

        ArrayList<Integer> answer_= new ArrayList<Integer>();
        
        for(int i=0; i<privacies.length; i++) {
        	for(int j=0; j<terms.length; j++) {
        		if(privaciesKinds.get(i).equals(termsKinds.get(j))) {
        			if(dateClac(today)-(dateClacMM(termsDate.get(j)))>=dateClac(privaciesDate.get(i))) {
        				answer_.add(i);
        			}
        		}
        	}
        }
        
        
        int [] answer = new int [answer_.size()];	
        for(int i=0; i<answer.length; i++) {
        	answer[i] = answer_.get(i).intValue()+1;
        }
        
        return answer;
    }
    
    public int dateClac(String date){
    	int a = 0;
    	String [] dateArray = date.split("[.]");
    	int yyyy = Integer.parseInt(dateArray[0]);
    	int mm = Integer.parseInt(dateArray[1]);
    	int dd = Integer.parseInt(dateArray[2]);
    	
    	a = (yyyy*12*28)+(mm*28)+dd;

    	return a;
    }
    
    public int dateClacMM(String date) {
    	int a = 0;
    	a = Integer.parseInt(date)*28;
    	
    	return a;
    }
    
}