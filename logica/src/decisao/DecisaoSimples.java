package decisao;

import javax.swing.JOptionPane;

public class DecisaoSimples {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Aluno:").toUpperCase();
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota1:"));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota2:"));
		float media = (nota1+nota2)/2;
		
		// Operadores relacionais 
		// != (n�o igual)
		// == (igual)
		if (media >= 6) {
			System.out.println("Parab�ns " + nome + " voc� est� aprovado!");
			
		}
	
		
		if (media < 4) {
			System.out.println("Infelizmente " + nome + " voc� foi Reprovado!");
		}
		
		//Operadores l�gicos
		// && (and)
		// || (or)
		if (media >= 4  && media < 6) {
			System.out.println(nome + " voc� est� de exame");
		}
		
		System.out.println("Sua m�dia foi: " + media);
		
		
		
		
		
		

	}//fecha o metodo

}// fecha a classe