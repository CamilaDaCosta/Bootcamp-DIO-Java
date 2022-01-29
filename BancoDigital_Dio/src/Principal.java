import entity.Cliente;
import entity.Conta;
import entity.ContaCorrente;
import entity.ContaPoupanca;

public class Principal {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Camila");

        Conta corrente = new ContaCorrente(cliente);
        Conta poupanca = new ContaPoupanca(cliente);

        corrente.depositar(129);
        corrente.transferir(100, poupanca);

        corrente.extrato();
        poupanca.extrato();
    }
}
