package decisao;

import javax.swing.JOptionPane;

public class DesafioEncadeada {

	public static void main(String[] args) {
		/*
		 * Acrescente uma captura de dado, perguntando ao usu�rio se � alfabetizado (1) ou n�o (0)
		 * Se n�o for alfabetizado n�o vota
		 */
		String nome = JOptionPane.showInputDialog("Nome:").toUpperCase();

		byte alfabetizado = Byte.parseByte(JOptionPane.showInputDialog("Voc� � alfabetizado? Use 1 para Sim e 0 para N�o"));
		if (alfabetizado == 1) {

			int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade:")); // poderia usar o short ao inv�s do int

			if (idade > 70 || idade == 16 || idade == 17) {
				System.out.println(nome + " voto facultativo");
			}else if (idade >=18 && idade <=70) {
				System.out.println(nome + " seu voto � obrigat�rio");
			}else {
				System.out.println(nome + " n�o pode votar");
			}
		} else {
			System.out.println("Voc� n�o vota");
		}

	}



}
