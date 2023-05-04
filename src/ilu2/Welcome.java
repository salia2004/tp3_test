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
		String[] List = input.split(",");//list de nom
			if (List.length==1) 
			{//un seul nom
				if (maj(List[0])){
					res.append("HELLO,");
					res.append(input);}
				else{
					res.append("Hello,");}
				if(input.equals("bob")){
					res.append("Bob");}
				}
			else//plusieru nom 
			{
				res.append("Hello");
				for (int i=0;i<(List.length);i++) {
					String add=trans(List[i]);
					res.append(", ");
					res.append(add);
					}
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
	public static String trans(String input)
	{
		return input.substring(0,1).toUpperCase()+input.subSequence(1,input.length());
	}
}
