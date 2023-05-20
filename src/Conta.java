public class Conta{
	
	private double saldo;
	private int agencia;
	int numero;
	Cliente titular = new Cliente();
	
	public void deposita(double valor) {
		
		this.saldo = saldo + valor;
	}
	
	public boolean saca(double valor){
		if(this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("Seu novo saldo e R$ " + saldo);
			return true;
		}else {
			System.out.println("Saldo insuficiente");
			return false;
		}
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public double getAgencia() {
		return this.agencia;
	}
		
}