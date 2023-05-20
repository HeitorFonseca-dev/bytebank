
public class AbrirConta {
	
	
	public static void main(String[] args) {
		Conta contaDoHeitor = new Conta();
		
		contaDoHeitor.titular.nome = "Heitor";
		contaDoHeitor.titular.profissao = "Desenvolvedor";
		

		
		System.out.println(contaDoHeitor.titular.profissao);
		System.out.println(contaDoHeitor.titular.nome);
		System.out.println(contaDoHeitor.getSaldo());
		contaDoHeitor.deposita(500);
		
		contaDoHeitor.saca(99);
		
	
		
	}
	
	
	
}
