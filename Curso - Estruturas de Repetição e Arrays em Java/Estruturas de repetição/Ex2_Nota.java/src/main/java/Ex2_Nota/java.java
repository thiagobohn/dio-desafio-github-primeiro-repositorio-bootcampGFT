/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex2_Nota;

import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class java {

    /**
     * @param args the command line arguments
     */
    /*
    Faça um programa que peça uma nota, entre zero e dez.
    Mostre uma mensagem caso o valor seja inválido
    e continue pedindo
    até que o usuário informe um valor válido.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //criando o objeto da classe scanner
        
        int nota;//declara a variável que recebe a nota fornecida pelo usuário
        
        //Bloco para receber a nota do usuário
        System.out.println("Nota:");
        nota = sc.nextInt();
        
        //Laço criado para garantir que o usuário entre com um valor válido para a nota (entre 0 e 10)
        while (nota>10 || nota<0){
            //Informa ao usuário que a nota fornecida não possui um valor válido e solicita novamente ao usuário a nota
            System.out.println("Nota inválida!\nEntre com uma nota válida (entre 0 e 10).\nNota");
            nota = sc.nextInt();
        }
        
        //Adicionada uma saída informando que a nota foi adicionada corretamente
        System.out.println("Nota adicionada!");
    }

}
