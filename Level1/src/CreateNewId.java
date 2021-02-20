import java.util.ArrayList;

public class CreateNewId {
	/*
	 * 	아이디의 길이는 3자 이상 15자 이하여야 합니다.
			아이디는 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.) 문자만 사용할 수 있습니다.
			단, 마침표(.)는 처음과 끝에 사용할 수 없으며 또한 연속으로 사용할 수 없습니다.
			
				1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
				2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
				3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
				4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
				5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
				6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
     			만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
				7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
	 */
	
	public String solution(String new_id) {
        String answer = "";
        ArrayList<String> list = new ArrayList<String>();
        String end = ".";
        
         
        if(new_id.length() > 3) {
        	list.add(new_id);
        	for(int i = 0; i < list.size(); i++) {
        		
        		list.get(i).toLowerCase();
        		
        		if(list.get(i).equals("0") 
        				&& list.get(i).equals("1")
        				&& list.get(i).equals("2")
        				&& list.get(i).equals("3")
        				&& list.get(i).equals("4")
        				&& list.get(i).equals("5")
        				&& list.get(i).equals("6")
        				&& list.get(i).equals("7")
        				&& list.get(i).equals("8")
        				&& list.get(i).equals("9")
        				&& list.get(i).equals("-")
        				&& list.get(i).equals("_")
        				&& list.get(i).equals(".")
        				) {
        			list.set(i, list.get(i));
        		}else {
        			list.remove(i);
        		}
        		if(list.get(i).contains(end) == list.get(i+1).contains(end)) {
        			list.remove(i+1);
        		}
        		
        		if(list.get(0).contains(".") || list.get(list.size()-1).contains(".")) {
        			list.remove(".");
        		}
        		
        		if(list.isEmpty()) {
        			list.add("a");
        		}
        		
        		if(list.size() > 15) {
        			list.subList(0, 15);
        				if(list.get(list.size()-1).contains(end)) {
        					list.remove(end);
        				}
        			}
        		
        		new_id = list.get(i);
        		}
        		
        	}else {
        		new_id += new_id.charAt(new_id.length()-1);
        	}
        	answer = new_id;
        
        return answer;
    }
}
