package repeticao;

import javax.swing.JOptionPane;

public class DesafioDo {

	public static void main(String[] args) {
		/*
		* 1� Parte:
		* Jogador 1: digita um n�mero inteiro
		* Jogador 2: tem que advinhar, eqto ele n�o acertar, a aplica��o fica
		* pedindo para ele digitar um n�mero.
		*
		* 2� Parte
		* Implemente dicas para o Jogador 2, informando se o n�mero que
		* ele tem que advinhar � maior ou menor do que o que ele est� digitando
		*
		* 3� Parte
		* Exiba no final, a qtde de tentativas que foram utilizadas
		* pelo jogador 2 at� que ele advinhasse o n�mero
		* Dica: ter�o que criar uma vari�vel pra contar!!!
		*/
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Numero"));
		int chute = 0;
		int contador = 0;
				
		do {
			chute = Integer.parseInt(JOptionPane.showInputDialog("Advinhe o numero"));
			contador = contador+1;
				if (numero>chute) {
					System.out.println("Chute mais alto");
				} else if (numero<chute) {
					System.out.println("Chute mais baixo");
				}
			
		} while (numero!=chute);
		System.out.println("Parab�ns, voc� acertou o valor " + numero + " com " + contador + " vezes");
		
		
		
			
			
	}

}