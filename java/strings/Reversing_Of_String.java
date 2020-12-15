// RESOLVE THIS ERROR

package strings;

public class Reversing_Of_String {
	
//	solution works on leetcode 

		public String reverseWords(String s) {
			String ans = "";
			int i = s.length() - 1;
			while (i >= 0) {
				while (i >= 0 && s.charAt(i) == ' ') i--;

				int j = i;
				if (i < 0) break;

				while (i >= 0 && s.charAt(i) != ' ') i--;
				if (ans.isEmpty()) {
					ans = ans.concat(s.substring(i + 1, j + 1));
				} else {
					ans = ans.concat(" " + s.substring(i + 1, j + 1));
				}
			}
			return ans;
		}

	public static void main(String[] args) {
		Reversing_Of_String obj = new Reversing_Of_String();
		System.out.println(obj.reverseWords("vivek is awesome"));

		
	}

}
