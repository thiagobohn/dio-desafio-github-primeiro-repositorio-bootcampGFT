
import java.util.Scanner;

/**
 *
 * @author Thiago
 */

/*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
 */
public class Ex1_NomeEIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //criando o objeto da classe scanner

        //Criando as variávei nome e idade conforme definição do problema
        String nome;
        int idade;

        //criação do laço de repetição para ler nome e idade indefinidamente
        while (true) { 
            //Bloco para ler o nome digitado pelo usuário
            System.out.println("Nome: ");
            nome = sc.next();
            
            if ("0".equals(nome))//implementa a condição de parada do laço conforme definição do problema
                break;
            
            //Bloco para ler a idade digitada pelo usuário
            System.out.println("Idade: ");
            idade = sc.nextInt();
        }
        
        //adicionada uma saída para indicar que o programa saiu corretamente do laço de repetição
        System.out.println("Fim do laço");

    }

}
