package variaveis;

import javax.swing.JOptionPane;

public class Entrada {

	public static void main(String[] args) {
		 // classe JOptionPane representa a tela de imput.
		// showInputDialog � um m�todo
		
		// Tipo referencia : quando o tipo se refere a uma classe
		String nome = JOptionPane.showInputDialog("Digite seu nome:");
		// tipo primitivo come�a com letra minuscula, j� pertence a liguagem. Ex: int
		// tipo primitivo precisa de apoio. Esse apoio vem das classes "Wrappers"
		// int = integer
		// double = Double
		
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade:"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura:"));
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso:"));
		
		
		System.out.println ("Nome: " + nome);
		System.out.println ("Idade: " + idade + " anos");
		System.out.println("Altura: " + altura + " metros");	
		System.out.println("Peso: " + peso + " kilos");
		
		
		double imc = peso / (altura * altura);
		
		// /n � um quebra linha
		// No printf() usamos:
		// %s => para String
		// %f => para n�meros reais
		// %d => para n�meros inteiros
		System.out.printf ("IMC calculado: %.2f\n\n" , imc);
		System.out.printf ("%s seu imc �: %.2f\n", nome, imc);
	
	
	
	
	} // fechando m�todo
	

} // fechando classe