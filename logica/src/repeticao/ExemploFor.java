package repeticao;

import javax.swing.JOptionPane;

public class ExemploFor {

	public static void main(String[] args) {
		//Sintaxe do comando for convencional
		// 1� valor que come�a o la�o e variavel que vai contar
		// 2� condi��o (at� quando ele vai contar?)
		// 3� como ele vai contar? de 1 em 1?
		
		byte tabuada = Byte.parseByte(JOptionPane.showInputDialog("Digite um n�mero: "));
		for(int cont=0;cont<11;cont++) {
			System.out.println(tabuada + " x " + cont + " = " + (tabuada*cont));
		}

	}

}
