
public interface IConta {
	
	//classe abstrata com métodos abstratos, ela não deixa ter corpo, somente a assinatura de métodos que a classe tem que respitar.
	//não a necessidade de colocar publico., é uma redundância.
	

	void sacar(double valor);
	
	void depositar(double valor);
	
	void transferir(IConta contaDestino, double valor);
	
	void imprimirExtrato();
}
