package RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class degitsmobilenumber {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("(0|91)?[6-9][0-9]{9}");
		Matcher m = p.matcher("08341373291");
		if(m.find() && m.group().equals("08341373291")) {
			System.out.println("mobile number is matching");
		}else {
			System.out.println("mobile number is not matching");
		}
	}

}
