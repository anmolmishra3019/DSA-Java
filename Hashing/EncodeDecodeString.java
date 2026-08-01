import java.util.*;

public class EncodeDecodeString {

	// Encode
	public static String encode(List<String> strs) {

		StringBuilder sb = new StringBuilder();

		for (String str : strs) {
			sb.append(str.length());
			sb.append('#');
			sb.append(str);
		}

		return sb.toString();
	}

	// Decode
	public static List<String> decode(String s) {

		List<String> result = new ArrayList<>();

		int i = 0;

		while (i < s.length()) {

			int j = i;

			// Find '#'
			while (s.charAt(j) != '#') {
				j++;
			}

			// Get length
			int length = Integer.parseInt(s.substring(i, j));

			// Extract original string
			String str = s.substring(j + 1, j + 1 + length);

			result.add(str);

			// Move to next encoded string
			i = j + 1 + length;
		}

		return result;
	}

	public static void main(String[] args) {

		List<String> input = new ArrayList<>();

		input.add("neet");
		input.add("code");
		input.add("love");
		input.add("you");
		input.add("");
		input.add("ab#cd");

		System.out.println("Original List:");
		System.out.println(input);

		String encoded = encode(input);

		System.out.println("\nEncoded String:");
		System.out.println(encoded);

		List<String> decoded = decode(encoded);

		System.out.println("\nDecoded List:");
		System.out.println(decoded);
	}
}