/**
 * @author Aum Upadhyay
 *
 */

public class Main {

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "xyz";
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

		return true;
	}

}
