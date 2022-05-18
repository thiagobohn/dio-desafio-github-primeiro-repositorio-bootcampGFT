
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author Thiago
 */
public class Ex5_Tabuada {

    /**
     * @param args the command line arguments
     */
    /*
    Desenvolva um gerador de tabuada,
    capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
    O usuário deve informar de qual numero ele deseja ver a tabuada.
    A saída deve ser conforme o exemplo abaixo:
    Tabuada de 5:
    5 X 1 = 5
    5 X 2 = 10
    ...
    5 X 10 = 50
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in); //criando o objeto da classe scanner

        //declaração das variáveis
        int num, cont = 1;

        //Bloco que recebe do usuário o número que irá gerar a tabuada
        System.out.println("Número: ");
        num = sc.nextInt();

        //laço que gera a tabuada
        do {
            System.out.println(num + " x " + cont + " = " + (num*cont));//imprime cada linha da tabuada
            cont++;//atualiza o contador da estrutura de repetição
        } while (cont < 11);
    }

}
