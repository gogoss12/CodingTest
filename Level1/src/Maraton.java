import java.util.Arrays;
import java.util.HashMap;

public class Maraton {

	public String solution(String[] participant, String[] completion) {
		// 테스트 통과 but 효율성 전부 불통

		String answer = "";

		boolean v;

		for (int i = 0; i < participant.length; i++) {
			v = true;
			for (int j = 0; j < completion.length; j++) {
				if (participant[i].equals(completion[j])) {
					completion[j] = null;
					v = false;
					break;
				}
			}
			if (v) {
				answer += participant[i];
			}
		}
		return answer;
	}
	
	
	public String solution1(String[] participant, String[] completion) {
		// 테스트 통과 / 유효성 통과
		String answer = "";
		String arr = null;
		
		Arrays.sort(participant);
		Arrays.sort(completion);
		
		for(int i = 0; i < completion.length; i++) {
			if(!completion[i].equals(participant[i])) {
				arr = participant[i];
				break;
			}
		}
		
		if(!arr.equals("")) {
			answer = arr;
		}else {
			answer = participant[participant.length - 1];
		}
		
		return answer;
	}
	
	 public String solution2(String[] participant, String[] completion) {
		 // 가장 깔끔하다고 생각되는 다른사람의 풀의 
		 	// 전부다 들여다보기
	        String answer = "";
	        HashMap<String, Integer> hm = new HashMap<>();
	        for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
	        for (String player : completion) hm.put(player, hm.get(player) - 1);

	        for (String key : hm.keySet()) {
	            if (hm.get(key) != 0){
	                answer = key;
	            }
	        }
	        return answer;
	    }
}
