package operadoreslogicos;

import javax.swing.JOptionPane;

public class EntradaDados {
	
	public static void main(String[] args) {
		
		String carro = JOptionPane.showInputDialog("quantidade de corros");
		String pessoa = JOptionPane.showInputDialog("quantos pessoas");
		
		double carros = Double.parseDouble(carro);
		double pessoas = Double.parseDouble(pessoa);
		
		int divisao = (int)  (carros / pessoas);
		
		double resto = carros % pessoas;
		
		System.out.println("resultado do resto da divisão : " +divisao + "carros que sobrou foi :" + resto);
		
		
	}

}
