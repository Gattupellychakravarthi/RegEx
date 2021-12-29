package RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression1 {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("[a-zA-Z0-9]");

		Matcher m = p.matcher("asABC1235Jg");

		while (m.find()) {
			System.out.println(m.start() + " " + m.group());
		}
	}

}
