package RegEx;

import java.util.regex.Pattern;

public class RegExPatternSplit {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("a");
		String[] s = p.split("TestYantra software Solutions");
		for (String string : s) {
			System.out.println(string);
		}
		

	}

}
