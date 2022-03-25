package fundamentos;

// converter temperatura de ºF para ºC: (F + 32) * 5/9 = C;
public class ConversaoTemperatura 
{
	public static void main(String[] args) 
	{
		double F = 0;
		final double x = 32;
		final double y = 5.0/9.0;
		double C = (F - x) * y;
		
		System.out.println("A conversão de " + F + "°F" + " é: " + C + "°C");
	}
}
