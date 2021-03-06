package decisao;

import javax.swing.JOptionPane;

public class DesafioComposta {

	public static void main(String[] args) {
		/*
		 * Solicite o nome de um produto e qtde em estoque
		 * Se a qtde estiver entre 20 e 40 deve retornar "estoque normal"
		 * Se a qtde estiver entre 41 e 60 deve retornar "estoque alto"
		 * Se a qtde for maior que 60 deve retornar estoque lotado
		 * Se a qtde for menor que 20 deve retornar estoque baixo
		 */

		
		String nome = JOptionPane.showInputDialog("Produto").toUpperCase();
		int estoque = Integer.parseInt(JOptionPane.showInputDialog("Quantidade estoque"));
		
		if (estoque < 20) {
			System.out.println(nome + " Estoque baixo");
		} else if (estoque >= 20 && estoque <=40) {
			System.out.println(nome + " Estoque normal");
		} else if (estoque > 60) {
			System.out.println(nome + " Estoque lotado");
		} else {
			System.out.println(nome + " Estoque alto");
		}
	}

}
