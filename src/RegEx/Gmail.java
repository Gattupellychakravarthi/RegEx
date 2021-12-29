package RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Gmail {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("[a-zA-Z0-9]+[a-zA-Z0-9\\W*][gmail.com]");
		Matcher m = p.matcher("chakravarthigattupelly@gmail.com");
		if (m.find() && m.group().equals("chakravarthigattupelly@gmail.coms")) {
			System.out.println("Gmail is matching");
		} else {
			System.out.println("Gmail is not matching");
		}
	}

}
