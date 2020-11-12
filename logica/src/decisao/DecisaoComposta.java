package decisao;

import javax.swing.JOptionPane;

public class DecisaoComposta {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Aluno:").toUpperCase();
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota1:"));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota2:"));
		float media = (nota1+nota2)/2;
		
	
		if (media >= 6) {
			System.out.println("Parabéns " + nome + " você está aprovado!");
		} else if (media < 4) {
			System.out.println("Infelizmente " + nome + " você foi Reprovado!");
		} else {
			System.out.println(nome + " você está de exame");
		}
		
		System.out.println("Sua média foi: " + media);
		
		
		
		
		
		

	}//fecha o metodo

}// fecha a classe
