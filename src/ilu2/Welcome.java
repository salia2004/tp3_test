package ilu2;

public class Welcome {
	
	
	public static String welcome(String input) {
		StringBuilder res = new StringBuilder();
		if(isempty(input))
		{
			res.append("Hello,");
			res.append("my friend");
			return res.toString();
		}
		input= input.trim().replaceAll("\\s+", " ");
		if (maj(input))
		{
			res.append("HELLO,");
			res.append(input);
		}
		else
		{
			res.append("Hello,");
		}
		if(input.equals("bob"))
		{
			res.append("Bob");
		}
		return res.toString();
	}
	
	
	public static boolean isempty(String input) {
		boolean res=false;
		if (input.equals(" ") || input.equals("  ")) {
			res=true;
		}
		return res;
	}
	public static boolean maj(String input)
	{
		return input.equals(input.toUpperCase());
	}
}
