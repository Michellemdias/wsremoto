package repeticao;

import javax.swing.JOptionPane;

public class ExemploWhile {

	public static void main(String[] args) {
		String email = JOptionPane.showInputDialog("Digite um email:").toLowerCase();
		while (email.contains("@") == false) {
			email = JOptionPane.showInputDialog("Digite um email válido").toLowerCase();
		}

		//pedir um nome com mais de 5 caracteres e menos que 10
		
		String nome = JOptionPane.showInputDialog("Digite um nome:");
		while (nome.length()<=5 || nome.length()>10) {
			nome = JOptionPane.showInputDialog("Digite nome valido");
		}
		
		System.out.println("Nome" + nome);
		System.out.println("email" + email);
		
	}

}
