package algorithm_study.week1;
import java.util.*;

/*
* 못풀어서 풀이봄(https://programmers.co.kr/questions/19755)
*/

public class programmers_12899 {
	

	    public String solution(int n) {
	        String answer = "";
	        
	        int target = n;
	        StringBuilder sb = new StringBuilder();
	        
	        if(n > 3){
	           while(target > 3){
	                int[] rs = divide(target);
	                sb.insert(0, rs[1]);
	                if(rs[0] <= 3){
	                    if(rs[0] == 3) sb.insert(0, rs[0]+1);
	                    else sb.insert(0,rs[0]);
	                    
	                }
	                target = rs[0];
	            }
	         
	        }else{            
	            sb.insert(0, (n==3)?4:n);            
	        }
	        
	        return sb.toString();
	    }
	    
	    public static int[] divide(int target){
	        int mok = 0;
	        int nameoji = 0;
	        if(target%3 == 0){      
	            mok= (target/3)-1;
	            nameoji = target - (3 * mok);
	        }else {
	            mok = target/3;
	            nameoji = target%3;
	        }
	        if(nameoji == 3) nameoji++;
	        return new int[]{mok, nameoji};
	    }
	
}




