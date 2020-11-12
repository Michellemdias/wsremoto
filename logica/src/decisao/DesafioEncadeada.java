package decisao;

import javax.swing.JOptionPane;

public class DesafioEncadeada {

	public static void main(String[] args) {
		/*
		 * Acrescente uma captura de dado, perguntando ao usuário se é alfabetizado (1) ou não (0)
		 * Se não for alfabetizado não vota
		 */
		String nome = JOptionPane.showInputDialog("Nome:").toUpperCase();

		byte alfabetizado = Byte.parseByte(JOptionPane.showInputDialog("Você é alfabetizado? Use 1 para Sim e 0 para Não"));
		if (alfabetizado == 1) {

			int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade:")); // poderia usar o short ao invés do int

			if (idade > 70 || idade == 16 || idade == 17) {
				System.out.println(nome + " voto facultativo");
			}else if (idade >=18 && idade <=70) {
				System.out.println(nome + " seu voto é obrigatório");
			}else {
				System.out.println(nome + " não pode votar");
			}
		} else {
			System.out.println("Você não vota");
		}

	}



}
