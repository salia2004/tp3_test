package ilu2;

public class Welcome {
	
	
	public static String welcome(String input) {
		System.out.println(input.trim());
		StringBuilder res = new StringBuilder();
		res.append("Hello,");
		if(input.equals("bob"))
			res.append("Bob");
		
		if(isempty(input))
		{
			res.append("my friend");
		}
		input = input.trim().replaceAll("\\s+", " ");
		return res.toString();
	}
	
	/*private static boolean iscar(String car)
	{
		boolean res=false;
		if((car.equals(" "))||(car.equals(null)))
		{
			res=true;
		}
		return res;
	}*/
	public static boolean isempty(String input) {
		boolean res=false;
		if (input.equals(" ") || input==null || input.equals("  ")) {
			res=true;
		}
		return res;
	}
}
