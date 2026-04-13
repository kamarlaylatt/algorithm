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
}
