/**
 *
 * @author Thiago
 */
public class DesafioBanco {

    
    public static void main(String[] args) {
        
        Banco banco = new Banco("B2");//cria o banco
        //cria alguns clientes
        Cliente c1 = new Cliente("Joao", 55555);
        Cliente c2 = new Cliente("Maria", 44444);
        Cliente c3 = new Cliente("Antenor", 66666);
        Cliente c4 = new Cliente("Josefina", 77777);
        
        Conta cc1 = new ContaCorrente(c1);
        banco.criaNovaConta(cc1);
        Conta cp1 = new ContaPoupanca(c2);
        banco.criaNovaConta(cp1);
        Conta cc2 = new ContaCorrente(c3);
        banco.criaNovaConta(cc2);
        Conta cp2 = new ContaPoupanca(c4);
        banco.criaNovaConta(cp2);
        
        //executa algumas operações
        cc1.depositar(100);
        cc1.transferir(100, cp1);
        cp1.sacar(50);
        
        //Imprime o extrato de dois clientes
        cc1.imprimirExtrato();
        cp1.imprimirExtrato();
        
        //Imprime o CPF dos clientes
        System.out.println("=== Nome dos clientes do banco ===");
        banco.listaNomeClientes();
        
        //Imprime o CPF dos clientes
        System.out.println("=== CPF dos clientes do banco ===");
        banco.listaCPFClientes();
        
        //Procedimento para encerrar uma conta
        banco.encerraConta(cp2);
        cp2 = null;
        
        System.out.println("=== Nome dos clientes do banco ===");
        banco.listaNomeClientes();
    }
}
