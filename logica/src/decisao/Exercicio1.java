package decisao;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		// 1. Elabore uma aplica��o que leia o valor de dois n�meros inteiros e a opera��o aritm�tica desejada (+, -, * ou /);
		//calcule, ent�o, a resposta adequada.
		//Se optar por uma divis�o, leve em considera��o que n�o podemos ter um n�mero dividido por zero.

		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero 1:")) ;
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero 2:")) ;
		String operacao = JOptionPane.showInputDialog("Digite a opera��o desejada:").toUpperCase();
	

		if (operacao.equals("+") ) {
			System.out.println("A soma �: " + (numero1+numero2));
		} else if (operacao.equals("-")) {
			System.out.println("A subtra��o �: " + (numero1-numero2));
		} else if  (operacao.equals ("*")) {
			System.out.println("A multiplica��o �: " + (numero1*numero2));
		} else if (operacao.equals("/")) {
			if (numero2!=0) {
				System.out.println("A divis�o �: " + (numero1/numero2));
			}else {
				System.out.println("O segundo valor n�o pode ser zero");
			}
		} else {
			System.out.println("Dgite um operador v�lido");
		}







	}

}
