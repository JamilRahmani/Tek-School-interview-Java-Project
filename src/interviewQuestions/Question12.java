package interviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class Question12 {

	
	public static void main(String[] args) {
		
		System.out.println(fibNumbers(50));
		
	}
	
	
	public static List<Integer> fibNumbers(int end) {
		List<Integer> fibNum = new ArrayList<Integer>();
		fibNum.add(0);
		fibNum.add(1);
		
		for (int i = 0; true; i++) {
			if(i>= end) {
				break;
			}
			fibNum.add(fibNum.get(fibNum.size()-1) +  fibNum.get(fibNum.size()-2));
		}
		
		
		return fibNum;
	}
}
