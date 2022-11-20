package oprradoreslogicos;

public class CondicaoAninhado {

	public static void main(String[] args) {

		String nome = "mauricio";
		int idade = 25;
		double carteira = 500;
		
		
		if(  idade >= 18 && carteira >=200) {
			if( idade >= 18 && carteira >=300) {
				System.out.println( nome + "  e maior de idade :" + idade +" anos"+ "\n contem na carteira : "+ "R$ "+ carteira +  "\n fazer compras!");
			}else {
				System.out.println( nome + "  e maior de idade :" + idade + " anos"+"\n contem na carteira : "+ "R$ "+ carteira +  "\n  nao pode fazer compras!");
			}
		}else {
			System.out.println(  nome + "  e menor de idade :" + " idade: "+ idade  + " anos" );
		}

		
	}

}
