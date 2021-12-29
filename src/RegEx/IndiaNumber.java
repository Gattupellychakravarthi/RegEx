package RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IndiaNumber {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("91?[6-9][0-9]{9}");
		Matcher m = p.matcher("918341373291");
		if (m.find() && m.group().equals("918341373291")) {
			System.out.println("mobile number is matching");
		} else {
			System.out.println("mobile number is not matching");
		}
	}
}
