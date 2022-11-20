package operadoreslogicos;

public class SwitchCase {
	
	public static void main(String[] args) {
		
		// serve para operações concreta
		
		int dia = 7;
		
		switch (dia = 4) {
		
		case 1: 
			System.out.println("Domingo");
			break;
		
		case 2:
			System.out.println("Segunda-feira");
			break;
		case 3:
			System.out.println("Terça-feira");
			break;
		case 4: 
			System.out.println("Quarta-feira");
			break;
		case 5:
			System.out.println("Quinta-feira");
			break;
		case 6:
			System.out.println("Sexta-feira");
			break;
		case 7: 
			System.out.println("Sabado");
		
		
		default:
			throw new IllegalArgumentException("outro dia : " + dia);
		}
		
	}

}
