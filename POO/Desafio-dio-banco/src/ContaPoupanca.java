
public class ContaPoupanca extends conta{

	@Override
	public void imprimirExtrato() {
		System.out.println("Extrato Conta poupanca");
		super.imprimirInformacoesComuns();
		
	}
	
}
