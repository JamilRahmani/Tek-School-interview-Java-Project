package interviewQuestions;


public class ttt {
	public static void main(String[] args) {
		String s = " Ali is a tester";
		System.out.println(revWords(s));
	}
	public static String revWords(String str) {
		String[] word = str.split("");
		String rev = "";
		for (int i = word.length - 1; i >= 0; i--) {
			rev += word[i];
			
			
		}
		return rev;
	}
}
