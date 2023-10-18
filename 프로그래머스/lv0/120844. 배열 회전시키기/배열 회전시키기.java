class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int [numbers.length];
    	int cnt = 0;
    	
        if(direction.equals("left")) {
        	for(int i=0; i<numbers.length; i++) {
        		if(i!=numbers.length-1) {
        			answer[i] = numbers[i+1];
        			cnt++;
        		}else if(i==numbers.length-1) {
        			answer[answer.length-1] = numbers[0];
        			break;
        		}
        	}
        }else if(direction.equals("right")) {
        	for(int i=0; i<numbers.length; i++) {
        		if(i!=numbers.length-1) {
        			answer[i+1] = numbers[i];        			
        		}else if(i==numbers.length-1){
        			answer[0] = numbers[numbers.length-1];
        			break;
        		}
        	}
        }
        
        return answer;
    }
}