package estudos;

public class JavaAnatomiaClasses {

	public static void main (String [] args) {	
	
	String primeiroNome = "Ermesson";
	String segundoNome = "Lima";
	
	String nomeCompleto = nomeCompleto (primeiroNome,segundoNome);
	System.out.println(nomeCompleto);
	
	}

	
	public static String nomeCompleto (String primeiroNome, String segundoNome) {
		return primeiroNome.concat(" ").concat(segundoNome);
	}
	
}
