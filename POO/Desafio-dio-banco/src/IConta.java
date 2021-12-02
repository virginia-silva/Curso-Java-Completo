
public interface IConta {
	
	//classe abstrata com m�todos abstratos, ela n�o deixa ter corpo, somente a assinatura de m�todos que a classe tem que respitar.
	//n�o a necessidade de colocar publico., � uma redund�ncia.
	

	void sacar(double valor);
	
	void depositar(double valor);
	
	void transferir(IConta contaDestino, double valor);
	
	void imprimirExtrato();
}
