import java.util.ArrayList;

public class Knum {

  public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        ArrayList<Integer> a = new ArrayList<>(); 
        
        for(int i = 0; i < array.length; i++) {
        	a.add(array[i]); 
        }
        
        for(int i = 0; i < commands.length; i++) {
        	for(int j = 0; j < commands[i].length; j++) {
        		ArrayList<Integer> list = new ArrayList<Integer>(a.subList(commands[i][0], commands[i][1]));
        		list.sort(null);
        		list.get(commands[i][2]);
        	}
        }
        return answer;
    }
}
