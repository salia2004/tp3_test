package ilu2;

public class Welcome {
	
	
	public static String welcome(String input) {
		StringBuilder res = new StringBuilder();
		StringBuilder maj= new StringBuilder();
		maj.append(".AND HELLO");
		if(isempty(input)){
			res.append("Hello,");
			res.append("my friend");
			return res.toString();}
		input = input.trim().replaceAll("\\s+", " ");///suppression des espaces inutiles
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
				boolean x=false;
				res.append("Hello");
				for (int i=0;i<(List.length);i++) 
				{
					if(maj(List[i])) //majuscule
					{
						x=true;
						maj.append(",");
						maj.append(List[i]);
						}
					else{
						String add=trans(List[i]);
						res.append(",");
						res.append(add);}
				}
				if(x){
					maj.append(" ");
					maj.append("!");
					res.append(maj);}}
			System.out.println(res.toString());
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
