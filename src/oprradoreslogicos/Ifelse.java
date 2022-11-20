package oprradoreslogicos;

public class Ifelse {
	
	public static void main(String[] args) {
		int nota = 60;
		String nome = "lucas";
		
		
		if(nota >= 70 && nome.equals("lucas")) {
			System.out.println(" Aluno Aprovado");
		}else if(nota < 70) {
			System.out.println(" Aluno Reprvado");
		}else {
			System.out.println("Aluno não encontrado");
		}
		
		
		/*oprador ternario simples 
		 * serve para micros validaçoes*/
		String resultado = nota >= 70 ? "aluno aprovado" : "aluno reprovado";
		System.out.println(resultado);
		
	}
	

}
