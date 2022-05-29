
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Thiago
 */
public class Banco {

    private String nome;
    private List<Conta> contas = new ArrayList<>();

    public Banco(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //Método desenvolvido para adicionar a conta criada à lista das contas
    public void criaNovaConta(Conta conta) {
        this.contas.add(conta);
    }

    public void listaNomeClientes() {
    Iterator<Conta> iterator = this.contas.iterator();
        while(iterator.hasNext()){//verifica se existe mais um elemento
            System.out.println(iterator.next().cliente.getNome());
        }
    }
    
    public void listaCPFClientes() {
    Iterator<Conta> iterator = this.contas.iterator();
        while(iterator.hasNext()){//verifica se existe mais um elemento
            System.out.println(iterator.next().cliente.getCPF());
        }
    }
    
    public void encerraConta(Conta conta){
        this.contas.remove(conta);
    }
}
