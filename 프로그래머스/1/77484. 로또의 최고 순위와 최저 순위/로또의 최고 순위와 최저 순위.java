class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int zero = 0;
        int win = 0;
    	
        for(int i=0; i<lottos.length; i++) {
        	if(lottos[i]==0) {
        		zero++;
        	}
        	for(int j=0; j<win_nums.length; j++) {
        		if(lottos[i]==win_nums[j]) {
        			win++;
        		}
        	}
        }
       
        
        int[] answer = new int [2];
        
        answer[0] = ranking(zero+win);
        answer[1] = ranking(win);
        
        return answer;
    }
    
    public int ranking(int count) {
    	switch(count) {
    	case 0 : return 6;
    	case 1 : return 6;
    	case 2 : return 5;
    	case 3 : return 4;
    	case 4 : return 3;
    	case 5 : return 2;
    	case 6 : return 1;
    	default : break;
    	}
    	return -1;
    }

}