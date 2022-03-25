package fundamentos;

public class TiposPrimitivos 
{
	public static void main(String[] args) 
	{
		// informa��es do funcion�rio
		//tipos num�ricos inteiros
		
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_232L;
		
		//tipos numericos reais
		
		float salario = 11_445.4F;
		double vendasAcumuladas = 2_991_797_103.01D;
		
		//tipo booleano
		boolean estaDeFerias = false; //true
		
		//tipo caractere
		char status = 'A'; //ativo
		
		//dias de empresa
		
		System.out.println(anosDeEmpresa * 365);
		
		//numeros de viagem
		System.out.println(numeroDeVoos / 2);
		
		//pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("F�rias? " + estaDeFerias);
		System.out.println("Status: " + status);
	}

}
