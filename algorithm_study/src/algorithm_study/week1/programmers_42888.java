package algorithm_study.week1;

import java.util.*;

/*
* 1. record를 한번 돌면서 유저아이디당 최종 닉네임 확인. 
* 2. record를 다시 한번 돌면서 answer에 들어갈 액션 저장
*/

public class programmers_42888 {
	
	 public String[] solution(String[] record) {
	       
	        
	        HashMap<String, String> userInfo = new HashMap<>();                                             //유저별 닉네임 정보 map
	        ArrayList<String> action = new ArrayList<>();                                                   //채팅방 액션 list 
	        
	        /* 1 */
	        for(String s: record){
	            String[] split = s.split(" ");
	            if(!"Leave".equals(split[0])){
	                if(userInfo.containsKey(split[1])) {
	                    if(!split[2].equals(userInfo.get(split[1])))userInfo.replace(split[1], split[2]);   //닉네임 바꼈을 때
	                }
	                else userInfo.put(split[1], split[2]);                                                  //새로 들어왔을 때
	            }
	            
	        }
	        
	        
	        /* 2 */
	        for(String s: record){
	            String[] split = s.split(" ");
	            switch(split[0]){
	                case "Enter":
	                    action.add(userInfo.get(split[1])+"님이 들어왔습니다.");
	                    break;
	                case "Leave":
	                    action.add(userInfo.get(split[1])+"님이 나갔습니다.");
	                    break;
	                default:
	                    break;
	            }
	        }
	        String[] answer = new String[action.size()];
	        action.toArray(answer);
	        
	        return answer;
	    }
}


