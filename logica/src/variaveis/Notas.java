package variaveis;

import javax.swing.JOptionPane;

public class Notas {
	/*
	 * Solicitar um nome de aluno e duas notas, calcular a m�dia
	 * exibir uma mensagem para o aluno da seguinte forma:
	 * "Aluno xxxx, sua m�dia obtida foi: xxxx para 10 faltam: xxx pontos"
	 */

	public static void main(String[] args) {
		
		String aluno = JOptionPane.showInputDialog("Qual o nome do aluno: ");
		double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota:"));
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota:"));
		
		double media = (nota1 + nota2) /2;
				
		
		System.out.printf ("Aluno %s, sua m�dia obtida foi: %.2f para 10 faltam %.2f", aluno,media,10-media);
	}

}
