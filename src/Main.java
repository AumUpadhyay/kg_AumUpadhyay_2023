import java.util.*;

/**
 * @author Aum Upadhyay
 *
 */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "aac";
		String s2 = "xxz";
		System.out.println(isOneToOne(s1, s2));

	}

	/**
	 * Tests for One-To-One Mapping by storing mappings in an array since the
	 * relationship is bidirectional, so hash-based data structures are unnecessary
	 * and arrays increase simplicity of code. Runs in linear time.
	 * 
	 * @param s1 first input string
	 * @param s2 second input string
	 * @return boolean 
	 *
	 */
	private static boolean isOneToOne(String s1, String s2) {

		if (s1.length() != s2.length()) {
			return false;
		}

		int[] charMap = new int[256];
		Arrays.fill(charMap, -1); //-1 is default since it is not used in ascii code

		for (int stringIndex = 0; stringIndex < s1.length(); stringIndex++) {

			char s1Current = s1.charAt(stringIndex);
			char s2Current = s2.charAt(stringIndex);

			if (charMap[s1Current] == -1) {
				if (charMap[s2Current] == -1) {
					//if neither s1 character or s2 character has mapping, a new mapping formed between them
					charMap[s2Current] = s1Current;
					charMap[s1Current] = s2Current;
				} else {
					//if s2 character has mapping, but s1 character doesn't strings cannot be one-to-one
					return false;
				}
			}
		}
		return true;
	}

}
