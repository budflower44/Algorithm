class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int [num_list.length/n][n];
        int cnt = 0;
        int count = 0;
        
        for(int i=0; i<num_list.length/n; i++) {
        	for(int j=1; j<=n; j++) {
        		answer[i][cnt] = num_list[count];
        		cnt++;
                count++;
        		if(cnt==n) {
        			cnt = 0;
        		}
        	}
        }
        
        return answer;
    }
}