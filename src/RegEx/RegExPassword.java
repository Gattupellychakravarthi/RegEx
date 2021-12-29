package RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExPassword {
	public static void main(String[] args) {
		Pattern p = Pattern.compile(".");
		Matcher m = p.matcher("abcAFC123&^%hdjDD");

		while (m.find()) {
			System.out.println(m.start() + " " + m.end() + " " + m.group());
		}
	}

}
