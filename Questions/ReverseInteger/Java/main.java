import java.lang.StringBuilder;

public class main {

	public static void main(String[] args){
	    int x=120;
	    System.out.println(reverseInteger(x));
	}

	public static int reverseInteger(int x) {
	    String inputs = Integer.toString(x);
		String reverseInputs = new StringBuilder(inputs).reverse().toString();
		char lastChar = reverseInputs.charAt(inputs.length() - 1);
		if(lastChar == '-') {
			reverseInputs = "-" + reverseInputs;
			reverseInputs = reverseInputs.substring(0, reverseInputs.length() - 1);
		}

		int output = Integer.parseInt(reverseInputs);
	    return output;
	}

	public static int reverseInteger2(int x) {
		int reversed = 0;
		while (x != 0) {
			int digit = x % 10;
			x /= 10;
			if (reversed > Integer.MAX_VALUE / 10 || reversed < Integer.MIN_VALUE / 10) {
				return 0;
			}
			reversed = reversed * 10 + digit;
		}
		return reversed;
	}
}
