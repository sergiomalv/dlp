package parser;


public class LexerHelper {
	
	public static int lexemeToInt(String str) {
		try {
			return Integer.parseInt(str);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		return -1;
	}

	public static double lexemeToReal(String str){
		try{
			return Double.parseDouble(str);
		} catch (NumberFormatException e){
			System.out.println(e);
		}
		return -1;
	}

	public static char lexemeToChar(String str){
		char c = 9999;
		try {
			c = numberFormat(str);
		} catch(NumberFormatException e) {
			c = stringFormat(str);
		}
		return c;
	}

	private static char numberFormat(String str) {
		int value = Integer.parseInt(str.substring(2, str.length() - 1));
		return (char) value;
	}

	private static char stringFormat(String str) {
		if ("'\\n'".equals(str)) {
			return '\n';
		}
		if ("'\\t'".equals(str)) {
			return '\t';
		} else {
			return str.charAt(1);
		}
	}
}
