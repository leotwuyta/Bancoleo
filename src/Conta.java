public class Conta {
	double saldo;
	int agencia;
	int numero;
	String nome;

	public void deposita(double valor) {
		this.saldo+=valor;
	}

}
