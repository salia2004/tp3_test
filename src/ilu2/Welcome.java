package ilu2;

public class Welcome {
	
	
	public static String welcome(String input) {
		StringBuilder res = new StringBuilder();
		res.append("Hello,");
		if(input.equals("bob"))
			res.append("Bob");
		return res.toString();
	}
}
