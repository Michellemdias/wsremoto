package variaveis;

public class ManipulaString {

	public static void main(String[] args) {
		
		String email = "xpTo@itAu.Com.Br";
		System.out.println("Original: " + email);
		System.out.println("Minuscula: " + email.toLowerCase());
		System.out.println("Maiuscula: " + email.toUpperCase());
		
		System.out.println("Qtde de caracteres: " + email.length());
		System.out.println("Tem arroba? " + email.contains("@"));
		System.out.println("Posicao do @: " + email.indexOf("@") );
		System.out.println("Do 2� ao 4�: " + email.substring(1,5));
		
		// primeira metade do email
		System.out.println("Primeira metade do email: " + email.substring(0,email.length()/2));
		
		// exibir o usuario do email
		System.out.println("usu�rio do email= " + email.substring(0,email.indexOf("@")));
		
		//exibir o servidor
		System.out.println("Servidor email: " + email.substring(email.indexOf("@")+ 1).toLowerCase());
		
		System.out.println("Compara��o com case sensitive: " + email.equals("xpto@itau.com.br"));
		System.out.println("Compara��o sem case sensitive: " + email.equalsIgnoreCase("xpto@itau.com.br"));
		
	}

}
