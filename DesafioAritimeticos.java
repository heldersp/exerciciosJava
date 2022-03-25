package fundamentos;

public class DesafioAritimeticos 
{
	public static void main(String[] args) 
	{
		int resultado;
		int form1;
		int form2;
		int form3;
		int form4;
		int a = (3 + 2);
		int b = 6;
		int ab = (a * b); 
		int c = (3 * 2);
		int d = (1 - 5);
		int e = (2 - 7);
		int f = 2;
		int def = (d * e) / f;
		int g = 10;
		
		
		form1 = (int) Math.pow(ab, 2) / c; 
		form2 = (int) Math.pow(def, 2);
		form3 =  form1 - form2;
		form4 = (int) Math.pow(form3, 3);
		
		resultado = form4 / (int) Math.pow(g, 3);
		
		System.out.println(resultado);
	}
}
