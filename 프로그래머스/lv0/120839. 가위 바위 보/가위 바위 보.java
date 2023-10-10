class Solution {
    public String solution(String rsp) {
        String answer = "";
        
        String [] arr = rsp.split("");
        
        
//        가위는 2 바위는 0 보는 5
        for(int i=0; i<arr.length; i++) {
        	if(arr[i].equals("2")) {
        		answer += "0";
        	}else if(arr[i].equals("0")) {
        		answer += "5";
        	}else if(arr[i].equals("5")) {
        		answer += "2";
        	}
        }
        
        return answer;
    }
}