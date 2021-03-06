package variaveis;

public class Tipos {

	public static void main(String[] args) {
		// sintaxe: <tipo do dado> <nome da variavel/objeto>;
		// Tipo n�merico -> int (inteiro) ou double (casa decimal) , Tipo Alfanumerico  -> String
		
		String nome = "Michelle Dias";
		int idade = 42;
		double altura = 1.57;
		double peso = 59.00;
		
		
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
	
		/*
		 * Identificador (nome de classe, nome de metodo, nome de variavel)
		 * Regras:
		 * 1�) N�o come�aras com n�meros
		 * 2�) N�o utilizar�s palavras reservadas da linguagem, exemplo class, int, if...
		 * 3�) N�o far�s uso de caracteres especiais no nome das variaveis. Ex: @ , ^...
		 * 
		 * Padr�es:
		 * 1�) Nomes significativos
		 * 2�) Utilizar o padr�o CamelCase. Correto: dataDeNascimento ou data_de_nascimento. Errado: datadenascimento
		 * 3�) Respeite as caixas e os padr�es dos recursos: 
		 * Classe: SEMPRE come�a com letra maiscula
		 * Varivavel: Sempre come�a com letra minuscula (substantivo)
		 * M�todo: Sempre come�a com letra minuscula e � seguido de parenteses (verbo)
		 * 	
		 * 
		 */
	
	
	
	} // fechando m�todo
	

} // fechando classe
