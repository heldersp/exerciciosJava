package fundamentos;

public class NotacaoPonto 
{
	public static void main(String[] args) 
	{
		String s = "vai vai vai vai";
		s = s.replace("a", "parangarico");
		s = s.toUpperCase();
		s = s.concat("!!!");
		
		System.out.println(s);
	}

}
