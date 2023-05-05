package ilu2;

public class Welcome {
	
	
	public static String welcome(String input) 
	{
		StringBuilder res = new StringBuilder();
		StringBuilder maj= new StringBuilder();
		maj.append(".AND HELLO");
		res.append("Hello");
		if(isempty(input))
		{ 
			res.append(", my friend");
		}
		else{
			input=input.trim().replaceAll("\\s+", "");
			String[] List = input.split(",");//list de nom
			if (List.length==1) 
			{
				if (maj(List[0]))
				{
					res.replace(0, 5,"HELLO,");
					res.append(input);
					res.append(" !");
				}
				else
				{
					res.append(",");
					res.append(trans(List[0]));}
			}
			else
			{
				if(ismay(List))//si il y a des majuscule
				{
					int nbmaj=comptemaj(List);
					String derniermaj =null;
					String derniermin=null;
					int nbmin=List.length-nbmaj;
					System.out.println(nbmaj);
					System.out.println(nbmin);
					for (int i=0;i<(List.length);i++) 
					{
						if(maj(List[i]))
						{
							if(nbmaj!=1)
							{
								maj.append(",");
								maj.append(List[i]);
								nbmaj--;
							}
							else
							{
								derniermaj=List[i];
							}
						}
						else
						{
							if(nbmin!=1)
							{
								String add=trans(List[i]);
								res.append(",");
								res.append(add);
								nbmin--;
							}
							else
							{
								derniermin=List[i];
							}
						}
					}
					maj.append(" AND ");
					maj.append(derniermaj);
					maj.append(" !");
					res.append(" and ");
					res.append(trans(derniermin));
					res.append(maj);
				}
				else//il n'y a pas de majuscule 
				{
					if(List.length==2)//cas 4 2 nom 
					{
						for (int i=0;i<(List.length);i++) 
						{
								String add=trans(List[i]);
								res.append(",");
								res.append(add);
						}
					}
					else//cas pas de maj et plus que deux 
					{
						for (int i=0;i<(List.length)-1;i++) 
						{
								String add=trans(List[i]);
								res.append(",");
								res.append(add);
						}
						res.append(" and ");
						res.append(trans(List[(List.length)-1]));
					}
				}
			}//fin petit else
		}//fin grand else 
		System.out.println(res.toString());
		return res.toString();
	}
	
	
	public static boolean isempty(String input) {
		String x=input.trim().replaceAll("\\s+", "");
		return x=="";
	}
	public static boolean maj(String input)
	{
		return input.equals(input.toUpperCase());
	}
	public static String trans(String input)
	{
		System.out.println(input);
		return input.substring(0,1).toUpperCase()+input.subSequence(1,input.length());
	}
	
	public static boolean ismay(String[] list)
	{
		boolean x=false;
		for (int i=0;i<(list.length);i++) 
		{
			if(maj(list[i]))
			{
				x=true;
			}
		}
		return x;
	}
	public static int comptemaj(String[] l)
	{
		int x=0;
		for (int i=0;i<(l.length);i++) 
		{
			if(maj(l[i])){
				x++;
			}}
	return x;
	}
}
