package decisao;

import javax.swing.JOptionPane;

public class DesafioSimples {

	public static void main(String[] args) {
		// Capturar o nome e a idade 
		// idade maior que 70, 16 ou 17 ele � facultativo
		// idade entre 18 e 70 � obrigatorio
		// idade for menor que 16 n�o pode votar

		String nome = JOptionPane.showInputDialog("Nome:").toUpperCase();
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade:")); // poderia usar o short ao inv�s do int
		
		if (idade > 70 || idade == 16 || idade == 17) {
			System.out.println(nome + " voto facultativo");
		}
		
		if (idade >=18 && idade <=70) {
			System.out.println(nome + " seu voto � obrigat�rio");
		}
		
		if (idade < 16) {
			System.out.println(nome + " n�o pode votar");
		}
		
		
	}
	
	

}
