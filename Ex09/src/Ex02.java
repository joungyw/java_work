public class Ex02 {
	class Solution {
	    public static int solution(int[] num_list) {
	        int answer = 0;
	        
	        int a =  num_list[0];
	        int b = num_list[0];
	        
	        
	        for(int i = 1; i < num_list.length; i++) {
	        	a =  a * num_list[i];  	
	        	b  += num_list[i];  	
	        }
	       if(a > b * b)
	        	answer = 0;
	        else
	        answer = 1;
	        
	        return answer;
	    
	    }
	
	    public static void main(String[] args) {
	    	
	    	int[] num_list = {3, 4, 5, 1, 2};
	    	solution(num_list);	    		
	    	
		}
	}

}
