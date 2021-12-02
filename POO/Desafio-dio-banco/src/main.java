
public class main {

	public static void main(String[] args) {
		
		IConta cc = new ContaCorrente();
		IConta poupanca = new ContaPoupanca();
		
		cc.depositar(100);
		cc.transferir(poupanca, 100);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
