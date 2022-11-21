package operadoreslogicos;

import javax.swing.JOptionPane;

public class CalculoMedia {
	
	public static void main(String[] args) {
		
		
		String nota1 = JOptionPane.showInputDialog("Digite a nota  01");
		String nota2 = JOptionPane.showInputDialog("Digite a nota  02");
		String nota3 = JOptionPane.showInputDialog("Digite a nota  03");
		String nota4 = JOptionPane.showInputDialog("Digite a nota  04");
		
		
		double dnota1 = Double.parseDouble(nota1);
		double dnota2 = Double.parseDouble(nota2);
		double dnota3 = Double.parseDouble(nota3);
		double dnota4 = Double.parseDouble(nota4);
		
		
		double media = (dnota1 + dnota2 + dnota3 + dnota4 )/4;
		
		if(media >=50) {
			if(media >= 70) {
				JOptionPane.showMessageDialog(null, "Aluno Aprovado com a media : "+ media);
				
			}else {
				JOptionPane.showMessageDialog(null, "Aluno em Recuperação com a media : "+ media);
			}
		}else {
			JOptionPane.showMessageDialog(null, "Aluno Reprovado com a media : "+ media);
		}
		
	}

}
