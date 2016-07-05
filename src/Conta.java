
public class Conta {
	
	private Cliente c;
	private String conta;
	private float saldo;
	
	public Conta (Cliente c, String conta){
		this.c = c;
		this.conta = conta;
	}

	public Cliente getC() {
		return c;
	}

	public void setC(Cliente c) {
		this.c = c;
	}

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public float getSaldo() {
		return saldo;
	}
	
	public void sacar(float valor){
		this.saldo = this.saldo-valor;
		
	}

	public void depositar(float saldo) {
		this.saldo = this.saldo+saldo;
	}

	
	
}
