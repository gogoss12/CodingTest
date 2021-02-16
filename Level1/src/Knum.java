import java.util.Arrays;

public class Knum {

  public int[] solution(int[] array, int[][] commands) {
	  
        int[] answer = new int[commands.length];
        int index = 0;
        
        for(int i = 0; i < commands.length; i++) {
        	int start = commands[i][0];
        	int end = commands[i][1];
        	int r = commands[i][2];
        	
        	int[] temp = new int[end - start +1];
        	
        	int count = 0;
        	
        	for(int j = start -1; j < end; j++ ) 
        		temp[count++] = array[j];
        		
        		Arrays.sort(temp);
        		answer[index++] = temp[r-1];
        }
        return answer;
    }
}
