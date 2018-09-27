
public abstract class Conta {

	
	public void sacar(double valor) {}
	public void depositar(double valor) {}
	public void transferir(double valor, Conta conta) {}
	
	protected abstract double getSaldo();
	protected abstract double setSaldo(double valor);
	protected abstract void gerarTaxa();
}
